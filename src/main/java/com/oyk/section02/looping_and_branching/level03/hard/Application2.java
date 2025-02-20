package com.oyk.section02.looping_and_branching.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int i = random.nextInt(100) + 1;
        int count = 0;

        while(true) {
            System.out.print("정수를 입력하세요 : ");
            int n = sc.nextInt();
            count++;

            if(n < i) {
                System.out.println("입력하신 정수보다 큽니다.");
            }else if(n > i) {
                System.out.println("입력하신 정수보다 작습니다.");
            }else {
                System.out.println("정답입니다. " + count + "회 만에 정답을 맞추셨습니다." );
                break;
            }
        }
    }
}

