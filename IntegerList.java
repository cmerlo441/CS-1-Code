package edu.ncc.cmerlo.csc120.IntegerList;

/**
 * Description: Stores an ordered list of integers
 * 
 * @author Prof. Christopher R. Merlo &lt;cmerlo@ncc.edu&gt;
 * @version 2018-09
 *
 */
public class IntegerList {
    private int list[];
    private int numElements;

    /**
     * Creates an empty list with capacity 10
     */
    public IntegerList() {
        list = new int[ 10 ];
        numElements = 0;
    }

    /**
     * Creates an empty list with given capacity
     * 
     * @param size
     *            Initial capacity for list
     */
    public IntegerList( int size ) {
        this();
        if( size > 0 )
            list = new int[ size ];
    }

    /**
     * Creates a list containing the given data, and automatically expands
     * capacity
     * 
     * @param numbers
     *            Data with which to initially fill the list
     */
    public IntegerList( int numbers[] ) {
        list = new int[ numbers.length * 2 ];
        for( int i = 0; i < numbers.length; ++i )
            list[ i ] = numbers[ i ];
        numElements = numbers.length;
    }

    /**
     * Double the capacity of the list
     */
    private void expandCapacity() {
        int newList[] = new int[ list.length * 2 ];
        for( int i = 0; i < numElements; ++i )
            newList[ i ] = list[ i ];
        list = newList;
    }

    /**
     * Add a new integer at the end of the list
     * 
     * @param n
     *            New last integer to be added
     */
    public void insertAtEnd( int n ) {
        if( numElements == list.length )
            expandCapacity();
        list[ numElements++ ] = n;
    }

    /**
     * Add a new integer at the front of the list
     * 
     * @param n
     *            New first integer to be added
     */
    public void insertAtFront( int n ) {
        if( numElements == list.length )
            expandCapacity();

        // shift
        for( int i = numElements; i > 0; --i )
            list[ i ] = list[ i - 1 ];

        list[ 0 ] = n;
        numElements++;
    }

    /**
     * Returns the amount of integers contained in the list
     * 
     * @return The amount of integers in the list
     */
    public int size() {
        return numElements;
    }

    /**
     * Returns the nth element of the list, or null if there is no nth position
     * 
     * @param n
     *            A position in the list
     * @return The nth element in the list, or null if n is an invalid position
     */
    public Integer elementAt( int n ) {
        if( n < 0 || n >= numElements )
            return null;
        return list[ n ];
    }

    /**
     * Returns the location of the key, or -1 if the key isn't in the list
     * 
     * @param key
     *            Item to search for
     * @return Location of the key, or -1 if the key isn't in the list
     */
    public int search( int key ) {
        for( int i = 0; i < numElements; ++i )
            if( list[ i ] == key )
                return i;
        return -1;
    }

    /**
     * Returns a comma-separated list within square brackets
     * 
     * @return The list of integers, comma-separated, within square brackets
     */
    public String toString() {
        StringBuffer sb = new StringBuffer( "[" );
        if( numElements > 0 ) {
            sb.append( list[ 0 ] );
            for( int i = 1; i < numElements; ++i )
                sb.append( "," + list[ i ] );
        }
        return sb + "]";
    }

}
