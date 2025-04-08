public class LecturerData {
    Lecturer[] lecturerData;
    int idx;

    public LecturerData() {
        lecturerData = new Lecturer[10];
        idx = 0;
    }

    public void add(Lecturer dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted ASC:");
        print();
    }

    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIdx].age) {
                    maxIdx = j;
                }
            }
            Lecturer temp = lecturerData[i];
            lecturerData[i] = lecturerData[maxIdx];
            lecturerData[maxIdx] = temp;
        }
        System.out.println("Sorted DSC:");
        print();
    }
}