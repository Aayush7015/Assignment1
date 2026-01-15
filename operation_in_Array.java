package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class operation_in_Array {
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int capacity = 15;
		int arr[] = new int[capacity];
		System.out.println("Enter number of Elements");
		int n = sc.nextInt();
		System.out.println("Enter the Elements");
           for(int i =0;i<n;i++) {
        	   arr[i] = sc.nextInt();
           }	
           int choice;
           do {
        	   System.out.println("Menu");
        	   System.out.println("1.insert element ");
        	   System.out.println("2.Delete element");
        	   System.out.println("3.linear search ");
        	   System.out.println("4.binary search ");
        	   System.out.println("5.To find maximum value ");
        	   System.out.println("6.To count even and  odd ");
        	   System.out.println("7.perform insertion sort ");
        	   System.out.println("0. exit");
        	   choice = sc.nextInt(); 
           switch (choice) {
           case 1:
        	   System.out.println("Insertion selected");
        	   
        	 n =  insertion(arr, n);
               break;
               
           case 2:
        	   System.out.println("Deletion selected");
        	  n =  deletion(arr, n);
               break;  
           case 3:
        	   System.out.println("linear search");
        	 if(linear(arr,n))
        	 {
        		 System.out.println("element found");
        	 }
        	 else {
        		 System.out.println("element not  found");
        	 }
        	 break;
           case 4:
        	   System.out.println("apply binary search");
        	   sort(arr,n);
        	   int index = binarysearch(arr,n);
        	   if(index!= -1)
        	   {
          		 System.out.println("element found at : " + index );
          	 }
          	 else {
          		 System.out.println("element not  found");
          	 }  
        	   break;
           case 5:
        	   System.out.println("To find max value");
        	   System.out.println(findmax(arr,n));
        	   break;
           case 6:
        	   System.out.println("To count even and odd");
        	   System.out.println(Arrays.toString(evenoddcount(arr, n)));
        	   break;
           case 7:
        	   System.out.println("Perform insertion sort ");
        	   insertionsort(arr,n);
        	   break;
        	    	
        	    	
               default:
            	   System.out.println("Invalid selection");    
	} 
     }while(choice != 0);  
}
	
	public static int insertion(int []arr, int n) {
		System.out.println("Enter the element to insert");
		int elem = sc.nextInt();
		System.out.println("Enter the position");
		int pos = sc.nextInt();
		if(pos<0 || pos>n) {
			System.out.println("Invalid Input");
			return n;
		}
		for(int i = n-1;i>=pos;i--) {
            arr[i+1] = arr[i];
		}
		arr[pos] = elem;
		n++;
		System.out.println("After insertion");
		for(int i =0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		return n;
	}
	public static int deletion(int [] arr, int n) {
		for(int i =0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the postion of the  element to delete");
		int pos = sc.nextInt();
		if(pos<0 || pos >= n) {
			System.out.println("invalid position");
			return n;
		}
		for(int i = pos;i<n-1;i++) {
            arr[i] = arr[i+1];
		}
		 System.out.println("After deletion:");
		    for (int i = 0; i < n; i++) {
		        System.out.println(arr[i]);
		    }
		n--;
		return n;
	}
	public static boolean linear(int [] arr, int n) {
		System.out.println("Enter the element to search");
		int elem = sc.nextInt();
		for(int i = 0;i<n;i++) {
			if(arr[i] == elem) {
				return true;
			}
		}
		return false;
	}
	public  static void sort(int []arr, int n) {
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i] > arr[j]) {
				   int temp = arr[i];
				   arr[i] = arr[j];
				   arr[j] = temp;
				}
			}
		}
		
	}
	public static int binarysearch(int [] arr, int n) {
		System.out.println("Enter the element to search");
		int elem = sc.nextInt();
		int s =0;
		int e = n-1;
		while(s<=e) {
			int mid = s + (e - s) / 2;
		if(arr[mid] == elem ) {
			return mid;
		}
		else if(elem< arr[mid]) {
             e = mid-1;
		}
		else if(elem > arr[mid]) {
			 s = mid +1 ;
		}
	}
		return -1;
	}
	public static int findmax(int []arr, int n) {
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<n;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int [] evenoddcount(int []arr, int n) {
		int evencount = 0;
		int oddcount = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i]%2 == 0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		return new int[]{evencount,oddcount};
		
	}
	public static void  insertionsort(int [] arr, int n) {
		for(int i = 0;i<n;i++) {
			for(int j = i;j>0;j--) {
				if(arr[j]<arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else {
					break;
				}
			}
		}
			System.out.println("After insertion sort:");
			for( int k = 0; k<n; k++) {
				System.out.println(arr[k]);
			}
		
	}
}

