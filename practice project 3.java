package practiceprograms;

public class methodcall {
	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a=12;
			int b=10;
			int c=12;
	       add();
	       int s = add1( a ,  b);
	       int g = add1(a,b,c);
	       System.out.println("this is called method 2 ");
	       
		}
	    public static int  add() {
     	 System.out.println("this is called method 1");
	  	 return 0;
	    }

            public static int  add1(int a ,int b) {
            	int r=a+b;
            	return r;
     
}
	    public static int add1(int a ,int b ,int c ) {
	    	 System.out.println("this is overloaded method");
			return 0;
	    	
	   
	}
} 

