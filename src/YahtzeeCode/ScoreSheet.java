package YahtzeeCode;

import javax.swing.*;
import java.awt.*;


public class ScoreSheet{
    public JPanel panel = new JPanel();
    JLabel title = new JLabel("Yahtzee Pro");
    JLabel upper = new JLabel("Upper");
    JLabel player1 = new JLabel("Player 1");
    JLabel player2 = new JLabel("Player 2");

    JLabel ones = new JLabel("1's");
    JLabel onesHowTo = new JLabel("Add all 1's");
    JTextField ones1 = new JTextField();
    JTextField ones2 = new JTextField();

    JLabel twos = new JLabel("2's");
    JLabel twosHowTo = new JLabel("Add all 2's");
    JTextField twos1 = new JTextField();
    JTextField twos2 = new JTextField();

    JLabel threes = new JLabel("3's");
    JLabel threesHowTo = new JLabel("Add all 3's");
    JTextField threes1 = new JTextField();
    JTextField threes2 = new JTextField();

    JLabel fours = new JLabel("4's");
    JLabel foursHowTo = new JLabel("Add all 4's");
    JTextField fours1 = new JTextField();
    JTextField fours2 = new JTextField();

    JLabel fives = new JLabel("5's");
    JLabel fivesHowTo = new JLabel("Add all 5's");
    JTextField fives1 = new JTextField();
    JTextField fives2 = new JTextField();

    JLabel sixes = new JLabel("6's");
    JLabel sixesHowTo = new JLabel("Add all 6's");
    JTextField sixes1 = new JTextField();
    JTextField sixes2 = new JTextField();

    //total upper score
    JLabel upperTotalBeforeBonus = new JLabel("Upper Total");
    JLabel arrow = new JLabel("---->");
    JTextField upperTotalBB1 = new JTextField();
    JTextField upperTotalBB2 = new JTextField();

    //bonus row
    JLabel bonus = new JLabel("Bonus," + "\n" + "upper total >= 63");
    JLabel score35 = new JLabel("Plus 35");
    JTextField bonus1 = new JTextField();
    JTextField bonus2 = new JTextField();

    //upper final
    JLabel upperTotal = new JLabel("FINAL UPPER TOTAL");
    JLabel arrow1 = new JLabel("---->");
    JTextField upperTotal1 = new JTextField();
    JTextField upperTotal2 = new JTextField();

    //Lower section
    JLabel lower = new JLabel("LOWER");
    //use blank

    //3 of a kind
    JLabel kind3 = new JLabel("3 of a kind");
    JLabel kind3HowTo = new JLabel("Add dice total");
    JTextField kind31 = new JTextField();
    JTextField kind32 = new JTextField();

    //4 of a kind
    JLabel kind4 = new JLabel("4 of a kind");
    JLabel kind4HowTo = new JLabel("Add dice total");
    JTextField kind41 = new JTextField();
    JTextField kind42 = new JTextField();

    //full house
    JLabel fullhouse = new JLabel("Full House");
    JLabel fullhouseHowTo = new JLabel("SCORE 25");
    JTextField fullhouse1 = new JTextField();
    JTextField fullhouse2 = new JTextField();

    //small straight
    JLabel smStraight = new JLabel("Small Straight");
    JLabel smStraightHowTo = new JLabel("SCORE 30");
    JTextField smStraight1 = new JTextField();
    JTextField smStraight2 = new JTextField();

    //large straight
    JLabel lgStraight = new JLabel("Large Straight");
    JLabel lgStraightHowTo = new JLabel("SCORE 40");
    JTextField lgStraight1 = new JTextField();
    JTextField lgStraight2 = new JTextField();

    //yahtzee
    JLabel yahtzee = new JLabel("YAHTZEE");
    JLabel yahtzeeHowTo = new JLabel("SCORE 50!");
    JTextField yahtzee1 = new JTextField();
    JTextField yahtzee2 = new JTextField();

    //chance
    JLabel chance = new JLabel("Chance");
    JLabel chanceHowTo = new JLabel("Add dice total");
    JTextField chance1 = new JTextField();
    JTextField chance2 = new JTextField();

