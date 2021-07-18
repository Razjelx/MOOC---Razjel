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
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    @Override
    public int read() {
        if (isOn() != true || this.sensors.isEmpty()) {
            throw new IllegalStateException("Wrong state!"); 
        }
        int sum = this.sensors.stream().mapToInt(i -> i.read()).sum();
        this.readings.add(sum / this.sensors.size());
        return sum / this.sensors.size();
    }
    
    @Override
    public boolean isOn() {
        for (Sensor sensor: this.sensors) {
            if (sensor.isOn() == true) {
                return true;
            }             
        }
        return false;
    }
   
    @Override
    public void setOn() {
        for (Sensor sensor: this.sensors) {
            sensor.setOn();
        }
    }
    
    @Override
    public void setOff() {
        for (Sensor sensor: this.sensors) {
            sensor.setOff();
        }
    }

    public List<Integer> readings() {
        return this.readings;
        
    }
}
