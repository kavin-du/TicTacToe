import javax.swing.*;
import java.awt.*;

public class NewFrame {
    
    // creating new window to show winner
    public static void createNewFrame(String text){
        JFrame frame = new JFrame("Winner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20)); // set font and font size

        frame.add(label); // add label to frame
        frame.setPreferredSize(new Dimension(200,150));
        frame.pack();
        frame.setLocationRelativeTo(null); // start window in center of screen
        frame.setVisible(true);
    }
}