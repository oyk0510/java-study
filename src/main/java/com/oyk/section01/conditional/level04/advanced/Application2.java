package com.oyk.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 급여 입력 : ");
        int salary = sc.nextInt();
        System.out.print("매출액 입력 : ");
        int revenue = sc.nextInt();

        int bonus = 0;

        if(revenue >= 50000000) {
            bonus = 5;
        }else if(revenue >= 30000000) {
            bonus = 3;
        }else if(revenue >= 10000000) {
            bonus = 1;
        }else
            bonus = 0;

        double bonusAmount = revenue * (bonus / 100.0);
        double totalSalary = salary + bonusAmount;

        System.out.println("===============");
        System.out.println("매출액 : " + revenue);
        System.out.println("보너스율 : " + bonus + "%");
        System.out.println("월 급여 : " + salary);
        System.out.println("보너스 금액 : " + (int)bonusAmount);
        System.out.println("===============");
        System.out.println("총 급여 : " + (int)totalSalary);
    }
}
