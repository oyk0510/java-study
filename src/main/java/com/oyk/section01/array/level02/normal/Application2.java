package com.oyk.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {
    /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
     * 성별 자리 이후부터 *로 가려서 출력하세요
     *
     * -- 입력 예시 --
     * 주민등록번호를 입력하세요 : 990101-1234567
     *
     * -- 출력 예시 --
     * 990101-1******
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 : ");
        String input = sc.nextLine();
        char[] arr = input.toCharArray();

        for(int i = 8; i < arr.length; i++) {
            arr[i] = '*';
        }
        System.out.println(arr);
    }
}
