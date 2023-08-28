package com.esmabeydili.solid;

public class NoShape implements Shape{// Liskov Subtitution -L
    @Override
    public double area() {//broke the Liskov substitution rule
        throw new IllegalStateException(" Cannot calculate area");
    }
}
