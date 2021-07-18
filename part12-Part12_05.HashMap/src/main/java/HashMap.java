/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razjel
 */
public class HashMap<K, V> {
    
    private List<Pair<K,V>>[] values;
    private int firstFreeIndex;
    
    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0; 
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }
    
        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];
        
        for (int i = 0; i < valuesAtIndex.Size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnTheKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
        
        
        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }
    
        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }
    
    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnTheKey(key);
        if (valuesAtIndex.Size() == 0) {
            return null;
        }
        
        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
                return null;
        }
        
        Pair<K, V> pair = valuesAtIndex.value(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
            
        }
    

    private List<Pair<K, V>> getListBasedOnTheKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if ( this.values[hashValue] == null) {
            values[hashValue] = new List<>();
        }
    
        return this.values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.Size(); i++) {
            if (myList.value(i).getKey().equals(key)) {
                return i;
            }
            
        }
        
        return -1;
    }

    public void grow() {
        List<Pair<K, V>>[] newArray = new List[this.values.length * 2];
        
        for (int i = 0; i < this.values.length; i++) {
            copy(newArray, i);
        }
        
        this.values = newArray;
    }

    public void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].Size(); i++) {
            Pair<K, V> value = this.values[fromIdx].value(i);
            
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new List<>();
            }
        
            newArray[hashValue].add(value);
        }
    }
}
