package practiceprograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	 public static boolean isValidUsername(String name)
	    {
	   
	        String regex = "^[A-Za-z]\\w{5,29}$";
	        Pattern p = Pattern.compile(regex);
	        if (name == null) {
	            return false;
	        }
	        Matcher m = p.matcher(name);  
	        return m.matches();
	    }   
	    public static void main(String[] args)
	    {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter username");
	        String str1 = sc.next();        
	        System.out.println(isValidUsername(str1));
	        String str2 = "01regex";
	        System.out.println(isValidUsername(str2));
	        String str3 = "reg1_18";
	        System.out.println(isValidUsername(str3));
	    }
	}





