package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Request {
	
	public Map<String, String> toMap() {
		Map<String, String> retParametersMap = new HashMap<String, String>();

		Map<String, Object> objectAsMap = new HashMap<String, Object>();
		try {
			BeanInfo info = Introspector.getBeanInfo(this.getClass());
			for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
				Method reader = pd.getReadMethod();
				if (reader != null)
					objectAsMap.put(pd.getName(), reader.invoke(this));
			}
			objectAsMap.remove("class");
		} catch (Exception e) {
			e.printStackTrace();
		} 

		for (Map.Entry<String, Object> entry : objectAsMap.entrySet()) {
			String key = entry.getKey();
			Object objValue = entry.getValue();
			if (objValue instanceof List) {
				//This part require to deal with customized data type
				List<String> strValues = (ArrayList<String>) objValue;
				int count = 1;
				for (String strValue : strValues) {
					retParametersMap.put(String.format("%s.%s", key, count),
							strValue);
					count++;
				}
			} else if (objValue instanceof Integer) {
				retParametersMap.put(key, String.valueOf((Integer) objValue));
			} else if (objValue instanceof String) {
				retParametersMap.put(key, (String) objValue);
			} else {
				if (objValue != null)
					retParametersMap.put(key, objValue.toString());
			}
		}

		return retParametersMap;
	}
}
