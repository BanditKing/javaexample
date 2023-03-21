public class SwitchCase {
    public static void intCase(int ranking) {
        char medalColor;
        switch (ranking) {
            case 1 : medalColor = 'G';
                break;
            case 2 : medalColor = 'G';
                break;
            case 3 : medalColor = 'G';
                break;
            default : medalColor = 'A';
        }

        System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다");
    }

    public static void main(String[] args) {
        int ranking = 1;
        intCase(ranking);
    }
}