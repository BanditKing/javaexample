package java0314;

public class Casting {
    public static void implicit() {
        byte bNum = 10; //bNum 변수는 10
        int iNum = bNum; //iNum 변수는 bNum
        System.out.println(bNum); //10
        System.out.println(iNum); //10

        int iNum2 = 20; // iNum2 는 20
        float fNum = iNum; // fNum 변수는 iNum(10)
        System.out.println(iNum2); //20
        System.out.println(fNum); // 10

        double dNum;
        dNum = fNum + iNum2;
        System.out.println(dNum); // 30
    }

    public static void explicit() {
        double dNum = 1.2;
        float fNum = 0.9F;

        int iNum = (int) (dNum + fNum);
        int iNum2 = (int) dNum + (int) fNum;

        System.out.println(iNum);
        System.out.println(iNum2);
    }
    public static void main(String[] args) {
        implicit();
        System.out.println("-------------------------------");
        explicit();
    }
}
