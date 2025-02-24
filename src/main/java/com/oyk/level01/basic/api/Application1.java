package com.oyk.level01.basic.api;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        /* split(" ")는 하나의 공백 문자만 구분자로 인식
        * split("\\s+")는 하나 이상의 공백(또는 탭, 줄바꿈 등)을 구분자로 처리 */
        String[] words = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            if(!words[i].isEmpty()) {
                // 단어의 첫 글자는 대문자로 변환
                String firstLetter = words[i].substring(0, 1).toUpperCase();
                // 나머지 부분 초기화
                String rest = "";
                if(words[i].length() > 1) {
                    rest = words[i].substring(1);   // index 1부터 끝까지
                }
                // 변환된 첫 글자와 나머지 문자열을 StringBuilder에 이어 붙인다.
                sb.append(firstLetter).append(rest);
                // 현재 단어가 마지막 단어가 아니라면
                // 단어 사이에 공백 추가
                sb.append(" ");
            }

        }
        System.out.println("변환된 문자열: " + sb);
        System.out.println("총 단어 개수: " + words.length);
    }
}
