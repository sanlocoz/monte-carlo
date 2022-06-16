import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Point;
import java.util.Random;
import javax.swing.JComponent;

public class MonteCarloComponent extends JComponent{
    private static final int tries = 10_000;
    
    private int hits = 0;
    private int now = 0;
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle border = new Rectangle(50, 50, 400, 400);
        Ellipse2D.Double circle = new Ellipse2D.Double(50, 50, 400, 400);

        g2.setStroke(new BasicStroke(2));
        g2.draw(border);
        
        g2.setColor(Color.BLUE);

        g2.draw(circle);
        
        for(int i = 0; i <= tries; i++)
        {
            Random generator = new Random();
            double r = generator.nextDouble();
            double x = -200 + 400 * r;
            r = generator.nextDouble();
            double y = -200 + 400 * r;

            if(x * x + y * y <= 200 * 200)
            {
                hits++;
                Ellipse2D.Double p = new Ellipse2D.Double(x + 250, y + 250, 2, 2);
                g2.setColor(Color.BLUE);
                g2.draw(p);
            }
            else
            {
                Ellipse2D.Double p = new Ellipse2D.Double(x + 250, y + 250, 2, 2);
                g2.setColor(Color.RED);
                g2.draw(p);
            }
            
            now++;
            
            double piEstimate = 4.0 * hits / now;
        }
    }
}
