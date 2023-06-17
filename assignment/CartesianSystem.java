package com.assignment;

import static java.lang.Math.sqrt;

public class CartesianSystem {
    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 4;
        int y1 =2;
        int y2=4;
        int x=x2-x1;
        int y=y2-y1;
        double result1 = Math.pow(x,2);
        double result2 = Math.pow(y,2);
        double result = result1+result2;
        double total = Math.pow(result,0.5);
        System.out.println(+total);


    }
}
