package Inheritance;

/**
 * @author Jesse Frush
 */

public class Debit extends Charge
{
	public void pay( int amount )
	{
		//debit cannot go below 0, so verify we have enough funds!
		if( ( balance - amount ) < 0 )
		{
			System.out.println( "You do not have enough funds!" );
			return;
		}

		balance -= amount;
		System.out.println( "You have " + balance + " remaining in your account." );
	}

	public void deposit( int amount )
	{
		balance += amount;
	}
}
