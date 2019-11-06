package com.SyntaxClassLoop;

import java.util.Scanner;

public class WhileTask2 {
public static void main(String[] args) {
	int b = 1;
    while (b<= 3) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Hello " + name);}
        b++;
    }
}
