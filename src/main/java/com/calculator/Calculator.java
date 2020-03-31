package com.calculator;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import javax.sound.midi.SysexMessage;

public class Calculator {
    public int sum(int a, int b) {
        return a+b;
    }

    public int subtraction(int a, int b){
        return a-b;
    }

    public static void main (String args[]){
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(7,2));
    }
}
