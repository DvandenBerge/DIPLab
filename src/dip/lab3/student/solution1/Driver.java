package dip.lab3.student.solution1;

/**
 * @author dvandenberge
 */
public class Driver {
    public static void main(String[] args) {
        InputReader reader1 = new KeyboardReader();
        InputReader reader2 = new FileReader();
        OutputWriter writer1 = new ConsoleWriter();
        OutputWriter writer2 = new GUIWriter();
        MessageService keyToGUI = new MessageService(reader1,writer2);
        keyToGUI.printMessage();
    }
    
}
