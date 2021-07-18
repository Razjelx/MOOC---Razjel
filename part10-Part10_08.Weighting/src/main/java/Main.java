

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
    Hold hold = new Hold(100);
    Suitcase suitcase = new Suitcase(20);
    suitcase.addItem(new Item("mąka", 1));
    suitcase.addItem(new Item("Biblia", 3));
    hold.addSuitcase(suitcase);
    System.out.println(suitcase);
    System.out.println("-----");    
    suitcase.printItems();
    
    }

}
