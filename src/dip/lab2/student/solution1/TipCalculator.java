package dip.lab2.student.solution1;

/**
 * @author dvandenberge
 */
public interface TipCalculator {
    public static enum serviceQuality{GOOD,FAIR,POOR};
    public abstract double getTip();
}
