package dip.lab3.student.solution1;

import java.io.File;

/**
 * @author dvandenberge
 */
public class Driver {
    public static void main(String[] args) {
        
        File inputFile=new File("C:\\input.txt");
        
        InputReader reader1 = new KeyboardReader();
        InputReader reader2 = new FileReader(inputFile);
        OutputWriter writer1 = new ConsoleWriter();
        OutputWriter writer2 = new GUIWriter();
        
        //MessageService keyToGUI = new MessageService(reader1,writer2);
        //keyToGUI.printMessage();
        
        //MessageService fileToConsole = new MessageService(reader2,writer1);
        //fileToConsole.printMessage();
        
        MessageService fileToGUI = new MessageService(reader2,writer2);
        fileToGUI.printMessage();
    }
    
}
