package com.my.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Flash on 2018/5/12.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)//注解存在的范围
public @interface NotThreadSafe {//标注线程安全的类
    String value() default "";
}
