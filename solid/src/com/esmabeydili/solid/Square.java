package com.esmabeydili.solid;

public class Square  implements  Shape{// -O

    private  final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLenght() {
        return length;
    }

    @Override
    public double area() {
        return Math.pow(getLenght(),2);
    }
}
