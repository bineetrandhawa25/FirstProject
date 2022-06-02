package com.learning.java;

public class Bclass {

	 static public void main(String[] args) {
		// TODO Auto-generated method stub

		 //access modified: [public, private, default. protected
		 //String is a class in Java, also a Datatype
		 //[] is Array representation. memory allocation.
		 // args is argument (text). It can be alphabet or alphanumeric
		 //any name in alphabet like Bineet, it will work. 
		 //only args$ will work. no other special character.
		 //[] can be replaced by three dots.
		 
		 //Primitive datatypes: int, long, Boolean, float, char, short, byte, double
		 //Non primitive datatypes: classes, interfaces, arrays, string

		 boolean b1=false;
		 boolean b2=true;
		 
		 System.out.println(b2);//print true
		 System.out.println(b1==b2); //print false because b1 is not = b2.
		 
		 
		 
		 int i=10;
		 i=20;
		 int j=5;
		 j=2;
		 System.out.println(i); //print 20-latest value
		 
		 System.out.println(i+j); //takes latest values of i and j and print result.
		 
		 
		 int m = -2147483648;   //extremity of int in -ve x axis.
		 int n = 214783647; //extremity of int in +ve x axis.
		 
		 //range of int=  -2 to the power 31 to 2 to the power 31
		 
		sum();
		
	}
	
	
	public static void sum() {
		int i=10;
		int j=20;
		System.out.println("The sum of i and j is:" + (i+j));
	// will not print anything unless this method is called in main method.
	}

	
	
	
}
