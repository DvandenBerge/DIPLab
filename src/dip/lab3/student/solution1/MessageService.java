package dip.lab3.student.solution1;

/**
 * @author dvandenberge
 */
public class MessageService {
    private InputReader reader;
    private OutputWriter writer;
    
    public MessageService(InputReader reader,OutputWriter writer){
        this.reader=reader;
        this.writer=writer;
    }
    
    public void printMessage(){
        writer.printMessage(reader);
    }
}
