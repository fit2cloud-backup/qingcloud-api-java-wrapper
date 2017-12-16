package com.fit2cloud.qingcloud.wsclient.ui.model.annotation;

import java.lang.annotation.*;

/**
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 2017/3/7 下午12:21
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Documented
public @interface As {
    String value() default "";
}
