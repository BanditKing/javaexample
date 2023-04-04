package java0314;

public class First {
    public static int sum(int n, int m) {
        int s = n + m;

        return s; // s 를 반환함으로써 이 결과를 외부에서도 사용할 수 있게 해주었다.

    }

    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i, 20);

        System.out.println("합은 " + s + " 입니다.");

        a = '가';
        System.out.println(a);

        String str = "안녕하세요?";

        System.out.println(str);
    }
}

