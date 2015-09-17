package dip.lab3.student.solution1;

import java.io.File;
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
    
    @Override
    public void setMessage() throws IOException{
        Scanner in=new Scanner(file);
    }
    
    @Override
    public String getMessage(){
        return this.message;
    }
}
