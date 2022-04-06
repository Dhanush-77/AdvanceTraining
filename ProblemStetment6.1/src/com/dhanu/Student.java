package com.dhanu;

import java.util.ArrayList;
import java.util.Scanner;
 public class Student {
 public static void main (String[] args) {
	 ArrayList<String> a1=new ArrayList<String>();
 int n;
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the number of students:");
 n=sc.nextInt();
 System.out.println("enter the student names:");
 String a=sc.nextLine();
for(int i=0;i<n;i++)
{
	a1.add(sc.next());
}
System.out.println("student list: "+a1);
for(String b:a1) {
		System.out.println("enter the name of the student to be searched:");
	    String st=sc.next(); 
	    if(a1.contains((CharSequence) st))
		System.out.println("the given name of student  "+st+" is:"+" present");
}
		
 }
 }

