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
    
    private double goodRate=.20;
    private double fairRate=.15;
    private double poorRate=.10;
    
    private int numberOfBags;
    private serviceQuality serviceQuality;
    private final double baseTipPerBag=1;
    
    private final Hashtable<serviceQuality,Double> TIP_PERCENT=new Hashtable<serviceQuality,Double>();
    
    public BaggageTipCalculator(int bags,serviceQuality sQ){
        TIP_PERCENT.put(TipCalculator.serviceQuality.GOOD,goodRate);
        TIP_PERCENT.put(TipCalculator.serviceQuality.FAIR,fairRate);
        TIP_PERCENT.put(TipCalculator.serviceQuality.POOR,poorRate);
        this.numberOfBags=bags;
        this.serviceQuality=sQ;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public serviceQuality getServiceQuality() {
        return serviceQuality;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public void setServiceQuality(serviceQuality sQ) {
        this.serviceQuality = sQ;
    }
    
    
    
    @Override
    public double getTip(){
        return baseTipPerBag*numberOfBags*TIP_PERCENT.get(serviceQuality);
    }
}
