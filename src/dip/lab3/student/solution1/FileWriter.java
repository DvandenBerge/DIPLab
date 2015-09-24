package dip.lab3.student.solution1;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author dvandenberge
 */
public class FileWriter implements Transmitter{
    private PrintWriter writer;
    
    public FileWriter() throws IOException{
        this.writer=new PrintWriter("C:\\outputfile.txt","UTF-8");
    }
    
    @Override
    public void transmit(InputReader reader){
        String message=reader.getMessage();
        System.out.println(message);
        writer.println(message);
        writer.close();
    }
}
