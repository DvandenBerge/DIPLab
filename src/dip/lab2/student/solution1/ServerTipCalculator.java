package dip.lab2.student.solution1;

import java.util.Hashtable;

/**
 * @author dvandenberge
 */
public class ServerTipCalculator implements TipCalculator{
    
    private double bill;
    private String serviceQuality;
    
    private double goodRate=.20;
    private double fairRate=.15;
    private double poorRate=.10;
    private final Hashtable<String,Double> TIP_PERCENT=new Hashtable<String,Double>();
    
    public ServerTipCalculator(double bill, String serviceQuality){
        TIP_PERCENT.put("good",goodRate);
        TIP_PERCENT.put("fair",fairRate);
        TIP_PERCENT.put("poor",poorRate);
        this.bill=bill;
        this.serviceQuality=serviceQuality;
    }

    public double getBill() {
        return bill;
    }

    public String getServiceQuality() {
        return serviceQuality;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public void setServiceQuality(String serviceQuality) {
        this.serviceQuality = serviceQuality;
    }

    public void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    public void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    public void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }
    
    @Override
    public double getTip(){
        return bill*TIP_PERCENT.get(serviceQuality);
    }
}
