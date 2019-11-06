package review4;

public class Pyramid {
//1
//12
//123
//1234
//12345
	
	public static void main(String[] args) {
 for (int row=1; row<=5; row++) {             
	// System.out.println(row)
	 for (int col=1; col<=row; col++) {  //COL<=ROW!
		 System.out.print(col);} //SYSO col
		 System.out.println();
	 }
	
 


//1
//22
//333
//4444
//55555


for (int row=1; row<=5; row++) {             
// System.out.println(row)
 for (int col=1; col<=row; col++) {  //Syso ROW!
	 System.out.print(row);}
	 System.out.println();
 }



//PRINT OUT THE SQUARE for each column mulitiply by that same number. ex 3 columns, multiply by 3

for (int row=1; row<=5; row++) {             
	// System.out.println(row)
	 for (int col=1; col<=row; col++) {  //Syso ROW!
		 System.out.print(col * col+ " ");}
		 System.out.println();
}
	}
}
 
