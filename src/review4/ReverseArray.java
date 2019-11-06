package review4;

public class ReverseArray {
//PRINT IN REVERSE ORDER
	
	public static void main(String[] args) {
	String[] animals= {"bird", "fox", "bear", "moose","koala"};
	
	for (int i=0; i<animals.length; i++) {
		System.out.println(animals[i]);
	}
	System.out.println("-----reverse array-----");
	
	for (int p=animals.length-1; p>=0; p--) {
		System.out.println(animals[p]);
		
	}



int[] num= {1,2,3,4,5,6,7};
for (int j=num.length-1; j>=0; j--) {
	System.out.println(num[j]);
}
}
}
// THE LAST INDEX OF HTE ARRAY IS ONE LESS THAN THE LENGTH!!!!!!