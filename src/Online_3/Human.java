package Online_3;

public class Human {
//    public final static int AGE = 25;
//    private final static int B = 15;
//
//    public static void printHelloWorld() {
//        System.out.println("Hello World");
//    }
      private String name;
      private WeekDays workingDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeekDays getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(WeekDays workingDay) {
        this.workingDay = workingDay;
    }

    public Human(String name, WeekDays workingDay) {
        this.name = name;
        this.workingDay = workingDay;
    }
}
