import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import jdk.jfr.Timespan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;

public class TicTacToe extends JPanel {

    // Jpanel panel;
    static JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

    public TicTacToe(JPanel panel) {
        super(new BorderLayout());
        b1 = new JButton("");
        b2 = new JButton("");
        b3 = new JButton("");
        b4 = new JButton("");
        b5 = new JButton("");
        b6 = new JButton("");
        b7 = new JButton("");
        b8 = new JButton("");
        b9 = new JButton("");

        // b1.setPreferredSize(new Dimension(50,50));
        b1.setBounds(30, 10, 100, 100);
        b2.setBounds(140, 10, 100, 100);
        b3.setBounds(250, 10, 100, 100);
        b4.setBounds(30, 120, 100, 100);
        b5.setBounds(140, 120, 100, 100);
        b6.setBounds(250, 120, 100, 100);
        b7.setBounds(30, 230, 100, 100);
        b8.setBounds(140, 230, 100, 100);
        b9.setBounds(250, 230, 100, 100);
        b1.addActionListener(new Action(b1, 0));
        b2.addActionListener(new Action(b2, 1));
        b3.addActionListener(new Action(b3, 2));
        b4.addActionListener(new Action(b4, 3));
        b5.addActionListener(new Action(b5, 4));
        b6.addActionListener(new Action(b6, 5));
        b7.addActionListener(new Action(b7, 6));
        b8.addActionListener(new Action(b8, 7));
        b9.addActionListener(new Action(b9, 8));
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        // add(panel);
        // add(b1, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setVisible(true);
        panel.setLayout(null);
        // frame.add(panel);

        JComponent newContentPane = new TicTacToe(panel);

        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.add(panel);
        frame.setPreferredSize(new Dimension(400, 400));
        frame.pack();
        frame.setLocationRelativeTo(null); // start in the center of screen

        frame.setVisible(true);

    }

    static class Action implements ActionListener {
        JButton b;
        int position;
        static Boolean flag = true;
        static Boolean isFilled = false;
        static int[][] array = new int[3][3];
        static int timesPressed = 0;

        public Action(JButton b, int position) {
            if (!isFilled) {
                ArrayOperations.ArrayFill(array, 3, 3);
                isFilled = true;
            }
            this.b = b;
            this.position = position;
        }

        public void actionPerformed(ActionEvent e) {
            if (timesPressed <= 9) {

                if (!(this.b.getText().equals("1") || this.b.getText().equals("2"))) {
                    if (flag) {
                        this.b.setText("1");
                        this.b.setFont(new Font("Arial", Font.BOLD, 20));
                        flag = false;
                        timesPressed++;
                        array[this.position / 3][this.position % 3] = 1;
                    } else {
                        this.b.setText("2");
                        this.b.setFont(new Font("Arial", Font.BOLD, 20));
                        flag = true;
                        timesPressed++;
                        array[this.position / 3][this.position % 3] = 2;
                    }
                }

                if (timesPressed < 9) {
                    int winner = Winner.checkWinnerBeforeFinish(array);
                    if (winner > 0) {
                        NewFrame.createNewFrame("Player " + winner + " wins.");
                        timesPressed = 10;
                    }
                } else if (timesPressed == 9) {
                    int winner = Winner.checkWinner(array);
                    timesPressed++;
                    if (winner != 0) {
                        NewFrame.createNewFrame("Player " + winner + " wins.");
                        
                    } else {
                        NewFrame.createNewFrame("Nobody wins.");
                    }
                }
            }

        }

    }
}