package com.esmabeydili.solid;

import java.util.List;
import java.util.Objects;

public class AreaCalculator implements  IAreaCalculator {//Opened-Closed -O

    /*public  int sum(List<Object> shapes){
        int sum = 0;
        for (int i = 0; i< shapes.size();i++){
            Object shape = shapes.get(i);
            if(shape instanceof Square){
                sum += Math.pow(((Square) shape).getLenght(),2);
            }
            if(shape  instanceof Circle){
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(),2);
            }

        }
        return sum;
    }*/

    public  int sum(List<Shape> shapes){
        int sum = 0;
        for (int i = 0; i< shapes.size();i++){
            sum+= shapes.get(i).area();


        }
        return sum;
    }


}
