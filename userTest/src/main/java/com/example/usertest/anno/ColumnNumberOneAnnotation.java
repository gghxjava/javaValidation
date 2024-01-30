package com.example.usertest.anno;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ColumnNumberOneAnnotation {
    float exportOrderNum() default -1.0F;

    int importOrderNum() default -1;

    String fieldName() default "";

    String exportDateFormat() default "yyyy-MM-dd HH:mm:ss";

    int mergeType() default -1;
}

