package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//  Target specifies where this annotation can be useful
@Target(ElementType.TYPE)   //  to classes, interfaces, and enums
// for multiple specifications use @Target({ElementType.TYPE, ElementType.METHOD})

//  Retention specifies how deep this annotation is available
@Retention(RetentionPolicy.RUNTIME)   //  JVM deep;
// SOURCE (stripped in compilation),
// CLASS (available to compiler but not to runtime)
public @interface Premium {
    //  declaring annotation parameters
    int price() default 100;
    String tag() default "Default";
}
