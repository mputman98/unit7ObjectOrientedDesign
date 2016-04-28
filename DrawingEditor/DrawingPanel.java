import javax.swing.*;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import javax.swing.JColorChooser;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D.Double;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */

    private Color currentcolor;
    public Shape activeshape;
    public boolean curPicked;
    private ArrayList<Shape> shapelist;
    private Point2D.Double;

    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        MouseListener listener = new MousePressListener();
        this.addMouseListener(listener);
        this.setBackground(Color.WHITE);
        this.currentcolor = Color.BLUE;
        this.shapelist = new ArrayList();
        Point2D.Double = new Point2D.Double(500/2, 500/2);

    }
    
    public class MouseClickListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event)
        {
            
        }

        public void mouseEntered(MouseEvent event){
        }

        public void mouseExited(MouseEvent event){
        }

        public void mousePressed(MouseEvent event){
            for (Shape s: shapelist){
                Point2D.Double curPoint = new Point2D(
            }
        }

        public void mouseReleased(MouseEvent event){
        }
    }
    
    public Color getColor(){
        return currentcolor;
    }

    public Dimension getPreferredSize(){
        Dimension dim = new Dimension();
        return dim;
    }

    public void pickColor(){
        JColorChooser.showDialog(this,"Select a color",WHITE);
    }

    public void addCircle(){
        Circle circle = Circle(Point,15.5, currentcolor);
        shapelist.add(circle);
        activeshape = circle;
        repaint();
    }

    public void addSquare(){
        Square square = Square(Point,15.5, currentcolor);
        shapelist.add(square);
        activeshape = square;
        repaint();
    }
    
    public void paintComponent(graphics g){
            
    }
   
    
    public class MouseHoldListener implements MouseMotionListener
    {
        public void mouseDragged( MouseEvent event)
        {

        }

        public void mouseMoved(MouseEvent event){}
    }
}
