package lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Replace
  {
	public static void main(String[]args) throws Exception
	{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter any string=");
	    String inputString = bf.readLine().toLowerCase();
	    for(int i = 0;i<inputString.length();i++)
	    {
	    	char inputChar = inputString.charAt(i);
	    	
	    	String consonants = "BCDFGHJKLMNPQRSTVWYZ".toLowerCase();
	    	for(int j = 0;j<consonants.length();j++)
               {
	    		   char stringChar = consonants.charAt(j);
	    		   
	    		   if(inputChar == stringChar) {
	    	   }
	    	}
	    }
     }
  }
