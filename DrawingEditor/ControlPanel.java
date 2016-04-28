import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JColorChooser;
import java.awt.Canvas;
import java.awt.Color;
/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int frameWidth = 500;
    private static final int frameHeight = 500;
    private JPanel panel;
    private JLabel sampleText = new JLabel("Label");
    private DrawingPanel draw;
    private JButton button;
    private JButton button2;
    private JButton button3;
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        this.panel = new JPanel();
    
        this.button = new JButton( " Pick Color" );
        this.add(button);

        this.button2 = new JButton( " Add Circle" );
        this.add(button2);
        this.add(this.panel);
        this.button3 = new JButton( " Add Square" );
        this.add(button3);

        this.draw = canvas;
        ColorListener listener = new ColorListener();
        CircleListener listener2 = new CircleListener();
        SquareListener listener3 = new SquareListener();

        this.button.addActionListener( listener);
        this.button2.addActionListener( listener2);
        this.button3.addActionListener( listener3);
        Color background = canvas.getColor();
        this.setBackground(background);

        
    }

   

    public class ColorListener implements ActionListener
    {
        public void actionPerformed( ActionEvent event)
        {
           draw.pickColor();
           panel.setBackground(draw.getColor());
        }
    }
     public class RectListener implements ActionListener
    {
        public void actionPerformed( ActionEvent event)
        {
           draw.addRectangle();
           repaint();
        }
    }
     public class SquareListener implements ActionListener
    {
        public void actionPerformed( ActionEvent event)
        {
            draw.AddEllipse();
            repaint();
        }
    }

}
