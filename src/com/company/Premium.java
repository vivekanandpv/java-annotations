package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//  Target specifies where this annotation can be useful
@Target(ElementType.TYPE)   //  to classes, interfaces, and enums
// for multiple specifications use @Target({ElementType.TYPE, ElementType.METHOD})

//  Retention specifies how deep this annotation is available
@Retention(RetentionPolicy.CLASS)   //  bytecode deep;
// others: SOURCE (stripped in bytecode), RUNTIME (even JVM can see, as deep as possible)
public @interface Premium {
    //  declaring annotation parameters
    int price() default 100;
    String tag() default "Default";
}
