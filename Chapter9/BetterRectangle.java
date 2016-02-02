import java.awt.Rectangle;

/**
 * Write a description of class BetterRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BetterRectangle extends Rectangle
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class BetterRectangle
     */
    public BetterRectangle(int x, int y, int width, int height)
    {
        super(x, y, width, height);  
        
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public double getPerimetre()
    {
        double per = 0;
        per = (this .getHeight * 2) + (this.getWidth * 2);
        return per;
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int getArea()
    {
        // put your code here
        double area = 0;
        area = this.getHeight * this.getWidth;
        return area;
        
    }

}
