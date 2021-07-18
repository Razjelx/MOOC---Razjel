/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razjel
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    
    public Hand() {
        this.cards = new ArrayList<>();
        
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        Iterator<Card> iterator = this.cards.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public int getValues() {
        int sum = 0;
        Iterator<Card> iterator = this.cards.iterator();
        while (iterator.hasNext()) {
           sum += iterator.next().getValue();
        }
        return sum;
    }
    public void sort() {
        Collections.sort(this.cards);
    }
    
    @Override
    public int compareTo(Hand hand) {
        int sum = 0;
        for (Card card: this.cards) {
            sum += card.getValue();
        }
        
        if (sum == hand.getValues()) {
           return 0;
       } else if (sum > hand.getValues()) {
           return 1;
       } else {
           return -1;
       }
       
       
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
