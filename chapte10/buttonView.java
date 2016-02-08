import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;

/**
 * Write a description of class buttonView here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buttonView
{
   private static final int frameWidth = 100;
   private static final int frameHeight = 60;
   
   public static void main( String[] args){
       JFrame frame = new JFrame();
       JButton button = new JButton( " Click me!" );
       frame.add(button);
       
       ClickListener listener = new ClickListener();
       button.addActionListener( listener);
       frame.setSize( frameWidth, frameHeight);
       frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       frame.setVisible( true );
   }
   
}
   