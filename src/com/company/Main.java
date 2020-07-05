package com.company;

public class Main {

    public static void main(String[] args) {
        //  We use Reflection API to process the annotations
        //  You can imagine annotations are like driving licence cards
        //  through which we identify the driver details

        //  In itself annotation is just an identifier
        //  The processing of annotation is what makes them interesting

        //  Great frameworks and DI containers use annotations heavily.
        //  We reflect on the target entity (object's class in our case)
        //  and then get to the annotation and process it.

        Sample sample = new Sample();
        Class type = sample.getClass();

        Premium premiumAnnotationInstance = (Premium) type.getAnnotation(Premium.class);
        System.out.println("Price: " + premiumAnnotationInstance.price() + "; tag: " + premiumAnnotationInstance.tag());
    }
}
