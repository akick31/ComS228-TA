package Inheritance;

/**
 * @author Jesse Frush
 */

public class Credit extends Charge
{
	private int limit;

	public Credit()
	{
		super( 0 );
		limit = 1000;
	}

	public Credit( int l )
	{
		super( 0 );
		limit = l;
	}


	public void pay( int amount )
	{
		//can I charge?
		if( !this.isActive() || ( amount + balance ) > limit )
		{
			System.out.println( "Declined." );
			return;
		}

		balance += amount;
		System.out.println( "Approved!" );
	}
}