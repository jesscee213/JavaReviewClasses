package review4;

public class SpacePyramid {
public static void main(String[] args) {
	         //1
	        //12
	       //123
	      //1234
	     //12345
	
	for (int i=1; i<=5; i++) {
		for (int j=1; j<=5-i;  j++) {
			System.out.print(" ");
		}
	    for (int j=1; j<=i; j++) {
	    	System.out.print(j);
	}
	    System.out.println();
}
}
}