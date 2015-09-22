package dip.lab3.student.solution1;

/**
 *
 * @author dvandenberge
 */
public class ConsoleWriter implements OutputWriter{
    
    @Override
    public final void printMessage(InputReader reader){
        System.out.println(reader.getMessage());
    }
}
