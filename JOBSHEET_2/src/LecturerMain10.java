public class LecturerMain10 {
    public static void main(String[] args) {
        Lecturer10 lecturer1 = new Lecturer10();
        lecturer1.lecturerID = "L001";
        lecturer1.name = "Ryan Gosling";
        lecturer1.status = true;
        lecturer1.startYear = 2008;
        lecturer1.expertiseField = "Data base";

        lecturer1.print();
        lecturer1.setStatus(true);
        System.out.println("Tenure: " + lecturer1.calculateTenure(2025) + " years");
        lecturer1.changeExpertiseField("UI/UX");
        System.out.println();

        Lecturer10 lecturer2 = new Lecturer10();
        lecturer2.lecturerID = "L002";
        lecturer2.name = "Walter White";
        lecturer2.status = true;
        lecturer2.startYear = 1999;
        lecturer2.expertiseField = "Algebra";

        lecturer2.print();
        lecturer2.setStatus( true);
        System.out.println("Tenure: " + lecturer2.calculateTenure(2025) + " years");
    }
}