import javax.swing.JFrame;

public class MonteCarloFrame extends JFrame {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 600;
   
    private MonteCarloComponent frame;
    
    public MonteCarloFrame()
    {
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame = new MonteCarloComponent();
        this.add(frame);
    }
    
}
