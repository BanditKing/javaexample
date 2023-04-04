package java0314;

public class operation {
    public static void operation1() {
        int mathScore = 90;
        int engScore = 70;
        int totalScore = mathScore + engScore;
        System.out.println(totalScore);
        double avgScore = totalScore / 2.0; // 2로 나눈 결과를 실수로 나타내게 하는 코드
        System.out.println(avgScore); //80.0
    }

    public static void operation2() {
        int gameScore = 150;
        int lastScore = gameScore++; // 증가연산자로 1이 더해진다
        System.out.println(gameScore); // 151
        System.out.println("--------------------------------");
        System.out.println(lastScore); // 150
        int lastScore2 =  gameScore--;
        System.out.println(lastScore2); //151
        System.out.println("여기까지--------------------------");
        System.out.println(lastScore2);
    }
    public static void main(String[] args) {
        operation1();
        operation2();

        //
        int num = 10;
        int i = 2;

        boolean value = ((num = num + 10 ) < 10) && ((i =  i + 2)< 10); // 논리 곱 연산자가 이용되었기에 둘 중 하나라도 틀린 답이라면 false 가 출력된다.
        System.out.println(value);

        value = ((num = num + 10) < 10) || ((i = i + 2 ) < 10 ); // 논리 합 연산자가 이용되었기에 둘 중 하나라도 맞는 답이라면 True 가 출력된다.
        System.out.println(value);

        //boolean 가 사용 되어 true 와 false 둘 중 하나를 가질 수 있는 논리형 데이터이다.
    }

    public static class SwitchCase {
    }
}
