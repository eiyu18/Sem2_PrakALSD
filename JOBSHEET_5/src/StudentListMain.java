public class StudentListMain {
    public static void main(String[] args) {
        StudentList student[] = new StudentList[8];
        student[0] = new StudentList("Ahmad", 220101001, 2022, 78, 82);
        student[1] = new StudentList("Budi", 220101002, 2022, 85, 88);
        student[2] = new StudentList("Ahmad", 220101003, 2021, 90, 87);
        student[3] = new StudentList("Ahmad", 220101004, 2021, 76, 79);
        student[4] = new StudentList("Ahmad", 220101005, 2023, 92, 95);
        student[5] = new StudentList("Ahmad", 220101006, 2020, 88, 85);
        student[6] = new StudentList("Ahmad", 220101007, 2023, 80, 83);
        student[7] = new StudentList("Ahmad", 220101008, 2020, 82, 84);

        StudentListMain program = new StudentListMain();

        System.out.println("The highest Midterm score is: " +
                program.findHighestMidTermScoreDC(student, 0, student.length - 1));
        System.out.println("The lowest Midterm score is: " +
                program.findLowestMidTermScoreDC(student, 0, student.length - 1));
        System.out.println("The average Final Exam score is: " +
                program.calculateFinalExamAverage(student));
    }

    public int findHighestMidTermScoreDC(StudentList[] students, int low, int high) {
        if (low == high) {
            return students[low].midTermScore;
        }
        int mid = (low + high) / 2;
        int left = findHighestMidTermScoreDC(students, low, mid);
        int right = findHighestMidTermScoreDC(students, mid + 1, high);
        return Math.max(left, right);
    }

    public int findLowestMidTermScoreDC(StudentList[] students, int low, int high) {
        if (low == high) {
            return students[low].midTermScore;
        }
        int mid = (low + high) / 2;
        int left = findLowestMidTermScoreDC(students, low, mid);
        int right = findLowestMidTermScoreDC(students, mid + 1, high);
        return Math.min(left, right);
    }


    public double calculateFinalExamAverage(StudentList[] students) {
        int sum = 0;
        for (StudentList student : students) {
            sum += student.finalScore;
        }
        return (double) sum / students.length;
    }
}
