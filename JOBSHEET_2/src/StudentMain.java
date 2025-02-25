public class StudentMain {
    public static void main(String[] args) {
        Student10 student1 = new Student10();
        student1.studentID = "244107020097";
        student1.name = "Tiara";
        student1.className = "TI-1I";
        student1.gpa = 3.8;
        student1.print();
        student1.changeClass("TI-2I");
        student1.updateGPA(3.9);
        student1.print();

        Student10 student2 = new Student10("244107020040", "Rizky", "TI-1I", 3.5);
        student2.updateGPA(3.3);
        student2.print();

        Student10 studentEiyu = new Student10("244107020040", "Rizky", "TI-1I", 3.5);
        studentEiyu.updateGPA(3.3);
        studentEiyu.print();
    }
}