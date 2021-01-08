//package YahtzeeCode;

import YahtzeeCode.ScoreSheet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class YahtzeePro extends JPanel {


    static JLabel result = new JLabel("yooooo");

    public static void main(String[] args) {
        JFrame frame = new JFrame("YahtzeePro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        int width = 1000;
        int height = 1190;
        frame.setSize(width, height);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        panel.setBounds(0, 0, width, height);

        panel.add(result);

        JCheckBox box[] = new JCheckBox[6];   //make 5 new checkboxes (no box[0])**
        //checkboxes **
        box[1] = new JCheckBox("Keep", false);
        box[1].setLocation(50, 125);
        box[1].setSize(190, 100);

        box[2] = new JCheckBox("Keep", false);
        box[2].setLocation(260, 125);
        box[2].setSize(190, 100);

        box[3] = new JCheckBox("Keep", false);
        box[3].setLocation(460, 125);
        box[3].setSize(190, 100);

        box[4]= new JCheckBox("Keep", false);
        box[4].setLocation(660, 125);
        box[4].setSize(190, 100);

        box[5] = new JCheckBox("Keep", false);
        box[5].setLocation(860, 125);
        box[5].setSize(190, 100);

        JButton button = new JButton("Roll!");
        button.setFont(new Font("Roll!", Font.BOLD, 35));
        button.setSize(new Dimension(150, 48));
        //button.setHorizontalAlignment(JButton.CENTER);
        //button.setVerticalAlignment(JButton.BOTTOM);
        button.setLocation(width/2 -(75), 0);

        //panel.setLocation(0, 0);
        panel.add(box[1]);
        panel.add(box[2]);
        panel.add(box[3]);
        panel.add(box[4]);
        panel.add(box[5]);
        panel.add(button);
        //panel2.setLocation(0, 301);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("It worked");
                //roll dice and print the result

                DiceRoll dice[] = new DiceRoll[5];   //make 5 new dice
                for (int k = 0; k < 5; k++) {
                    //check if user wants to keep
                    if (box[k+1].isSelected())
                        System.out.println("true checkbox");

                        else
                            {
                        dice[k] = new DiceRoll();
                        panel.add(dice[k]);
                        Random rand = new Random();
                        int num = rand.nextInt(6);   //gives a number between 0-5
                        num = num + 1; // changes number to be between 1-6


                        dice[k].square(panel.getGraphics(), 50 + (200 * k), num);
                    }
                }//for
            }//actioned performed

        });

        ScoreSheet card = new ScoreSheet();
        panel.add(card);
        //card.grid();
        System.out.println("making a sheet");
        frame.add(panel);
        frame.setVisible(true);


    }

    public static class CheckBox2 {
        public class CheckBox extends JPanel {
            public void makeBox(int space) {

                //create and add 5 labels(empty)
                JCheckBox d1 = new JCheckBox("Keep", false);
                d1.setSize(15, 15);
                d1.setLocation(new Point(0, 400));


                d1.setVisible(true);
                System.out.println("checkbox");

                //
            }
        }
    }
}

