package dip.lab3.student.solution1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author dvandenberge
 */
public class FileReader implements InputReader{
    private String message;
    private File file;
    private Scanner in;
    
    public FileReader(File file) throws IOException{
        this.file=file;
        this.in=new Scanner(this.file);
        this.message="";
        this.setMessage();
    }
    
    @Override
    public final void setMessage(){
        String line="";
        while(in.hasNext()){
            line=in.nextLine();
            this.message+=(line+" ");
        }    
    }
    
    @Override
    public final String getMessage(){
        return this.message;
    }
}
