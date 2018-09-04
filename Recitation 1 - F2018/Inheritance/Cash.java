package Inheritance;

/**
 * @author Jesse Frush
 */

public class Cash implements Payment
{
	private int bill;

	public Cash()
	{
		this( 50 );
	}

	public Cash( int b )
	{
		bill = b;
	}

	public void pay( int amount )
	{
		if( amount > 50 ) {
			System.out.println( "you owed $50 dollars, you get " + ( amount - 50 ) + " in change" );
		} else {
			System.out.println( "you still owe " + ( 50 - amount ) + "!" );
		}
			
	}
}