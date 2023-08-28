package com.esmabeydili.solid;

public class NoShape implements Shape{// Liskov Subtitution -S
    @Override
    public double area() {//broke the Liskov substitution rule
        throw new IllegalStateException(" Cannot calculate area");
    }
}
