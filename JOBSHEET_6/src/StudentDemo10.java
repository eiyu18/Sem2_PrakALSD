public class StudentDemo10 {
    public static void main(String[] args) {
        TopStudent10 topStudent = new TopStudent10();

        topStudent.add(new Student10("2201", "Alice", "A", 3.9));
        topStudent.add(new Student10("2202", "Bob", "B", 3.7));
        topStudent.add(new Student10("2203", "Charlie", "C", 3.8));
        topStudent.add(new Student10("2204", "David", "D", 3.6));
        topStudent.add(new Student10("2205", "Eve", "E", 4.0));

        System.out.println("Original student list:");
        topStudent.print();

        topStudent.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending):");
        topStudent.print();
    }
}