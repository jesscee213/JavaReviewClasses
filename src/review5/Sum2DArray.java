package review5;

public class Sum2DArray {
public static void main(String[] args) {
	int [] [] b= {
			{2,3,5},
			{2,4,7},
			{8,1,9},
			{3,5,1},
			
	};

	int sum=0;
for (int i=0; i<b.length; i++) {
	for (int k=0; k<b[i].length; k++) {
		
		if (b[i][k]>sum) {
			sum=b[i][k];
			
		}
	}
	
}

System.out.println("sum is " +sum);
}
}

