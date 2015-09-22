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
    }
    
    public FileReader(){
        this.file=new File("Newfile.txt");
    }
    
    @Override
    public void setMessage(){
        try{
            Scanner in=new Scanner(file);
            
            while(in.hasNext()){
                String line = in.nextLine();
                this.message+=line+" ";
            }
        }catch(IOException e){
            System.out.println("Error");
        }
        
    }
    
    @Override
    public String getMessage(){
        return this.message;
    }
}
