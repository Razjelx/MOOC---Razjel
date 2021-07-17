
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();
        
        System.out.println(counter1.value());
        System.out.println(counter2.value());
        
        counter1.increase();
        counter2.increase();
        counter2.increase();
        counter1.decrease();
        
        System.out.println(counter1.value());
        System.out.println(counter2.value());
    
    }
}
