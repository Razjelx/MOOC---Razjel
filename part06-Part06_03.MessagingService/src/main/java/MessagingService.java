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
import java.lang.String;
public class MessagingService {
    private ArrayList<Message> list;

    public MessagingService(){
        this.list = new ArrayList<>();
    }

    public void add(Message message) {
       if (message.getContent().length() <= 280) {
           list.add(message);
       }
    }
    
    public ArrayList<Message> getMessages() {
              
            for (Message message: list) {
                System.out.println(message);
        
        }
        return this.list;
    }
}
