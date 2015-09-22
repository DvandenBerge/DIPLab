package dip.lab3.student.solution1;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author dvandenberge
 */
public class FileWriter implements Transmitter{
    
    @Override
    public void transmit(InputReader reader){
       try{
            PrintWriter writer = new PrintWriter("C:\\outputfile.txt","UTF-8");
            writer.println(reader.getMessage());
       }catch(IOException e){
           System.out.println("Error");
       }
    }
}
