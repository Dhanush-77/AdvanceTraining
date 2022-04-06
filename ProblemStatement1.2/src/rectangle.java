
import java.util.Scanner;
public class rectangle {

	    int length; 
	    int breadth; 
	    int area; 
	   
	    public rectangle()
	    {
	    	length = 0;
	    	breadth= 0;
	    }

	    void input() {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter length of rectangle: ");
	        length = in.nextInt();
	        System.out.print("Enter breadth of rectangle: ");
	        breadth = in.nextInt();
	    }

	    void calculate() {
	        area = length * breadth;
	        
	    }

	    void display() {
	        System.out.println("Area of Rectangle = " + area);
	       
	    }

	    
	}


