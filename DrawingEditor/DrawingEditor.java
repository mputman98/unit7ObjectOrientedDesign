import javax.swing.*;
import java.awt.BorderLayout;

/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int frameWidth = 400;
    private static final int frameHeight = 450;
    private ControlPanel controls;
    private DrawingPanel canvas;
   

    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        // initialise instance variables
        this.canvas = new DrawingPanel();
        this.controls = new ControlPanel(canvas);
        
        this.setTitle("Drawing Editor");
        
        this.setSize( frameWidth, frameHeight);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.setVisible( true );
        this.add(canvas, BorderLayout.CENTER);
        this.add(controls, BorderLayout.SOUTH);
      
        
    }

    public static void main( String[] args)
    {
        DrawingEditor scene = new DrawingEditor();
    }
  

   
}
