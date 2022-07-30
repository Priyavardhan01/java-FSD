package practiceprograms2;

import java.util.Scanner;

public class trycatch {
	public static void main(String[] args){
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		try{
		  System.out.println("Result is "+a/b);		  
		}	
		catch(ArithmeticException e){  // child
			System.out.println("Numbers cannot be divided by zero");
		}
		
	  }
}	


