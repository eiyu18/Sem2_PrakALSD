public class LecturerData10 {

    public static void showAllLecturerData(Lecturer10[] lecturerArray) {
        for (Lecturer10 lecturer : lecturerArray) {
            System.out.println("ID: " + lecturer.id + ", Name: " + lecturer.name +
                    ", Gender: " + (lecturer.gender ? "Male" : "Female") + ", Age: " + lecturer.age);
        }
    }

    public static void countLecturerByGender(Lecturer10[] lecturerArray) {
        int maleCount = 0, femaleCount = 0;
        for (Lecturer10 lecturer : lecturerArray) {
            if (lecturer.gender) {
                maleCount++;
            } else {
                femaleCount++;
            }
        }
        System.out.println("Male: " + maleCount + ", Female: " + femaleCount);
    }

    public static void averageLecturerAgeByGender(Lecturer10[] lecturerArray) {
        int maleAgeSum = 0, maleCount = 0, femaleAgeSum = 0, femaleCount = 0;

        for (Lecturer10 lecturer : lecturerArray) {
            if (lecturer.gender) {
                maleAgeSum += lecturer.age;
                maleCount++;
            } else {
                femaleAgeSum += lecturer.age;
                femaleCount++;
            }
        }

        System.out.println("Average Age (Male): " + (maleCount > 0 ? (maleAgeSum / maleCount) : "N/A"));
        System.out.println("Average Age (Female): " + (femaleCount > 0 ? (femaleAgeSum / femaleCount) : "N/A"));
    }

    public static void showOldestLecturerInfo(Lecturer10[] lecturerArray) {
        Lecturer10 oldest = lecturerArray[0];
        for (Lecturer10 lecturer : lecturerArray) {
            if (lecturer.age > oldest.age) {
                oldest = lecturer;
            }
        }
        System.out.println("Oldest Lecturer: ID: " + oldest.id + ", Name: " + oldest.name +
                ", Gender: " + (oldest.gender ? "Male" : "Female") + ", Age: " + oldest.age);
    }

    public static void showYoungestLecturerInfo(Lecturer10[] lecturerArray) {
        Lecturer10 youngest = lecturerArray[0];
        for (Lecturer10 lecturer : lecturerArray) {
            if (lecturer.age < youngest.age) {
                youngest = lecturer;
            }
        }
        System.out.println("Youngest Lecturer: ID: " + youngest.id + ", Name: " + youngest.name +
                ", Gender: " + (youngest.gender ? "Male" : "Female") + ", Age: " + youngest.age);
    }
}
