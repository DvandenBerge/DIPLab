package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 * @author dvandenberge
 */
public class KeyboardReader implements InputReader{
    private String message;
    private Scanner in = new Scanner(System.in);
    
    public KeyboardReader(){
        this.setMessage();
    }
    
    @Override
    public final void setMessage(){
        this.message=in.nextLine();
    }
    
    @Override
    public final String getMessage(){
        return this.message;
    }
}
