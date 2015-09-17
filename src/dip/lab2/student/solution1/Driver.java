package dip.lab2.student.solution1;

/**
 * @author dvandenberge
 */
public class Driver {
    public static void main(String[] args) {
        TipCalculator calculator1 = new ServerTipCalculator(200,"good");
        TipCalculator calculator2 = new BaggageTipCalculator(5,"fair");
        
        TipService ts1 = new TipService(calculator1);
        System.out.println(ts1.getTip());
        ts1.setCalculator(calculator2);
        System.out.println(ts1.getTip());
        
    }
}
