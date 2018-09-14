package AccessModifiers;

public class Person
{
	public int age; // private access
	  protected int  id;  // default access
	  protected String address; // protected access
	  public String name; // public access  

	  public Person(int age1, int id1, String addr, String name1) 
	  {
	    age = age1;
	    id = id1;
	    address = new String(addr);
	    name = new String(name1);
	  }

	  public int getAge()
	  {
	    return age;
	  }
	  
	  public int getId()
	  {
	    return id;
	  }
	 
	  public String getAddress()
	  {
	    return address;
	  }
	  
	  public String getName()
	  {
	    return name;
	  }
}
