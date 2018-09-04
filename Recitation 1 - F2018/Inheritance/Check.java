package Inheritance;

/**
 * @author Jesse Frush
 */

public class Check implements Payment
{
	private int bill;

	public Check( int bill )
	{
		this.bill = bill;
	}

	public Check()
	{
		this( 75 );
	}

	public void pay( int amount )
	{
		System.out.println( "Checks are not allowed." );
	}
}