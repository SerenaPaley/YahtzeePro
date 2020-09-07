//package YahtzeeCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


//public class DiceGUI extends JFrame implements  ActionListener{}

public class YahtzeePro {

    static JLabel result = new JLabel("");

    public static void main(String[] args) {
        JFrame frame = new JFrame("YahtzeePro");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.add(result);

        
        JButton button = new JButton("Roll!");
        panel.add(button);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("It worked");
                //roll dice and print the result
                Random rand = new Random();
                int num = rand.nextInt(6);   //gives a number between 0-5
                num = num + 1; // changes number to be between 1-6
                result.setText("You got a " + num);
                panel.add(result);



                /* print the result */
                //JPanel result = new JPanel();
                //result.setText("You got a " +num);
                //result.setVisible(true);
                //result.setSize(500,500);
                //JTextField result = new JTextField("You got a " +num);
                //panel.add(result);
                //JOptionPane.showMessageDialog(null, "You got a " +num);
            }
        }); {
        };
//
//         class button implements ActionListener{
//
//            public void actionPerformed(ActionEvent e) {
//                //roll dice and print the result
//                Random rand = new Random();
//
//                int num = rand.nextInt(6);   //gives a number between 0-5
//                num = num + 1; // changes number to be between 1-6
//                //print the result
//                //JDialog result = new JDialog(frame, "You got a "+num);
//
//
//                //JLabel result = new JLabel ("You got a " + num);
//                //JPanel panel = new JPanel();
//                //fr.add(panel);
//                //panel.add(result);
//                //result.setVisible(true);
//
//            }
//        }

    }

}

