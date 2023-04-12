package java0404.staticsample;

import java.sql.SQLOutput;

public class StudentHideTest {
    public static void main(String[] args) {
        StudentHide studentHide = new StudentHide();

        studentHide.setStudentId(22073001);
        studentHide.setStudentName("김준형");
        studentHide.setSutdentDepart("컴퓨터공학");
        studentHide.setStudentAddress("서울시 성북구 정릉동");

        studentHide.getStudentAddress();

        System.out.println(studentHide.toString());


        StudentHide studentHide2 = new StudentHide();
        studentHide2.setStudentName("이순신");

        System.out.println(studentHide2.toString());
    }
}