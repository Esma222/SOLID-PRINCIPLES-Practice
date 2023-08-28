package com.esmabeydili.solid;


import java.util.List;

public class ShapesPrinter {//Single Responsibility -S



    public  String json(int sum){
        return "{shapesSum: %s}".formatted(sum);
    }

    public  String csv(int sum){
        return "shapesSum,%s".formatted(sum);
    }


    //dependency inversion rule
    private  final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public  String json(List<Shape> shapes){
        return "{shapesSum: %s}".formatted(areaCalculator.sum(shapes));
    }


}
