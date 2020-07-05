package com.company;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //  Find the class Sample
        Constructor<Sample> sampleConstructor = Sample.class.getConstructor(Long.TYPE); //  for primitives .class doesn't work

        //  Get the annotation instance
        Premium constructorAnnotation = sampleConstructor.getAnnotation(Premium.class);

        //  Invoke the constructor with value passed through annotation
        Sample sampleInstance = sampleConstructor.newInstance(constructorAnnotation.id());

        //  Inspect
        System.out.println("Id of the instance: " + sampleInstance.getId());
    }
}
