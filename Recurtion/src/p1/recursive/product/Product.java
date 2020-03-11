package p1.recursive.product;

public class Product {
	public static int multiRec(int m, int n ) {
		if(n==1)return m;
		return m + multiRec(m,n-1); //using addition
	}

	public static void main(String[] args) {		
		System.out.println(multiRec(5,4));
	}

}
