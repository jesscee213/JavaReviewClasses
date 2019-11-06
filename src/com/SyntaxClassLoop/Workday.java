package com.SyntaxClassLoop;

public class Workday {
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub

	
	boolean workDay = true;
	int day = 1;
	while (workDay) {
	if (day == 6 || day==7) { // || is equal to OR
	workDay = false;
	System.out.println("I do not need a day of anymore");
	}else {
	System.out.println("I need a day off");
	}
	day++;
	}

// if and Else lives INSIDE the while loop



}
}
