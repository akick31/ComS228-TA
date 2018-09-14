package Other;

/* Group activities on examples of type conversion */

class Organism
{
  private String name;  // Any life has age and name.
  private int age;      // Hide them with private.
 
  public Organism(String aName, int anAge)
  {
    name = aName;
    age = anAge;
  }  // constructor
  
  public String getInfo()
  {
    return "Name = " + name + ", Age = " + age;
  }  // method getInfo
}  // class Organism

class Plant extends Organism
{
  private String location;  // Plants can not move.

  public Plant(String aName, int anAge, String aLoc)
  {
    super(aName, anAge); // Call the superclass constructor.
    location = aLoc;
  }  // constructor 

  public String getInfo()
  {
    return super.getInfo() + ", Location = " + location;
  }  // method getInfo
}  // class Plant

class Animal extends Organism
{
  private String food; // Animals need food.

  public Animal(String aName, int anAge, String aFood)
  {
    super(aName, anAge);
    food = aFood;
  }  // constructor

  public String getInfo()
  {
    return super.getInfo() + ", Food = " + food;
  }  // method getInfo
}  // class Animal

public class PolyExample 
{ public static  void main(String[] args )
  {
    Organism org1 = new Organism("Virus", 1);
    Plant pla1 = new Plant("Oak", 13, "4 Duff");
    Animal ani1 = new Animal("Dog", 3, "Meat");

/* For each section of 2 or 3 lines below, if the section contains an error,
   indicate the error type (compile error or runtime error);
   otherwise, show the output of the section */

    Organism org2 = pla1;
    System.out.println( org2.getInfo() );
//  Output: Name = Oak, Age = 13, Location = 4 Duff

/*  A compile error as a downcast operator is required.
    Plant pla2 = org1;
    System.out.println( pla2.getInfo() );
*/

//  A run-time error as the runtime type of org1 is Organism, not Animal.
    Animal ani2 = (Animal) org1;
    System.out.println( ani2.getInfo() );

    Organism org3 = pla1;
    Plant pla3 = (Plant) org3;
    System.out.println( pla3.getInfo() );
//  Output: Name = Oak, Age = 13, Location = 4 Duff

/*  A compile error as the class Animal is not a subtype of Plant.
    Plant pla4 = ani1;
    System.out.println( pla4.getInfo() );
*/

/*  A compile error as the class Animal is not a subtype or supertype of Plant.
    Plant pla5 = (Plant) ani1;
    System.out.println( pla5.getInfo() );
*/

  }
}