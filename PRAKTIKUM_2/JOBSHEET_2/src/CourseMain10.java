public class CourseMain10 {
    public static void main(String[] args) {
        Course10 course1 = new Course10();
        course1.courseID = "CS101";
        course1.name = "Algoritma dan Struktur Data";
        course1.credit = 2;
        course1.hour = 4;

        course1.print();

        course1.changeCredit(4);
        course1.addHour(2);
        course1.reduceHour(3);

        Course10 course2 = new Course10("CS102", "PrakALSD", 3, 6);
        course2.print();
    }
}