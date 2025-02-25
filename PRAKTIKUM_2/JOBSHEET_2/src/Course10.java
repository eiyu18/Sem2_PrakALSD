public class Course10 {
    String courseID;
    String name;
    int credit;
    int hour;

    public Course10() {
    }

    public Course10(String courseID, String name, int credit, int hour) {
        this.courseID = courseID;
        this.name = name;
        this.credit = credit;
        this.hour = hour;
    }

    void print() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Name: " + name);
        System.out.println("Credit: " + credit);
        System.out.println("Hour: " + hour);
    }

    void changeCredit(int newCredit) {
        credit = newCredit;
        System.out.println("Credit has been changed to: " + credit);
    }

    void addHour(int hourToAdd) {
        hour += hourToAdd;
        System.out.println("Added hours. Total now: " + hour);
    }

    void reduceHour(int hourToReduce) {
        if (hour - hourToReduce >= 0) {
            hour -= hourToReduce;
            System.out.println("Reduced hours. Total now: " + hour);
        } else {
            System.out.println("Cannot reduce hours below 0.");
        }
    }
}