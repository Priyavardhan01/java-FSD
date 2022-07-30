package practiceprograms2;
interface Interface1  
{  
public default void display()   
{  
System.out.println(" Interface1 is invoked");  
}  
}  
interface Interface2  
{  
public default void display()   
{  
System.out.println(" Interface2 is invoked");  
}  
}  
public class Diamondproblem implements Interface1, Interface2  
{  
public void display()   
{  
Interface1.super.display();  
Interface2.super.display();  
}  
public static void main(String args[])   
{  
	Diamondproblem obj = new Diamondproblem();  
obj.display();  
}  
}  

