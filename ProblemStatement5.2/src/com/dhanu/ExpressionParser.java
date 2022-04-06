package com.dhanu;


	import java.util.Scanner;

	public class ExpressionParser {
		public static void main(String[] args) {
			
			Scanner scanner=new Scanner(System.in);
			   System.out.println("Enter the Number");
			   String txt=scanner.nextLine();
		
		//String txt= (" 23  +  45  -  (  343  /  12  ) ");
		String[] w=txt.split("\\\s");
		
		for(String w1:w){  
			System.out.println(w1); 
			//System.out.println(" ");
		}
	}

	
}
