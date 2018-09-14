package Other;

interface Life
{
  String getInfo();
  void   updateAge();
}

/**
*  The Organism class is made to include two common fields
*  and methods betweem the Plant and Animal classes.
*  The Organism class implements the Life interface;
*  Life is a supertype of Organism, whereas Organism is a subtype of Life.
*/

class Organism implements Life
{
  private String name; // Any life has age and name.
  private int age;     // Hides them with private.

  public Organism(String aName, int anAge)
  { 
    if ( aName == null || anAge < 0 )
      throw new IllegalArgumentException();
    name =  new String(aName);
    age = anAge;
  } // constructor

  @Override // Tells the compiler that this method overrides the method in the supertype.
  public String getInfo()
  {
     return "Name = " + name + ", Age = " + age;
  }

  @Override
  public void updateAge()
  {
       age++;
  }

}

/* The Plant class has its own unique field.
   Plant is a subtype of Organism.
*/

class Plant extends Organism
{
  private String location; // Plants can not move.

  public Plant(String aName, int anAge, String aLoc)
  {
    super(aName, anAge); // Calls the superclass constructor.
    if ( aLoc == null )
      throw new IllegalArgumentException();
    location = new String(aLoc);
  }

  @Override
  public String getInfo()
  {
     return super.getInfo() + ", Location = " + location;
  }

  public String getLoc()
  {
     return location;
  }  // A method unique to this class.

} 

class Conifers extends Plant
{
  public Conifers(String aName, int anAge, String aLoc)
  {
    super(aName, anAge, aLoc);
  }  
} 


/* The Animal class has its own unique field.
   Animal is a subtype of Organism.
*/

class Animal extends Organism
{
  private String food; // Animals need food.

  public Animal(String aName, int anAge, String aFood)
  {
    super(aName, anAge); // Calls the superclass constructor.
    if ( aFood == null )
      throw new IllegalArgumentException();
    food = new String(aFood);
  }

  @Override
  public String getInfo()
  {
     return super.getInfo() + ", Food = " + food;
  }

  public String getFood()
  {
     return food;
  }  // A method unique to this class.

} 

class Amphibian extends Animal
{
  public Amphibian(String aName, int anAge, String aFood)
  {
    super(aName, anAge, aFood);
  }
} 


/* A user class */

public class  OOPexample
{
  public static void main( String[] args )
  { 
    Organism org = new Organism("Species", 2);
    Plant pla = new Plant("Pine", 53, "3 Duff");
    Animal ani = new Animal("Horse", 2, "Hay");

    Organism orgp = new Plant("Pine", 53, "3 Duff");
    Organism orga = new Animal("Horse", 2, "Hay");
    boolean  b = orgp.getClass() == orga.getClass();
    System.out.println("Check on the types of orgp and orga: " + b );
    boolean  b2 = orgp.getClass() == org.getClass();
    System.out.println("Check on the types of orgp and org: " + b2 );
    boolean  b3 = orga.getClass() == ani.getClass();
    System.out.println("Check on the types of orga and ani: " + b3 );

    System.out.println("getClass " + ani.getClass() );

    System.out.println("getClass " + ani.getClass().getName() );

    System.out.println( org.getInfo() );
    System.out.println( pla.getInfo() );
    System.out.println( ani.getInfo() );
    pla.updateAge();
    ani.updateAge();
    System.out.println( pla.getInfo() );
    System.out.println( ani.getInfo() );
    
    Conifers conifers = new Conifers("Cordaitales", 10000, "IA");
    Amphibian amphibian = new Amphibian("Kulipari", 10000, "Worm");
    System.out.println( orgp.getClass() == amphibian.getClass() );
    System.out.println( orga.getClass() == conifers.getClass() );
    System.out.println( orgp.getClass() == amphibian.getClass() );
    System.out.println( orga.getClass() == conifers.getClass() );
    
    System.out.println( amphibian.getInfo() );
    System.out.println( conifers.getInfo() );
    amphibian.updateAge();
    conifers.updateAge();
    System.out.println( amphibian.getInfo() );
    System.out.println( conifers.getInfo() );
    
        
    check( new Life[]{org, pla, ani, orgp, orga, conifers, amphibian, null } );
    
  }
  
  public static void check(Life[] life)
  {
  	String str1 = " is instanceof ";
  	String str2 = " not an instanceof ";
   for(Life l : life)
   {
   	if(l instanceof Life) System.out.println( l.getClass() + str1 + "Life" );
   	else System.out.println( (l==null)?"null":l.getClass() + str2 + "Life" );
   	
   	if(l instanceof Organism) System.out.println( l.getClass() + str1 + "Organism" );
   	else System.out.println( (l==null)?"null":l.getClass() + str2 + "Organism" );
   	
   	if(l instanceof Plant) System.out.println( l.getClass() + str1 + "Plant" );
   	else System.out.println( (l==null)?"null":l.getClass() + str2 + "Plant" );
   	
   	if(l instanceof Animal) System.out.println( l.getClass() + str1 + "Animal" );
   	else System.out.println( (l==null)?"null":l.getClass() + str2 + "Animal" );
   	
   	if(l instanceof Conifers) System.out.println( l.getClass() + str1 + "Conifers" );
   	else System.out.println( (l==null)?"null":l.getClass() + str2 + "Conifers" );
   	
   	if(l instanceof Amphibian) System.out.println( l.getClass() + str1 + "Amphibian" );
   	else System.out.println( (l==null)?"null":l.getClass() + str2 + "Amphibian" );
   	
   }
  }
  
}