    //lower final
    JLabel lowerTotal = new JLabel("FINAL LOWER TOTAL");
    JLabel arrow2 = new JLabel("---->");
    JTextField lowerTotal1 = new JTextField();
    JTextField lowerTotal2 = new JTextField();

    //grand total
    JLabel grandTotal = new JLabel("GRAND TOTAL");
    JLabel arrow3 = new JLabel("---->");
    JTextField grandTotal1 = new JTextField();
    JTextField grandTotal2 = new JTextField();





    public ScoreSheet(int width, int height){

        this.panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4,75,4,75);
        panel.setBounds(0,(height/5) , width, (height/2)+100);

        c.gridx = 0;
        c.gridy = 0;
        panel.add(title,c);

        c.gridx = 1;
        c.gridy = 0;
        panel.add(upper,c);

        c.gridx = 2;
        c.gridy = 0;
        panel.add(player1,c);

        c.gridx = 3;
        c.gridy = 0;
        panel.add(player2,c);

        //ONES
        c.gridx = 0;
        c.gridy = 1;
        panel.add(ones,c);

        c.gridx = 1;
        c.gridy = 1;
        panel.add(onesHowTo,c);

        c.gridx = 2;
        c.gridy = 1;
        panel.add(ones1,c);

        c.gridx = 3;
        c.gridy = 1;
        panel.add(ones2,c);

        //TWOS
        c.gridx = 0;
        c.gridy = 2;
        panel.add(twos,c);

        c.gridx = 1;
        c.gridy = 2;
        panel.add(twosHowTo,c);

        c.gridx = 2;
        c.gridy = 2;
        panel.add(twos1,c);

        c.gridx = 3;
        c.gridy = 2;
        panel.add(twos2,c);

        //THREES
        c.gridx = 0;
        c.gridy = 3;
        panel.add(threes,c);

        c.gridx = 1;
        c.gridy = 3;
        panel.add(threesHowTo,c);

        c.gridx = 2;
        c.gridy = 3;
        panel.add(threes1,c);

        c.gridx = 3;
        c.gridy = 3;
        panel.add(threes2,c);

        //FOURS
        c.gridx = 0;
        c.gridy = 4;
        panel.add(fours,c);

        c.gridx = 1;
        c.gridy = 4;
        panel.add(foursHowTo,c);

        c.gridx = 2;
        c.gridy = 4;
        panel.add(fours1,c);

        c.gridx = 3;
        c.gridy = 4;
        panel.add(fours2,c);

        //FIVES
        c.gridx = 0;
        c.gridy = 5;
        panel.add(fives,c);

        c.gridx = 1;
        c.gridy = 5;
        panel.add(fivesHowTo,c);

        c.gridx = 2;
        c.gridy = 5;
        panel.add(fives1,c);

        c.gridx = 3;
        c.gridy = 5;
        panel.add(fives2,c);

        //SIXES
        c.gridx = 0;
        c.gridy = 6;
        panel.add(sixes,c);

        c.gridx = 1;
        c.gridy = 6;
        panel.add(sixesHowTo,c);

        c.gridx = 2;
        c.gridy = 6;
        panel.add(sixes1,c);

        c.gridx = 3;
        c.gridy = 6;
        panel.add(sixes2,c);

        //Upper total before bonus
        c.gridx = 0;
        c.gridy = 7;
        panel.add(upperTotalBeforeBonus,c);

        c.gridx = 1;
        c.gridy = 7;
        panel.add(arrow,c);

        c.gridx = 2;
        c.gridy = 7;
        panel.add(upperTotalBB1,c);

        c.gridx = 3;
        c.gridy = 7;
        panel.add(upperTotalBB2,c);

        //bonus
        c.gridx = 0;
        c.gridy = 8;
        panel.add(bonus,c);

        c.gridx = 1;
        c.gridy = 8;
        panel.add(score35,c);

        c.gridx = 2;
        c.gridy = 8;
        panel.add(bonus1,c);

        c.gridx = 3;
        c.gridy = 8;
        panel.add(bonus2,c);

        //upper total
        c.gridx = 0;
        c.gridy = 9;
        panel.add(upperTotal,c);

        c.gridx = 1;
        c.gridy = 9;
        panel.add(arrow1,c);

