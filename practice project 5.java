package practiceprograms;

import java.util.ArrayList;

public class collectionss {
	public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("This is to ");
        list.add("study");
        list.add("collections");
        list.add("And types");
        System.out.println(" Array elements " + list);
 
        if(list.contains("study")) {
        	System.out.println("found =" +list.indexOf("study"));
        }
        else {
        	System.out.println("not found");
 
        }
    }
}


