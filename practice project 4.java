package practiceprograms;

public class constructors {
	  
      constructors setname(){
    	  System.out.println("non Parameterized Constructor");
		return null;
    	  
      }
   int a ;
   int b;
     int setvalue(int a, int b){
    	 int s=a+b;
    	  System.out.println(" Parameterized Constructor");
		return s;     
    
    }
  
      public static void main(String[] args) {
    	  constructors obj1= new constructors();
    	  constructors obj2= new constructors();
    	  obj1.setname();
    	  obj2.setvalue(1, 2);
    	 
    	  
      }
}
