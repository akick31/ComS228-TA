package AccessModifiers;

public class AccessModifiers
{  
  public static void main(String args[])
  {
    Person p1234 = new Person(15, 1234, "5 Oakwood", "John");
    System.out.println("Accessing age: " + p1234.age);
    System.out.println("Accessing id: " + p1234.id);
    System.out.println("Accessing address: " + p1234.address);
    System.out.println("Accessing name: " + p1234.name);

    System.out.println("Calling getAge: " + p1234.getAge() );
    System.out.println("Calling getId: " + p1234.getId() );
    System.out.println("Calling getAddress: " + p1234.getAddress() );
    System.out.println("Calling getName: " + p1234.getName() );
  }
}