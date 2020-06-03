import javax.swing.*;
import java.awt.*;

public class NewFrame {

    public static void createNewFrame(String text){

        JFrame frame = new JFrame("Winner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        frame.add(label);
        frame.setPreferredSize(new Dimension(200,150));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}