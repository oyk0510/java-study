package com.greedy.level01.basic;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.checkMethod();

        int sum = calculator.sum1to10();
        System.out.println("1 부터 10까지의 합 : " + sum);

        calculator.checkMaxNumber(10, 20);

        int sumTwo = calculator.sumTwoNumber(10,20);


        int minusTwo = calculator.minusTwoNumber(10,5);

    }
}