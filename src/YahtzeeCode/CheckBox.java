package YahtzeeCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class CheckBox extends JPanel {
    public void makeBox(int space){

    JCheckBox d1,d2,d3,d4,d5;       //checkboxes for 5 dice
    JLabel l1,l2,l3,l4,l5;         //labels for 5 dice
    GridBagConstraints layout = new GridBagConstraints();


      setLayout(new GridBagLayout());

      layout.insets = new Insets(10,10,3,3);
      layout.weightx = 20;
      layout.weighty = 5;
      layout.gridy = 0;

        //create and add 5 labels(empty)
        d1 = new JCheckBox("Keep",false);
        d1.setSize(15,15);
        d1.setLocation(new Point(0,400));
        d1.setLocation( 50,800);
        layout.gridx = 50;
        layout.gridy = 50;

        d1.setVisible(true);
      l1 = new JLabel("");
        System.out.println("checkbox");


      l2 = new JLabel("");


      l3 = new JLabel("");


      l4 = new JLabel("");


      l5 = new JLabel("");


      d1 = new JCheckBox("Keep");
      layout.gridx = 50;
      layout.gridy = 50;
      add(d1,layout);



      d2 = new JCheckBox("Keep");
      layout.gridx = 11;
      layout.gridy = 1;
      add(d2,layout);



      d3 = new JCheckBox("Keep");
      layout.gridx = 21;
      layout.gridy = 1;
      add(d3,layout);

      d4 = new JCheckBox("Keep");
      layout.gridx = 4;
      layout.gridy = 1;
      add(d4,layout);


      d5 = new JCheckBox("Keep");
      layout.gridx = 5;
      layout.gridy = 1;
      add(d5,layout);

      event e = new event() {
          @Override
          public void itemStateChanged(ItemEvent e) {

          }
      };
      d1.addItemListener(e);
      d2.addItemListener(e);
      d3.addItemListener(e);
      d4.addItemListener(e);
      d5.addItemListener(e);


    }

    public abstract class event implements ItemListener {
        public void itemStateChanged (ItemEvent e) {

//            if(d1.isSelected())
//            {
//                l1.setText("Kept");
//            } else{
//                l1.setText("");
//            }//else 1
//
//            if(d2.isSelected())
//            {
//                l2.setText("Kept");
//            } else{
//                l2.setText("");
//            }//else 2
//
//            if(d3.isSelected())
//            {
//                l3.setText("Kept");
//            } else{
//                l3.setText("");
//            }//else 3
//
//            if(d4.isSelected())
//            {
//                l4.setText("Kept");
//            } else{
//                l4.setText("");
//            }//else 4
//
//            if(d5.isSelected())
//            {
//                l5.setText("Kept");
//            } else{
//                l5.setText("");
//            }//else 5
//





        }


    }

}
