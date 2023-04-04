package java0404;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();// Student 객체 생성
        student.studentName = "이순신";//studentName 필드에 "이순신" 저장

        System.out.println(student.getStudentName()); // student 객체의 getStudentName() 메서드를 호출하여 studentName 필드 값을 출력

        Student student2 = new Student(); // student2 객체 생성
        student2.studentName = "세종대왕"; // student2 객체 getStudentName() 메서드를 호출하여 studentName 필드 값을 출ㄴ

        System.out.println(student2.studentName);

        System.out.println(student);
        System.out.println(student2);

        StudentCourse studentCourse = new StudentCourse();
        studentCourse.studentName = "김길동";
//        studentCourse.korean.score = 100;
//        studentCourse.korean.subjectName = "쉬운국어";

        Subject subject = new Subject();
        subject.score = 100;
        subject.subjectName = "쉬운국어";

        System.out.println(subject.subjectName);

        studentCourse.korean = subject;

        System.out.println(studentCourse.korean.subjectName);

        // studentCourse.korean.subjectName = "쉬운국어";

    }
}
