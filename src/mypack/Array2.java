 package mypack;
 
 //remove even interger from an array
/*public class Array2{
	public static void main(String[] args) {
		int arr[] = {3,2,4,7,10,6,5};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				count++;
				System.out.println(arr[i]);
			}	
		}
		System.out.println("Count :"+count);
	}
}*/
 
 //reverse an array

 /*
 public class Array2{
		public static void main(String[] args) {
			int arr[] = {2,11,5,10,7,8};
			
			for(int i=arr.length-1;i>=0;i--) {
				System.out.println(arr[i]);
		}
	}
}*/
 
 //printing second max value
/*
 public class Array2{
	 public static void main(String[] args) {
		 int arr[] = {2,11,31,5,40,7,8,40,23,30};
		 int max=0;
		 int Secondmax=0;
		 for(int i=0;i<arr.length;i++) {
			 if(max<arr[i]) {
				 Secondmax=max;
				 max=arr[i];
			 }
			 else if(arr[i]>Secondmax&&arr[i]!=max) {
				 Secondmax=arr[i];
			 }
		 }
		 System.out.println(Secondmax);
	 }
 }
 */
 
 //printing zero at last indexs
/* 
public class Array2{
	 public static void main(String[] args) {
		 int arr[]= {0,1,0,4,12};
		 int j=0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]!=0&&arr[j]==0) {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				 j++;
			 }
		 }
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 } 
//		 for(int i=arr.length-1;i>=0;i--) {
//			 System.out.println(arr[i]);
//		 }
	 }
 }*/
 
 public class Array2{
	 public static void main(String[] args) {
//		 int arr[] = {2,11,31,5,40,7,8,40,23,30};
		 Integer i1=128;
		 Integer i2=128;
		 System.out.println(i1==i2);
	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 


