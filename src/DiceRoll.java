import javax.swing.*;
import java.awt.*;
public class DiceRoll extends JComponent {

    public static void square(Graphics g)
    {
        for(int i=0; i<5; i++) {
            int x=50;
            System.out.println("Trying to print dice");
            g.drawRect(x+(250*i), 50, 100, 100);
            g.setColor(Color.black);
            g.fillRect(x+(250*i), 50, 100, 100);
        }//for

    }

}

