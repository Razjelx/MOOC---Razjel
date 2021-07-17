import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, -5, 6, 1, -19, 1, 3, 7, 5};
        System.out.println("Smallest: " + smallest(array));
        
        System.out.println("Index of smallest number: " + indexOfSmallest(array));
        // indices:       0  1  2  3   4
        System.out.println("");
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        System.out.println("");
        int[] numbers2 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 1, 0);
        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 0, 3);
        System.out.println(Arrays.toString(numbers2));
        System.out.println("");
        int[] numberos = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numberos);
    
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        while (index < array.length) {
            if (smallest > array[index]) {
                smallest = array[index];
            }
                
            index ++;
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
       
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                return i;
            }
                
            
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = 0;
        
        for (int i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                
                    
                   
            }    
        }    
        for (int j = 0; j < table.length; j++) {
            if (table[j] == smallest) {
                    index = j;            
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int c = array[index1];
        array[index1] = array[index2];
        array[index2] = c;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, indexOfSmallestFrom(array,i), i);
        }
    }
}
