public class TopStudent10 {
    Student10[] listStudents;
    int idx;

    public TopStudent10() {
        listStudents = new Student10[5];
        idx = 0;
    }

    public void add(Student10 student) {
        if (idx < listStudents.length) {
            listStudents[idx] = student;
            idx++;
        } else {
            System.out.println("List is full");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listStudents[i].print();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listStudents[j].gpa < listStudents[j + 1].gpa) {
                    Student10 temp = listStudents[j];
                    listStudents[j] = listStudents[j + 1];
                    listStudents[j + 1] = temp;
                }
            }
        }
    }
}
