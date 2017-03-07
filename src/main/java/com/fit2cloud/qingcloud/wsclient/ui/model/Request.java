package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.ui.model.annotation.As;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
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
                if (reader != null) {
                    String name = pd.getName();
                    Field field = getAccessibleField(this.getClass(), name);
                    // process as annotation
                    if(field!=null) {
                        As asFieldName = field.getAnnotation(As.class);
                        if (asFieldName != null && !asFieldName.value().equals("")) {
                            name = asFieldName.value();
                        }
                    }
                    objectAsMap.put(name, reader.invoke(this));
                }
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
                for (int i = 0; i < list.size(); i++) {
                    Class<? extends Object> cls = list.get(i).getClass();
                    if (cls.equals(String.class) || cls.equals(Integer.class) || cls.equals(Double.class) || cls.equals(Long.class) || cls.equals(Float.class)) {
                        retParametersMap.put(String.format("%s.%s", key, i), list.get(i).toString());
                    } else {
                        try {
                            BeanInfo info = Introspector.getBeanInfo(list.get(i).getClass());
                            for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
                                if (pd.getName().equals("class")) {
                                    continue;
                                }
                                Method reader = pd.getReadMethod();
                                if (reader != null) {
                                    Object v = reader.invoke(list.get(i));
                                    if (v != null) {
                                        retParametersMap.put(String.format("%s.%s.%s", key, i + 1, pd.getName()), v.toString());
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

    /**
     * 循环向上转型, 获取对象的DeclaredField, 并强制设置为可访问.
     * <p>
     * 如向上转型到Object仍无法找到, 返回null.
     */
    private static Field getAccessibleField(final Class clazz,
                                           final String fieldName) {
        for (Class<?> superClass = clazz; superClass != Object.class; superClass = superClass
                .getSuperclass()) {
            try {
                Field field = superClass.getDeclaredField(fieldName);
                makeAccessible(field);
                return field;
            } catch (NoSuchFieldException e) {// NOSONAR
                // Field不在当前类定义,继续向上转型
            }
        }
        return null;
    }

    /**
     * 改变private/protected的成员变量为public，尽量不调用实际改动的语句，避免JDK的SecurityManager抱怨。
     */
    private static void makeAccessible(Field field) {
        if ((!Modifier.isPublic(field.getModifiers())
                || !Modifier.isPublic(field.getDeclaringClass().getModifiers()) || Modifier
                .isFinal(field.getModifiers())) && !field.isAccessible()) {
            field.setAccessible(true);
        }
    }

}
