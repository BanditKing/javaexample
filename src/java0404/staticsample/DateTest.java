package java0404.staticsample;

public class DateTest {
    public static void main(String[] args) {
        String currentDate = DateUtil.getCurrentDate();
        System.out.println(currentDate);

        String currentDate2 = DateUtil.getCurrentDate("yyyyMMdd");//메소드 오버로딩
        System.out.println(currentDate2);

        String currentMonth = DateUtil.getCurrentMonth();
        System.out.println(currentMonth);
    }
}