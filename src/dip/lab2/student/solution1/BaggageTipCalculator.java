/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import java.util.Hashtable;

/**
 *
 * @author dvandenberge
 */
public class BaggageTipCalculator implements TipCalculator{
    
    private int numberOfBags;
    private String serviceQuality;
    private final double baseTipPerBag=1;
    
    private final Hashtable<String,Double> TIP_PERCENT=new Hashtable<String,Double>();
    
    public BaggageTipCalculator(int bags,String quality){
        TIP_PERCENT.put("good",1.2);
        TIP_PERCENT.put("fair",1.15);
        TIP_PERCENT.put("poor",1.1);
        this.numberOfBags=bags;
        this.serviceQuality=quality;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public String getServiceQuality() {
        return serviceQuality;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public void setServiceQuality(String serviceQuality) {
        this.serviceQuality = serviceQuality;
    }
    
    
    
    @Override
    public double getTip(){
        return baseTipPerBag*numberOfBags*TIP_PERCENT.get(serviceQuality);
    }
}
