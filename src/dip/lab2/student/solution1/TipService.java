package dip.lab2.student.solution1;

/* 
 * @author dvandenberge
 */
public class TipService {
    private TipCalculator tipCalculator;
    
    public TipService(TipCalculator t){
        if(t instanceof TipCalculator){
            this.tipCalculator=t;
        }
    }
    
    public double getTip(){
        return tipCalculator.getTip();
    }
    
    public void setCalculator(TipCalculator t){
        if(t instanceof TipCalculator){
            this.tipCalculator=t;
        } else {
            System.out.println("Illegal argument");
        }
    }
}
