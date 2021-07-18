/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Razjel
 */
import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean sensorOn;
    private int temperature;
    
    public TemperatureSensor() {
        this.sensorOn = false;
    }

    public int getTemperature() {
        return temperature;
    }
    
    
    
    @Override
    public int read() {
        
        if (isOn() == true) {
            Random random = new Random();
            int max = 30;
            int min = -30;
            
            this.temperature =  random.nextInt(30 - (-30)) + (-30);
            return this.temperature;
        } else {
            throw new IllegalStateException();
        }
        
    }
    
   
    
    @Override
    public boolean isOn() {
        return this.sensorOn;
    }
    
    @Override
    public void setOn() {
        this.sensorOn = true;
        
    }
    
    @Override
    public void setOff() {
        this.sensorOn = false;
    }
}