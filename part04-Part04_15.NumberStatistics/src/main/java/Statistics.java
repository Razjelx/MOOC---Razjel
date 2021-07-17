
public class Statistics {
    
    private int numberCount;
    private int sum;
    
   
    public Statistics() {
        
        this.numberCount = 0;
        this.sum = 0;
    }

    public void addNumber(int newNumber) {
        
        this.numberCount ++;
        this.sum += newNumber;
        
        
    }

    public int getCount() {
        return this.numberCount;                            
    }

    public int sum() {
        return this.sum;
    }
    
    
    
    public double average() {
        double average = 0;
        
        if (this.numberCount > 0) {
            average = 1.0 * this.sum /  this.numberCount;
            return average;
        } else {
            return 0;
        }
    }
}
