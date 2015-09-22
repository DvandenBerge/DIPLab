package dip.lab3.student.solution1;

/**
 *
 * @author dvandenberge
 */
public class ConsoleWriter implements Transmitter{
    
    @Override
    public final void transmit(InputReader reader){
        System.out.println(reader.getMessage());
    }
}
