package review4;

import java.util.Scanner;

public class ScannerArray {

	//read the array size form the scanner
	//create an array of integers
	//insert values of integers from the scanner
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("HOw may numbers do you want");
		int size=scan.nextInt();
	
		int [] array= new int [size];
		for (int i=0; i<array.length; i++) {
		System.out.println("Enter a number");
			array[i]=	scan.nextInt();
			
	}
int sum=0;
		for (int i=0; i<size; i++) {
	sum+= array[i];
		}
	System.out.println("The sum is "+sum);
	}
}
