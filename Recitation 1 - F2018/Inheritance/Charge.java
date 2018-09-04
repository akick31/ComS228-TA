package Inheritance;

/**
 * @author Jesse Frush
 */

public abstract class Charge implements Payment
{
	protected int balance;
	protected boolean active;

	public Charge( int b )
	{
		balance = b;
		active = true;
	}

	public Charge()
	{
		this( 75 );
	}

	//this method transfers the balance from the current card 
	//to the new card.
	public void transfer( Charge newCard )
	{
		newCard.setBalance( this.balance );
		this.balance = 0;
		this.active = false;
	}

	//sets the balance on the card
	private void setBalance( int newBalance )
	{
		balance = newBalance;
	}

	protected boolean isActive()
	{
		return active;
	}
}