public class ExcuseLetter10 {
    private String id;
    private String name;
    private String className;
    private char typeOfExcuse;
    private int duration;

    public ExcuseLetter10(String id, String name, String className, char typeOfExcuse, int duration) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.typeOfExcuse = typeOfExcuse;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nClass: " + className +
               "\nType: " + (typeOfExcuse == 'S' ? "Sick" : "Other") +
               "\nDuration: " + duration + " days";
    }
}