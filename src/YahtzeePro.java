//package YahtzeeCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;





public class YahtzeePro extends JPanel {

    static JLabel result = new JLabel("");





    public static void main(String[] args) {
        JFrame frame = new JFrame("YahtzeePro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1190,1190);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.add(result);


        JButton button = new JButton("Roll!");
        button.setFont(new Font("Roll!", Font.BOLD, 40));
        button.setPreferredSize(new Dimension(150,50));

        panel.add(button);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("It worked");
                //roll dice and print the result

                //result.setText("You got a " + num);
                //panel.add(result);

                DiceRoll dice1 = new DiceRoll();
                DiceRoll dice2 = new DiceRoll();
                DiceRoll dice3 = new DiceRoll();
                DiceRoll dice4 = new DiceRoll();
                DiceRoll dice5 = new DiceRoll();
                //create an array of dice
                DiceRoll dice[]= new DiceRoll[5];
                for(int k=0;k<5;k++)
                {

                   dice[k] = new DiceRoll();
                    panel.add(dice[k]);
                    Random rand = new Random();
                    int num = rand.nextInt(6);   //gives a number between 0-5
                    num = num + 1; // changes number to be between 1-6
                    dice[k].square(panel.getGraphics(), 50+(200*k), num);

                }







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

