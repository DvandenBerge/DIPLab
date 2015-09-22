package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author dvandenberge
 */
public class GUIWriter implements OutputWriter{
    @Override
    public final void printMessage(InputReader reader){
        JOptionPane.showMessageDialog(null,reader.getMessage());
    }
}
