package com.syntax.datatypes;

public class ReviewClass {
public static void main(String[] args) {
	int number=23;
	
	if (number>100) {
		System.out.println("It will be three digits");
		
	}else if (number<100)  {
		System.out.println("It will be two digits");
	}else if (number>1000){
		System.out.println("It will be four digits");
	}else {
		System.out.println("Number will be one digit");
	
		
	}
}
}
