
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    
    public String toString() {
        
        String printOutput = "The collection " + this.name + " has " + elements.size() + " element:\n";
        
        String printOutputS = "The collection " + this.name + " has " + elements.size() + " elements:\n";
        
        if (elements.isEmpty()) {
            return "The collection "+ this.name + " is empty.";
        }
        
        String elementsIn = "";
        
        
        if (elements.size() == 1) {
            for (String element: elements) {
                elementsIn += element;
            }    
            return printOutput + elementsIn;    
                
            
        } else {
            for (String element: elements) {
                elementsIn += element + "\n";
            }    
            return printOutputS + elementsIn;
            
        }
    }
}