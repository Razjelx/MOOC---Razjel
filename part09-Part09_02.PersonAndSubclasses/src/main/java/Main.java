import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        ArrayList<Person> persons = new ArrayList<Person>();
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        
        System.out.println(ada);
        System.out.println(esko);
        System.out.println("----------");
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
              
        
        int i = 0;
        while (i < 25) {
            ollie.study();
            i++;
        }
        
        System.out.println(ollie);
        
        System.out.println("---------------------");
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(ollie);
        printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person: persons) {
            System.out.println(person);
        }
    }
}
