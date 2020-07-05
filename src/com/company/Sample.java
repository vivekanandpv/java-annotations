package com.company;

@Premium(price = 1400, tag = "Custom tag value")
public class Sample {

    @Premium(id = 45)
    public Sample(long id) {
        this.id = id;
    }

    @Premium(message = "Applied to long field")
    private long id;

    @Premium(message = "Applied to void method")
    public void foo() {
        //...
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
