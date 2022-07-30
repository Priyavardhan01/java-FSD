package practiceprograms2;
public class Classobj {
    
    String name; 
    int age; 
    String place; 
    public Classobj( String name ,int age, String place)
    { 
         
        this.name = name; 
        this.age = age; 
        this.place = place; 
    } 
    
    public String getname() 
    { 
        return name; 
    } 
    public int getage() 
    { 
        return age; 
    } 
    public String getplace() 
    { 
        return place; 
    } 
    @Override
    public String toString() 
    { 
        return(  "\nThe name is " + this.getname()+ " of age " + this.getage()+ ",from"+ this.getplace() + "."); 
    } 
    

	public static void main(String[] args) 
    { 
    	Classobj scott = new Classobj("Arun",24,"Chennai"); 
        System.out.println(scott.toString()); 
    } 
}
