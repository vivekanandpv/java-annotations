package com.company;

@Premium(price = 1400, tag = "Custom tag value")
public class Sample {

    @Premium(message = "Applied to long field")
    private long id;

    @Premium(message = "Applied to void method")
    public void foo() {
        //...
    }
}
