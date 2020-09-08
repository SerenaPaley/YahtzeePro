import javax.swing.*;
import java.awt.*;
public class DiceRoll extends JComponent {

    public static void square(Graphics g, int distance, int num) {
        System.out.println("Trying to print dice");
        g.drawRect(distance, 50, 100, 100);
        g.setColor(Color.black);
        g.fillRect(distance, 50, 100, 100);


        switch (num) {
            //print and fill circles on the squares to look like dice
            case 1:
                g.drawOval(distance+40, 90, 15, 15);       //dice value of 1
                g.setColor(Color.white);
                g.fillOval(distance+40, 90, 15, 15);
                break;      //fill
            case 2:
                g.drawOval(distance+16, 66, 15, 15);       //dice value of 2
                g.drawOval(distance+65, 115, 15, 15);       //dice value of 2
                g.setColor(Color.white);
                g.fillOval(distance+16, 66, 15, 15);     //fill
                g.fillOval(distance+65, 115, 15, 15);
                break;
            case 3:
                g.drawOval(distance+16, 66, 15, 15);       //dice value of 2
                g.drawOval(distance+65, 115, 15, 15);       //dice value of 2
                g.drawOval(distance+40, 90, 15, 15);       //dice value of 2 middle spot
                g.setColor(Color.white);
                g.fillOval(distance+16, 66, 15, 15);     //fill
                g.fillOval(distance+65, 115, 15, 15);
                g.fillOval(distance+40, 90, 15, 15);
                break;
            case 4:
                g.drawOval(distance+16, 66, 15, 15);       //dice value of 2
                g.drawOval(distance+16, 115, 15, 15);       //dice value of 2
                g.drawOval(distance+65, 66, 15, 15);       //dice value of 2 middle spot
                g.drawOval(distance+65, 115, 15, 15);       //dice value of 2
                g.setColor(Color.white);
                g.fillOval(distance+16, 66, 15, 15);     //fill
                g.fillOval(distance+16, 115, 15, 15);
                g.fillOval(distance+65, 66, 15, 15);
                g.fillOval(distance+65, 115, 15, 15);
                break;
            case 5:
                g.drawOval(distance+16, 66, 15, 15);       //dice value of 2
                g.drawOval(distance+16, 115, 15, 15);       //dice value of 2
                g.drawOval(distance+65, 66, 15, 15);       //dice value of 2
                g.drawOval(distance+65, 115, 15, 15);       //dice value of 2
                g.drawOval(distance+40, 90, 15, 15);
                g.setColor(Color.white);
                g.fillOval(distance+16, 66, 15, 15);     //fill
                g.fillOval(distance+16, 115, 15, 15);
                g.fillOval(distance+65, 66, 15, 15);
                g.fillOval(distance+65, 115, 15, 15);
                g.fillOval(distance+40, 90, 15, 15);
                break;
            case 6:
                g.drawOval(distance+16, 66, 15, 15);       //dice value of 2
                g.drawOval(distance+16, 90, 15, 15);       //dice value of 2
                g.drawOval(distance+16, 115, 15, 15);       //dice value of 2
                g.drawOval(distance+65, 115, 15, 15);       //dice value of 2
                g.drawOval(distance+65, 90, 15, 15);
                g.drawOval(distance+65, 66, 15, 15);
                g.setColor(Color.white);
                g.fillOval(distance+16, 66, 15, 15);     //fill
                g.fillOval(distance+16, 90, 15, 15);
                g.fillOval(distance+16, 115, 15, 15);
                g.fillOval(distance+65, 115, 15, 15);
                g.fillOval(distance+65, 90, 15, 15);
                g.fillOval(distance+65, 66, 15, 15);
                break;






        }

    }
}

