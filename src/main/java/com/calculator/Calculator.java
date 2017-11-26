package com.calculator;

public class Calculator {
    double a;
    double b;

    public void Calculator(int a, int b){
        this.a=a;
        this.b=b;
    }

    public double calcAdd(double a, double b){
        return a+b;
    }
    public double calcmultiplication(double a, double b){
        return a*b;
    }
}
