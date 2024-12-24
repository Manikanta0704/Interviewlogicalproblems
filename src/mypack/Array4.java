package mypack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//
//import java.util.*;
//
//
//String is Palindrom or Not
//
//
//public class Array4 {
//    public static void main(String[] args) {    
//        String str = "abccba";
//        char[] arr = str.toCharArray();
//        
//        int start = 0;
//        int end = str.length() - 1;
//        boolean isPalindrome = true; 
//        
//        while (start < end) {
//            if (arr[start] != arr[end]) {
//                isPalindrome = false;
//                break;  
//            }
//            start++;
//            end--;
//        }
//        
//        if (isPalindrome) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//    }
//}
//
//
//
//
//Number is Palindrom or not
//
//
//public class Array4 {
//    public static void main(String[] args) {
//        int a = 1221;
//        int start = a;
//        int end = 0;
//
//        
//        while (a > 0) {
//            int digit = a % 10;       // 1   ,2   ,2    ,1              
//            end = end * 10 + digit;   // 1   ,12  ,122  ,1221               
//            a = a / 10;               // 122 ,12  ,1    ,0                   
//        }
//
//        if (start == end) {
//            System.out.println(start + " is a palindrome.");
//        } else {
//            System.out.println(start + " is not a palindrome.");
//        }
//    }
//}
//
//
//
//
//
//
//
//Count how many times each element is repeated
//
//
//public class Array4 {
//	
//    public static void main(String[] args) {  
//    	
//        String str = "maadjhjs";
//        char[] arr = str.toCharArray();
//        Map<Character,Integer> m=new LinkedHashMap();
//        
//        
//        for(int i=0;i<arr.length;i++) {
//        	int count=0;
//        	for(int j=0;j<arr.length;j++) {
//        		if(arr[i]==arr[j]) {
//        			count++;
//        			
//        		}
//        	}
//        	m.put(arr[i],count);
//        }        	
//        System.out.println(m);
//    }
//}
//
//
//Right angle triangle
//
//public class Array4{
//	public static void main(String[] args) {
//		for(int i=0;i<6;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}
//
//          * 
//        * * 
//      * * * 
//    * * * * 
//  * * * * * 
//* * * * * * 
//
//
//
//
//public class Array4{
//	public static void main(String[] args) {
//		for(int i=0;i<6;i++) {
//			for(int j=0;j<5-i;j++) {
//				System.out.print(" "+" ");
//			}
//			for(int k=0;k<=i;k++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//	}
//}
//
//
//
// Print Prime Numbers
//
//public class Array4{
//	public static void main(String[] args) {
//		for(int i=1;i<=20;i++) {
//			int count=0;
//			for(int j=1;j<=i;j++) {
//				if(i%j==0) {
//					count++;
//				}
//				
//			}
//			if(count==2) {
//				System.out.println(i+" is prime");
//			}
//			else {
//				System.out.println(i+" Not Prime");
//			}
//			
//		}
//	}
//}
//
//
//
//
//
// Checking Prime or Not
//
//public class Array4{
//	public static void main(String[] args) {
//		System.out.println("Enter any Number : ");
//		Scanner sc=new Scanner(System.in);
//		int x=sc.nextInt();
//		
//		int count=0;
//		for(int i=1;i<=x;i++) {
//			if(x%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println(x+" is a Prime Number");
//		}
//		else {
//			System.out.println(x+" is not a Prime Number");
//		}
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
// Max and Min Elements in an Array 
//
//public class Array4{
//	public static void main(String[] args) {
//		int arr[]= {10,20,5,40,2,7};
//		int max=arr[0];
//		for(int i=0;i<arr.length;i++) {
////			if(max<arr[i]) {             //Min Element
//			if(max>arr[i]) {             //Max Element
//				max=arr[i];
//			}
//		}
//		System.out.println(max);
//	}
//}
//
//
//
//
//
//2nd max Element in an Array
//
//public class Array4{
//	public static void main(String[] args) {
//		int arr[]= {5,9,50,7,30,40};
//		int max=0;
//		int secondMax=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(max<arr[i]) {
//				secondMax=max;
//				max=arr[i];
//			}
//			else {
//				secondMax=arr[i];
//			}
//		}
////		System.out.println(max);
//		System.out.println(secondMax);
//	}
//}
//
//
// Print Using sort method
//public class Array4{
//	public static void main(String[] args) {
//		int arr[]= {10,20,40,2,9,50};
//		Arrays.sort(arr);
//		int secondMax=arr[arr.length-2];
//		System.out.println(secondMax);
//	}
//}
//
//
//
//Swaping Numbers
//public class Array4{
//	public static void main(String[] args) {
//		int a=10;
//		int b=15;
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
//	}
//}
//
//
//
//Swaping using 3rd variable
//
//public class Array4{
//	public static void main(String[] args) {
//		int a=10;
//		int b=15;
//		
//		int temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println(a);
//		System.out.println(b);
//	}
//}
//
//
//
//Finding a number certain index in an fibo series
//
//public class Array4 {
//	public static void main(String[] args) {
//		
//		System.out.println(fibo(4));
//	}
//	static int fibo(int n) {
//		if(n<2) {
//		return n;
//		}
//		return fibo(n-1)+fibo(n-2);
//	}
//}
//
//
//Printing a series of fibo series
//class Array4{
//	public static void main(String[] args) {
//		int first=0;
//		int second=1;
//		
//		for(int i=0;i<10;i++) {
//			int third=first+second;
//			System.out.print(first+" ");
//			
//			first=second;
//			second=third;
//		}
//	}
//}
//
//
//
//
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//* * * * * *
//
//
//public class Array4{
//	public static void main(String[] args) {
//		for(int i=0;i<6;i++) {
//			for(int j=0;j<5-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=0;k<=i;k++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//	}
//}
//
//
//
//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * *
//
//public class Array4{
//	public static void main(String[] args) {
//		for(int i=1;i<6;i++) {
//			for(int j=0;j<5-i;j++) {
//				System.out.print(" "+" ");
//			}
//			for(int k=0;k<2*i-1;k++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//	}
//}
//
//
//
//Armstrong Number or Not
//public class Array4 {
//	public static void main(String[] args) {
//
//		int num, rem, sum = 0, cons;
//		System.out.println("Enter any number:");
//		Scanner sc = new Scanner(System.in);
//		num = sc.nextInt();
//		cons = num;
//
//		while (num > 0) {
//			rem = num % 10;
//			sum = sum + (rem * rem * rem);
//			num = num / 10;
//		}
//		if (cons == sum) {
//			System.out.println("Armstrong number");
//		} else {
//			System.out.println("Not an Armstrong number");
//		}
//	}
//}



//public class Array4{
//	public static void main(String[] args) {
////		String str1="manikanta swamy";
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a string: ");
//		String str1=sc.nextLine();
//		
//		String str2="";
//		
//		char arr[]=str1.toCharArray();
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==' ') {
//				continue;
//			}
//			else {
//				str2=str2+arr[i];
//			}
//		}
//		System.out.println(str2);
//	}
//}


//public class Array4{
//	public static void main(String[] args) {
//		String str="manikantaswamy";
//		char arr[]=str.toCharArray();
//		Map<Character,Integer> m=new HashMap();
//		
//		for(int i=0;i<arr.length;i++) {
//			int count=0;
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//			}
//			m.put(arr[i],count);
//		}
//		System.out.println(m);
//	}
//}

//class Example {
//    Example() {
//        this("Hello"); // Calls the parameterized constructor
//        System.out.println("Default Constructor");
//    }
//
//    Example(String message) {
//        System.out.println("Parameterized Constructor: " + message);
//    }
//}
//
//public class Array4 {
//    public static void main(String[] args) {
//        Example ex = new Example();
//    }
//}


