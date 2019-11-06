package com.SyntaxClassLoop;

import java.util.Scanner;

public class doWhileTask2 {
public static void main(String[] args) {
	//Write a program using a do while loop to print out all odd number from 0 15 
	 int i=0;
     do {
         if (i%2==1)
             System.out.println(i);
         i+=1;
     }while (i<=15);
}



//*keep asking user to pay for candy until entered price is equal to 3
//  *after user got a write amount print "Please enjoy your candy"
{
Scanner scan=new Scanner(System.in) ;
int price;
do {
	System.out.println("please pay for candy");
	price=scan.nextInt();}
while(price!=3);
System.out.println("PLease enjoy your candy");
	
}


{for (int i=0;    i<=4;           i++) {
	System.out.println("Good morning");
	}
	//print numbers from 1-10;
	for (int i=1; i<=10; i++) {
	System.out.println(i);
	}
	//print numbers from 10-1
	for (int i=10; i>=1; i--) {
	System.out.println(i);
	}
	for (int i=0; i<=50; i+=5) {
	System.out.println(i);//5, 10, 15, 20
	}}}
