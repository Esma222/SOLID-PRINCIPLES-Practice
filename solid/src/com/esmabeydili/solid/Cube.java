package com.esmabeydili.solid;

public class Cube implements  Shape, ThreeDimensionalShape{// -O  && -I
    @Override
    public double area() {
        return 100;
    }

    @Override
    public int volume() {
        return 0;
    }
}
