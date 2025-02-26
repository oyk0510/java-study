package chap03_method_and_api.level01.basic;

public class Calculator {
    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10() {
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        return sum;
    }

    public void checkMaxNumber(int a, int b) {
        if (a > b) {
            System.out.println("두 수 중 큰 수는 " + a + "이다.");
        }
        else if (a < b) {
            System.out.println("두 수 중 큰 수는 " + b + "이다.");
        }
        else
            System.out.println("두 수 중 큰 수는 " + a + "이다.");
    }

    public int sumTwoNumber(int a, int b) {
        System.out.println(a + "과 " + b + "의 합은 : " + (a+b));
        return a+b;
    }

    public int minusTwoNumber(int a, int b) {
        System.out.print(a + "과 " + b + "의 차는 : " + (a-b));
        return a - b;
    }

}

