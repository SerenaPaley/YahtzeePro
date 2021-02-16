import javax.swing.*;
import java.awt.*;
public class DiceRoll extends JComponent {
//creates a dice image based on the randomly generated number
    public static void square(Graphics g, int distance, int num) {
        System.out.println("Trying to print dice");
        g.drawRect(distance, 50, 100, 100);     //create a black square
        Color mycolour = new Color(0, 165, 190);
        g.setColor(mycolour);
        g.fillRect(distance, 50, 100, 100);
        JCheckBox b = new JCheckBox("Keep",false);
        b.setVisible(true);
        b.setBounds(60,60,15,15);

        switch (num) {
            //print and fill circles on the squares to look like dice
            case 1:
                g.drawOval(distance+40, 90, 15, 15);       //dice value 1
                g.setColor(Color.black);
                g.fillOval(distance+40, 90, 15, 15);
                break;      //fill
            case 2:
                g.drawOval(distance+16, 66, 15, 15);       //dice value 2
                g.drawOval(distance+65, 115, 15, 15);
                g.setColor(Color.black);
                g.fillOval(distance+16, 66, 15, 15);
                g.fillOval(distance+65, 115, 15, 15);
                break;
            case 3:
                g.drawOval(distance+16, 66, 15, 15);       //dice value 3
                g.drawOval(distance+65, 115, 15, 15);
                g.drawOval(distance+40, 90, 15, 15);
                g.setColor(Color.black);
                g.fillOval(distance+16, 66, 15, 15);
                g.fillOval(distance+65, 115, 15, 15);
                g.fillOval(distance+40, 90, 15, 15);
                break;
            case 4:
                g.drawOval(distance+16, 66, 15, 15);       //dice value 4
                g.drawOval(distance+16, 115, 15, 15);
                g.drawOval(distance+65, 66, 15, 15);
                g.drawOval(distance+65, 115, 15, 15);
                g.setColor(Color.black);
                g.fillOval(distance+16, 66, 15, 15);
                g.fillOval(distance+16, 115, 15, 15);
                g.fillOval(distance+65, 66, 15, 15);
                g.fillOval(distance+65, 115, 15, 15);
                break;
            case 5:
                g.drawOval(distance+16, 66, 15, 15);       //dice value 5
                g.drawOval(distance+16, 115, 15, 15);
                g.drawOval(distance+65, 66, 15, 15);
                g.drawOval(distance+65, 115, 15, 15);
                g.drawOval(distance+40, 90, 15, 15);
                g.setColor(Color.black);
                g.fillOval(distance+16, 66, 15, 15);
                g.fillOval(distance+16, 115, 15, 15);
                g.fillOval(distance+65, 66, 15, 15);
                g.fillOval(distance+65, 115, 15, 15);
                g.fillOval(distance+40, 90, 15, 15);
                break;
            case 6:
                g.drawOval(distance+16, 66, 15, 15);       //dice value 6
                g.drawOval(distance+16, 90, 15, 15);
                g.drawOval(distance+16, 115, 15, 15);
                g.drawOval(distance+65, 115, 15, 15);
                g.drawOval(distance+65, 90, 15, 15);
                g.drawOval(distance+65, 66, 15, 15);
                g.setColor(Color.black);
                g.fillOval(distance+16, 66, 15, 15);
                g.fillOval(distance+16, 90, 15, 15);
                g.fillOval(distance+16, 115, 15, 15);
                g.fillOval(distance+65, 115, 15, 15);
                g.fillOval(distance+65, 90, 15, 15);
                g.fillOval(distance+65, 66, 15, 15);
                break;

        }

    }
}



