package AccessModifiers;
import AccessModifiers.Person;

class Student extends Person
{
  public String major;

  public Student(int age1, int id1, String addr, String name1, String major1)
  {
     super(age1, id1, addr, name1);
     major = new String(major1);
  }
  
  public String readingProtectedFiled()
  {
    return address;
  }

  public String callingProtectedMethod()
  {
    return getAddress();
  }
}

public class AccessModifiers2
{  
  public static void main(String args[])
  {
    Person p1234 = new Person(15, 1234, "5 Oakwood", "John");
    System.out.println("Accessing age: " + p1234.getAge()); // Compile error
    System.out.println("Accessing id: " + p1234.id); 
    System.out.println("Accessing address: " + p1234.address); 
    System.out.println("Accessing name: " + p1234.name);

    System.out.println("Calling getAge: " + p1234.getAge() ); // Compile error
    System.out.println("Calling getId: " + p1234.getId() ); // Compile error
    System.out.println("Calling getAddress: " + p1234.getAddress() ); // Compile error
    System.out.println("Calling getName: " + p1234.getName() );

    Student s4321 = new Student(18, 4321, "7 Hardwood", "Mary", "CS");
    System.out.println("Accessing address: " + s4321.address); // Compile error
    System.out.println("Accessing Student's address: " + s4321.readingProtectedFiled());
    System.out.println("Accessing Student's name: " + s4321.name);

    System.out.println("Calling getAddress: " + s4321.getAddress() ); // Compile error
    System.out.println("Calling Student's getAddress: " + s4321.callingProtectedMethod() );
    System.out.println("Calling Student's getName: " + s4321.getName() );
  }
}