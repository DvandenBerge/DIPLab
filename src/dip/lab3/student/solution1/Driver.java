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
        Transmitter writer1 = new ConsoleWriter();
        Transmitter writer2 = new GUIViewer();
        
        //MessageService keyToConsole = new MessageService(reader1,writer1);
        //keyToConsole.printMessage();
        
        //MessageService keyToGUI = new MessageService(reader1,writer2);
        //keyToGUI.printMessage();
        
        //MessageService fileToConsole = new MessageService(reader2,writer1);
        //fileToConsole.printMessage();
        
        MessageService fileToGUI = new MessageService(reader2,writer2);
        fileToGUI.printMessage();
        
    }
    
}