        c.gridx = 2;
        c.gridy = 9;
        panel.add(upperTotal1,c);

        c.gridx = 3;
        c.gridy = 9;
        panel.add(upperTotal2,c);

        //lower start
        c.gridx = 0;
        c.gridy = 10;
        panel.add(lower,c);

//        c.gridx = 1;
//        c.gridy = 10;
//        panel.add(blank,c);
//
//        c.gridx = 2;
//        c.gridy = 10;
//        panel.add(blank,c);
//
//        c.gridx = 3;
//        c.gridy = 10;
//        panel.add(blank,c);

        //3 of a kind
        c.gridx = 0;
        c.gridy = 11;
        panel.add(kind3,c);

        c.gridx = 1;
        c.gridy = 11;
        panel.add(kind3HowTo,c);

        c.gridx = 2;
        c.gridy = 11;
        panel.add(kind31,c);

        c.gridx = 3;
        c.gridy = 11;
        panel.add(kind32,c);

        //4 of a kind
        c.gridx = 0;
        c.gridy = 12;
        panel.add(kind4,c);

        c.gridx = 1;
        c.gridy = 12;
        panel.add(kind4HowTo,c);

        c.gridx = 2;
        c.gridy = 12;
        panel.add(kind41,c);

        c.gridx = 3;
        c.gridy = 12;
        panel.add(kind42,c);

        //fullhouse
        c.gridx = 0;
        c.gridy = 13;
        panel.add(fullhouse,c);

        c.gridx = 1;
        c.gridy = 13;
        panel.add(fullhouseHowTo,c);

        c.gridx = 2;
        c.gridy = 13;
        panel.add(fullhouse1,c);

        c.gridx = 3;
        c.gridy = 13;
        panel.add(fullhouse2,c);

        //small straight
        c.gridx = 0;
        c.gridy = 14;
        panel.add(smStraight,c);

        c.gridx = 1;
        c.gridy = 14;
        panel.add(smStraightHowTo,c);

        c.gridx = 2;
        c.gridy = 14;
        panel.add(smStraight1,c);

        c.gridx = 3;
        c.gridy = 14;
        panel.add(smStraight2,c);

        //large straight
        c.gridx = 0;
        c.gridy = 15;
        panel.add(lgStraight,c);

        c.gridx = 1;
        c.gridy = 15;
        panel.add(lgStraightHowTo,c);

        c.gridx = 2;
        c.gridy = 15;
        panel.add(lgStraight1,c);

        c.gridx = 3;
        c.gridy = 15;
        panel.add(lgStraight2,c);

        //yahtzee
        c.gridx = 0;
        c.gridy = 16;
        panel.add(yahtzee,c);

        c.gridx = 1;
        c.gridy = 16;
        panel.add(yahtzeeHowTo,c);

        c.gridx = 2;
        c.gridy = 16;
        panel.add(yahtzee1,c);

        c.gridx = 3;
        c.gridy = 16;
        panel.add(yahtzee2,c);

        //chance
        c.gridx = 0;
        c.gridy = 17;
        panel.add(chance,c);

        c.gridx = 1;
        c.gridy = 17;
        panel.add(chanceHowTo,c);

        c.gridx = 2;
        c.gridy = 17;
        panel.add(chance1,c);

        c.gridx = 3;
        c.gridy = 17;
        panel.add(chance2,c);

        //lower total
        c.gridx = 0;
        c.gridy = 18;
        panel.add(lowerTotal,c);

        c.gridx = 1;
        c.gridy = 18;
        panel.add(arrow2,c);

        c.gridx = 2;
        c.gridy = 18;
        panel.add(lowerTotal1,c);

        c.gridx = 3;
        c.gridy = 18;
        panel.add(lowerTotal2,c);

        //lower total
        c.gridx = 0;
        c.gridy = 19;
        panel.add(grandTotal,c);

        c.gridx = 1;
        c.gridy = 19;
        panel.add(arrow3,c);

        c.gridx = 2;
        c.gridy = 19;
        panel.add(grandTotal1,c);

        c.gridx = 3;
        c.gridy = 19;
        panel.add(grandTotal2,c);


        panel.setVisible(true);
        
    }
}
