package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        Sample sample = new Sample();
        Class type = sample.getClass();
        Method fooMethod = sample.getClass().getMethod("foo");
        Field idField = sample.getClass().getDeclaredField("id");   //  getField() is for public fields

        //  for types (class, interface, and enums) cast is required
        Premium typeAnnotation = (Premium) type.getAnnotation(Premium.class);
        System.out.println("Type: Price: " + typeAnnotation.price() + "; tag: " + typeAnnotation.tag());


        //  for methods and fields the cast is not required
        Premium fooAnnotation = fooMethod.getAnnotation(Premium.class);
        System.out.println("Method: message: " + fooAnnotation.message());

        Premium idAnnotation = idField.getAnnotation(Premium.class);
        System.out.println("Field: message: " + idAnnotation.message());
    }
}
