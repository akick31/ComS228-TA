package Inheritance;

/* @author
 * Jesse Frush
 */

public class main
{

	/**
	 * fun with inheritance!
	 */
	public static void main(String[] args)
	{
//		!! !! !! !! !!
//		explain the following:
//		(uncomment/recomment line by line as necessary)
//		CTRL + SHIFT + C
//		!! !! !! !! !!
		
		
		//will this work?
//		Payment g = new Payment();
		
		//well then what about this?
//		Charge cg = new Charge();
		
		
		
		
		
		//Of course we know we can do these:
		Cash monopoly = new Cash();
		Check cashier = new Check();
		Debit bankcard = new Debit();
		Credit capitalone = new Credit();
		PlatinumCard americanexpress = new PlatinumCard();
		
		//so we get expected results from simple methods like:
//		cashier.pay(40);
		
		
		
		
		

		
//		Payment p = new Cash();
//		p.pay(200);
		
//		Charge charge = new Charge();
		
//		Charge c = new Credit();
//		c.pay(500);
//		c.pay(200);
//		c.pay(500);
//		GoldCard creditincrease = new GoldCard();
//		c.transfer( creditincrease);
//		c.pay(2000);  							//explain.
//		c = (Charge) creditincrease;
//		c.pay(2000);
//		c = new Debit();
//		c.pay(200);
//		c.deposit(2000);
//		c.pay(200);
		
		
		
		//!! Casting magic.
		
		//What happens here?
		Credit credit = new Credit( 1200 );
		
		Charge charge = credit;
		charge = (Charge) credit;	 // is there a difference?
		
		
		//my limit is 1200! I can spend twice that now!!
		charge.pay(200);
		credit.pay(800);
		charge.pay(500);			//whaaaaaaaaat? someone smart explain this.
		
		
		Debit debit = new Debit();
//		credit = (Credit) debit;
		debit.deposit(2000);
		
		
		
		//!! time for some real tricks
//		charge = debit;
//		charge.pay(1800);
//		charge.deposit(2000);
//		
//		credit = (Credit) charge;
		
		PlatinumCard pt = new PlatinumCard(150000);
		Credit credit2 = credit;
		credit = pt;
//		credit.pay(99999);
		
		
//		Payment p = pt;
//		Cash money = (Cash) p;
		
//		p = new Cash();
//		pt.transfer((Charge) p);
		
//		pt.transfer( new Debit());
	}

}
