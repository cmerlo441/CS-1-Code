package edu.ncc.cmerlo.csc120.Rectangle;

public class RectangleTestBench {

    public static void main( String[] args ) {
        Rectangle r1 = new Rectangle();
        assert r1.getLength() == 5 && r1.getWidth() == 3 : "Oops";

        Rectangle r2 = new Rectangle( 8, -2 );
        assert r2.getLength() == 8 && r2.getWidth() == 3 : "Oops";

        Rectangle r3 = new Rectangle( -2, 8 );
        assert r3.getLength() == 5 && r3.getWidth() == 3 : "Oops";

        Rectangle r4 = new Rectangle( -8, -15 );
        assert r4.getLength() == 5 && r4.getWidth() == 3 : "Oops";

        Rectangle r5 = new Rectangle( 21, 12 );
        assert r5.getLength() == 21 && r5.getWidth() == 12 : "Oops";

        Rectangle r6 = new Rectangle( r5 );
        assert r6.getLength() == 21 && r6.getWidth() == 12 : "Oops";

        assert r6.findArea() == 252 : "Oops";
        assert r6.findPerimeter() == 66 : "Oops";
        assert r6.toString().equals( "21 x 12" ) : "Oops";

        System.out.println( "All tests passed." );
    }

}
