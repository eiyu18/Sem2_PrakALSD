public class Student10 {
    String nim;
    String name;
    String className;
    int grade;


    Student10(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1;
    }

    void grading(int grade) {
        this.grade = grade;
    }
}
