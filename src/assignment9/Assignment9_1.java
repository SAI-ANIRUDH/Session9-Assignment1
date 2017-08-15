package assignment9; // package declaration is compulsory.
/*
 * Program to describe the generic hashmap.
 */
import java.util.HashMap; // importing HashMap class from Java Util Package.
import java.util.Map; // importing the map class from Java Util Package.
import java.util.Set; // importing the set class from java Util Package/
import java.util.Iterator; // importing the iterator class from java Util Package.

public class Assignment9_1 {

	public static void main(String[] args) {
		Employee e1=new Employee(102,"SAI"); // Initializing the values for Employee Class
		
		
		// TODO Auto-generated method stub
HashMap<Integer, String> hmap = new HashMap<Integer, String>(); // Initializing the Hashmap class
hmap.put(e1.Empid,e1.Ename); // Calling the employee values from generic hashmap.

String var=hmap.get(102); // Declaring and initializing the string variable obtaing getclass of the generic hash key.
System.out.println("Value at index 102 is:"+var);

	}
}
class Employee // Creating  a class Employee
{
	int Empid; // Declaring the values
	String Ename;
	
	 Employee(int Empid,String Ename) // Creating the constructor Employee with parameters.
	{
this.Empid=Empid;
this.Ename=Ename;
	}

}

