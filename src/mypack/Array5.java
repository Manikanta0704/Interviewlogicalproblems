package mypack;

//no of times repeted an element

public class Array5{
	public static void main(String[] args) {
		int[] arr1= {2,4,6,8,0,3};
		int[] arr2= {1,2,3,4,5,2,8,8,3,8};
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					count++;
				}
			}
			if(count>1)
				System.out.println(arr1[i]+" is rep "+count+" times");
			count=0;
		}
	}
}


//repeated elements in 2 arrays
/*
public class Array1{
	public static void main(String[] args) {
		int[] arr1= {2,4,6,8,0,3};
		int[] arr2= {1,2,3,4,5,2,8,8,3,2,2};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}
}
*/

//printing duplicate elements
/*
public class Array1{
	public static void main(String[] args) {
		int []arr= {10,12,4,5,89,10,5,200,5,12};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}*/