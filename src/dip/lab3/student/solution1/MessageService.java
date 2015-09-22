package dip.lab3.student.solution1;

/**
 * @author dvandenberge
 */
public class MessageService {
    private InputReader reader;
    private Transmitter writer;
    
    /**
     * 
     * @param reader a keyboard reader or file reader is able to be passed into the MessageService, determining where the message comes from
     * @param writer a console writer or GUI(JOptionPane) writer is able to be passed into MessageService, determining how the message is displayed
     */
    public MessageService(InputReader reader,Transmitter writer){
        this.reader=reader;
        this.writer=writer;
    }
    
    public void printMessage(){
        writer.transmit(reader);
    }
}
