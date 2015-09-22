package dip.lab2.student.solution1;

import java.util.Hashtable;

/**
 * @author dvandenberge
 */
public class ServerTipCalculator implements TipCalculator{
    
    private double bill;
    private serviceQuality serviceQuality;
    
    private double goodRate=.20;
    private double fairRate=.15;
    private double poorRate=.10;
    private final Hashtable<serviceQuality,Double> TIP_PERCENT=new Hashtable<serviceQuality,Double>();
    
    public ServerTipCalculator(double bill, serviceQuality sQ){
        TIP_PERCENT.put(TipCalculator.serviceQuality.GOOD,goodRate);
        TIP_PERCENT.put(TipCalculator.serviceQuality.FAIR,fairRate);
        TIP_PERCENT.put(TipCalculator.serviceQuality.POOR,poorRate);
        this.bill=bill;
        this.serviceQuality=sQ;
    }

    public double getBill() {
        return bill;
    }

    public serviceQuality getServiceQuality() {
        return serviceQuality;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public void setServiceQuality(serviceQuality sQ) {
        this.serviceQuality = sQ;
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
