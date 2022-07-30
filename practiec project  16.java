package practiceprograms2;

import java.util.Scanner;


public class excephand {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("the input");
		a = s.nextInt();
		b =s.nextInt();
		
			try{
				System.out.println(a/b);
			}
			
			catch(Exception  e){
				System.out.println("cannot divide by 0");			

}
		}
		
	}