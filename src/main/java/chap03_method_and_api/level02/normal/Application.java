package chap03_method_and_api.level02.normal;

public class Application {

    public static void main(String[] args) {

        int randomNum = RandomMaker.randomNumber(-100, 100);
        System.out.println(randomNum);

        String randomStr = RandomMaker.randomUpperAlpabet(10);
        System.out.println(randomStr);

        String rps = RandomMaker.rockPaperScissors();
        System.out.println(rps);

        String coin = RandomMaker.tossCoin();
        System.out.println(coin);
    }
}
