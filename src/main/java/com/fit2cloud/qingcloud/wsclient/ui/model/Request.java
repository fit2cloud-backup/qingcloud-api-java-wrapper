package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
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
				@SuppressWarnings("rawtypes")
				List list = (List) objValue;
				for(int i = 0; i < list.size(); i++) {
					Class<? extends Object> cls = list.get(i).getClass();
					if(cls.equals(String.class) || cls.equals(Integer.class) || cls.equals(Double.class) || cls.equals(Long.class) || cls.equals(Float.class)) {
						retParametersMap.put(String.format("%s.%s", key, i), list.get(i).toString());
					}else {
						try {
							BeanInfo info = Introspector.getBeanInfo(list.get(i).getClass());
							for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
								if(pd.getName().equals("class")) {
									continue;
								}
								Method reader = pd.getReadMethod();
								if (reader != null) {
									Object v = reader.invoke(list.get(i));
									if(v != null) {
										retParametersMap.put(String.format("%s.%s.%s", key, i+1, pd.getName()), v.toString());
									}
								}
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
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
