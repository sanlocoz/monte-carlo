import javax.swing.JFrame;

public class MonteCarloViewer {
    public static void main(String[] args)
    {
        JFrame frame = new MonteCarloFrame();
        frame.setTitle("Monte Carlo Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
