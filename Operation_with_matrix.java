package Assignment1;

import java.util.Scanner;

public class Operation_with_matrix {
	public static void main(String []args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int m = sc.nextInt();
		System.out.println("Enter number of columns");
		int n = sc.nextInt();
		int [][] a = new int[m][n];
		int [][] b = new int[m][n];
		int [][] c = new int[m][n];
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				a[i][j] = sc.nextInt();	
			}
		}
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				b[i][j] = sc.nextInt();	
			}
		}
		//Addition
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				c[i][j] =	a[i][j]+b[i][j];	
			}
		}
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
			System.out.println(c[i][j]);
			}
		}
		//substraction
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				c[i][j] =	a[i][j]-b[i][j];	
			}
		}
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
			System.out.println(c[i][j]);
			}
		}
		//multiplication
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				int sum =0;
				for(int k = 0;k<n;k++) {
					 sum += a[i][k] * b[k][j];	
				}
				c[i][j] = sum;
			}
		}
	//transpose of matrix a
	for(int i = 0;i<m;i++) {
		for(int j = 0;j<n;j++) {
				 c[j][i] = a[i][j];	
		}
	}
	//To check square matrix 
	if(m==n) {
		System.out.println("yes it is square matrix ");
	}
	else {
		System.out.println("no it is not square matrix");
	}
	//to check diagonal matrix 
	boolean diagonal = false;
	if(m != n) {
		System.out.println("no it is not diagonal matrix ");
	}
	else {
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
					 if(i != j && a[i][j] != 0) {
						
							diagonal  = false;
							break;
		        	}
		       }
			}
		
		if(diagonal)
		System.out.println("yes it is diagonal matrix");
		else 
			System.out.println("no it is not diagonal matrix ");
		
	}
	

	boolean identity = true;

	if (m != n) {
	    System.out.println("No, it is not an identity matrix");
	} else {
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (i == j && a[i][j] != 1) {
	                identity = false;
	                break;
	            } 
	            else if (i != j && a[i][j] != 0) {
	                identity = false;
	                break;
	            }
	        }
	    }

	    if (identity)
	        System.out.println("Yes it is  identity matrix");
	    else
	        System.out.println("No it is not  identity matrix");
	}

	}	
}
