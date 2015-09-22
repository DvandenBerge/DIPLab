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
    
    public FileReader(File file){
        this.file=file;
        this.setMessage();
    }
    
    @Override
    public final void setMessage(){
        try{
            Scanner in=new Scanner(this.file);
            while(in.hasNext()){
                String line = in.nextLine();
                this.message+=line+" ";
                
            }
        }catch(IOException e){
            System.out.println("Error");
        }
        
    }
    
    @Override
    public final String getMessage(){
        return this.message;
    }
}
