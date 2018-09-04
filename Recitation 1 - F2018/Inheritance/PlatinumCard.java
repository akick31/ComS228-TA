package Inheritance;

/**
 * @author Jesse Frush
 */

public class PlatinumCard extends Credit
{
	public PlatinumCard()
	{
		super( Integer.MAX_VALUE );
	}

	public PlatinumCard( int limit )
	{
		super( limit );
	}
	
	
	@Override
	public void pay( int amount )
	{
		System.out.println("InPC");
		super.pay( amount );
		
		//rich people get tons of benefits for no reason
		balance -= ( amount * 0.5 );
	}
	
	
	public void richPeopleStuff()
	{
		System.out.println( "Free yacht with purchase of sandwich." );
	}
}