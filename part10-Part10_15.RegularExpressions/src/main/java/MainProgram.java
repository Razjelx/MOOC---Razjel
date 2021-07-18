

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker checker = new Checker();
        String day = "wed";
        String hour = "20:00:00";
        
        System.out.println(checker.isDayOfWeek(day));
        
        System.out.println(checker.timeOfDay(hour));
    }
}
