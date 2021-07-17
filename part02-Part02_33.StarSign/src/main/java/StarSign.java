
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
         
        System.out.println("\n---");  // printing --- between the shapes
        printStars(5);
        printStars(3);
        printStars(9);
    
        
        
        
        System.out.println("\n---");
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
    }

    public static void printStars(int number) {
        // first part of the exercise
        int i = 1;
        while (i <= number){
            System.out.print("*");
            i++;
        }    
        
        
        System.out.println("");
       
    }
        
        
    

    public static void printSquare(int size) {
        // second part of the exercise
        int number = 1;
        while (number <=size) {
            printStars(size);
            number++;
        }
        
    
    
    
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        
        int printable = width;  
        while (printable <= width * height) {
            printStars(width);
            printable += width;
        }
        System.out.println("");
    
    
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int number = 1;
        while (number <= size) {
            printStars(number);
            number++;
        }
        System.out.println("");
    }
}
