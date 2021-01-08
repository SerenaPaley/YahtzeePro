package YahtzeeCode;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;


public class ScoreSheet extends JPanel {

    public void ScoreSheet()
    {   //main panel
        JPanel grid = new JPanel();
        //title panel
        JPanel titlePanel = new JPanel();
        titlePanel();
        //add grid to main panel
        grid.setLayout(new GridLayout(19,7));
        this.add(grid);
        setVisible(true);

        //add to main panel
        grid.add(titlePanel);


        //GridLayout sheet = new GridLayout(19,7);
    }

    private void titlePanel(){
        JPanel titlePanel = new JPanel();
        //top row
        titlePanel.setLayout(new GridLayout(1,1));
        titlePanel.setBackground(Color.gray);
        //change colour and print message
        JLabel titleLabel = new JLabel("YAHTZEE PRO");
        titleLabel.setForeground(ColorUIResource.white);
        //print
        //add label
        titlePanel.add(titleLabel, BorderLayout.CENTER);


    }




}
