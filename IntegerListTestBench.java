package edu.ncc.cmerlo.csc120.IntegerList;

public class IntegerListTestBench {

    public static void main( String[] args ) {

        IntegerList list = new IntegerList();
        String listString = list.toString();

        assert listString.equals( "[]" ) : "Empty list malformed: "
                + listString;

        list.insertAtEnd( 12 );
        listString = list.toString();
        assert listString.equals( "[12]" ) : "List with one item malformed: "
                + listString;

        assert list.size() == 1 : "Wrong size: " + list.size();

        list.insertAtEnd( 31 );
        listString = list.toString();
        assert listString.equals(
                "[12,31]" ) : "List with two items malformed: " + listString;

        assert list.size() == 2 : "Wrong size: " + list.size();

        list.insertAtFront( 22 );
        listString = list.toString();
        assert listString
                .equals( "[22,12,31]" ) : "List with three items malformed: "
                        + listString;

        assert list.size() == 3 : "Wrong size: " + list.size();

        Integer x = list.elementAt( 0 );
        assert x == 22 : "Wrong element at position 0: " + list.elementAt( 0 );

        x = list.elementAt( 1 );
        assert x == 12 : "Wrong element at position 1: " + list.elementAt( 1 );

        x = list.elementAt( 2 );
        assert x == 31 : "Wrong element at position 2: " + list.elementAt( 2 );

        x = list.elementAt( 3 );
        assert x == null : "Wrong element at position 3: "
                + list.elementAt( 3 );

        x = list.elementAt( -1 );
        assert x == null : "Wrong element at position -1: "
                + list.elementAt( -1 );

        x = list.search( 12 );
        assert x == 1 : "12 is in the wrong place: " + list.search( 12 );

        System.out.format( "All tests passed.  %d elements: %s ", list.size(),
                listString );

    }

}
