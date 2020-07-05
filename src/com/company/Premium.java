package com.company;

public @interface Premium {
    //  declaring annotation parameters
    int price() default 100;
    String tag() default "Default";
}
