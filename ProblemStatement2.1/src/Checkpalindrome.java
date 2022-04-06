	import java.util.Scanner;
      public class Checkpalindrome {

	   public static void main(String[] args)
	   { 
		   String str;
	     
		String rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	            str = sc.nextLine();
	 
	      int length = str.length();
	      System.out.println("string length is: "+str.length());
	      
	      String strUpperCase = str.toUpperCase()
			System.out.println("Java String Lower Case to Upper Case: " + strUpperCase );

			//readUserInputAndPrintInUpperCase();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
	   }

	private String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private String toUpperCase() {
		// TODO Auto-generated method stub
		return null;
	}

	private int length() {
		// TODO Auto-generated method stub
		return 0;
	}
	}

