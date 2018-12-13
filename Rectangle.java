package edu.ncc.cmerlo.csc120.Rectangle;

/**
 * Description: Stores a representation of a Rectangle
 * 
 * @author Prof. Christopher R. Merlo &lt;cmerlo@ncc.edu&gt;
 * @version 2018-09
 *
 */
public class Rectangle {
    private int length;
    private int width;

    /**
     * Default constructor
     */
    public Rectangle() {
        length = 5;
        width = 3;
    }

    /**
     * Parameterized constructor
     * 
     * @param length
     *            Length of the new rectangle
     * @param width
     *            Width of the new rectangle
     */
    public Rectangle( int length, int width ) {
        this();
        setLength( length );
        setWidth( width );
    }

    /**
     * Copy constructor
     * 
     * @param r
     *            The rectangle to be copied
     */
    public Rectangle( Rectangle r ) {
        length = r.length;
        width = r.width;
    }

    /**
     * Set the length of the rectangle, but only if it's valid
     * 
     * @param length
     *            The desired new length of the rectangle
     */
    public void setLength( int length ) {
        if( length > 0 )
            this.length = length;
    }

    /**
     * Set the width of the rectangle, but only if it's valid
     * 
     * @param width
     *            The desired new width of the rectangle
     */
    public void setWidth( int width ) {
        if( width > 0 )
            this.width = width;
    }

    /**
     * Get the length of the rectangle
     * 
     * @return the length of the rectangle
     */
    public int getLength() {
        return length;
    }

    /**
     * Get the width of the rectangle
     * 
     * @return the width of the rectangle
     */
    public int getWidth() {
        return width;
    }

    /**
     * Calculate and return the area of the rectangle
     * 
     * @return the area of the rectangle
     */
    public int findArea() {
        return length * width;
    }

    /**
     * Calculate and return the perimeter of the rectangle
     * 
     * @return the perimeter of the rectangle
     */
    public int findPerimeter() {
        return 2 * ( length + width );
    }

    /**
     * Return a String containing "length x width"
     * 
     * @return A String containing "length x width"
     */
    public String toString() {
        return String.format( "%d x %d", length, width );
    }
}
