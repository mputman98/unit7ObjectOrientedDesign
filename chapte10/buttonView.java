import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Write a description of class buttonView here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buttonView
{
    private static final int frameWidth = 100;
    private static final int frameHeight = 150;
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button;
    private JButton button2;
    public buttonView()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();

        this.label = new JLabel();
        this.panel.add(label);

        this.button = new JButton( " A" );
        this.panel.add(button);

        this.button2 = new JButton( " B" );
        this.panel.add(button2);

        this.frame.add(panel);

        ClickListener listener = new ClickListener();

        this.button.addActionListener( listener);
        this.button2.addActionListener( listener);
        this.frame.setSize( frameWidth, frameHeight);
        this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible( true );
    }

    public static void main( String[] args)
    {
        buttonView view = new buttonView(); 
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed( ActionEvent event)
        {
            label.setText("button " + event.getActionCommand() + "was clicked");
        }
    }
}
