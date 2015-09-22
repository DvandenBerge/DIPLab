package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 * @author dvandenberge
 */
public class KeyboardReader implements InputReader{
    private String message;
    private Scanner in = new Scanner(System.in);
    
    //When a KeyboardReader is instantiated, the message is set to null and the KeyboardReader immediately looks for keybaord input in the console
    public KeyboardReader(){
        this.message="";
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
