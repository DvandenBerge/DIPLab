package dip.lab3.student.solution1;

import java.io.File;
import java.io.IOException;

/**
 * @author dvandenberge
 */
public class Driver {
    public static void main(String[] args) throws IOException {
        
        File inputFile=new File("C:\\input.txt");
        
        InputReader reader1 = new KeyboardReader();
        InputReader reader2 = new FileReader(inputFile);
        Transmitter writer1 = new ConsoleWriter();
        Transmitter writer2 = new GUIViewer();
        Transmitter writer3 = new FileWriter();
        
        //MessageService keyToConsole = new MessageService(reader1,writer1);
        //keyToConsole.printMessage();
        
        //MessageService keyToGUI = new MessageService(reader1,writer2);
        //keyToGUI.printMessage();
        
        //MessageService fileToConsole = new MessageService(reader2,writer1);
        //fileToConsole.printMessage();
        
        //MessageService fileToGUI = new MessageService(reader2,writer2);
        //fileToGUI.printMessage();
        
        //MessageService fileToFile = new MessageService(reader2,writer3);
        //fileToFile.printMessage();
        
        MessageService consoleToFile = new MessageService(reader1,writer3);
        consoleToFile.printMessage();
        
    }
    
}
