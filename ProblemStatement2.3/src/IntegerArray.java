
public class IntegerArray {
	 
	    public static void main(String[] args) {  
	        //Initialize array  
	        int [] arr = new int [] {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2,0};  
	        int sum = 0; 
	        int avg =0;
	        int temp,size;
	        size =arr.length-3;
	        //Loop through the array to calculate sum of elements  
	        for (int i = 0; i < arr.length; i++) {  
	           sum = sum + arr[i];  
	        }  
	        System.out.println("Sum : " + sum);  
	        arr[15]=sum;
	        System.out.println("Sum of all Elements from 0 to 14 and stored in 15th Element is:"+arr[15]);
	        
	        for (int j=0;j<=arr.length;j++) {
	        	avg=(sum/arr.length);
	        } 
	        
	        System.out.println("Average : "+avg);
	    arr[16]=avg;
	    System.out.println("Average of all number and stored in 16th Element is :"+arr[16]);
	    

	    for(int i = 0; i<size; i++ ){
	       for(int j = i+1; j<size; j++){
	          if(arr[i]>arr[j]){
	             temp = arr[i];
	             arr[i] = arr[j];
	             arr[j] = temp;
	    }  
	    
	}  }
	    
	    System.out.println("Smallest Value of Array element is:"+arr[0]);
	    }}

