/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razjel
 */
public class Hideout<T> {
    private T object;
    
    public Hideout() {
        this.object = null;
    }
    
    public void putIntoHideout(T toHide) {
        if (this.object == toHide) {
            this.object = null;
        } else {
            this.object = toHide;
        }
        
    }

    public T takeFromHideout() {

        if (this.object == null) {
            return null;
        } else {
            T object2 = this.object;
            this.object = null;
            return object2;
        }
       
    }

    public boolean isInHideout() {
        if (this.object == null) {
            return false;
        }
        return true;
    }
}