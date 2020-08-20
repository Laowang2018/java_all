package com.lw.java.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotation {
    String test();
    int value();
    String[] mock() default {"asdf","asdf"};

}


