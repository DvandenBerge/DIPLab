package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author dvandenberge
 */
public class GUIViewer implements Transmitter{
    @Override
    public final void transmit(InputReader reader){
        JOptionPane.showMessageDialog(null,reader.getMessage());
    }
}
