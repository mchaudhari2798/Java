//Run cmd:-  	javac Divisible.java
//		java Divisible

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Positive no:");
		Scanner sc=new Scanner(System.in); 
		int n =sc.nextInt();
		sc.close();
		//System.out.println(n);
			
			if((n%2==0) && (n%5==0))
				System.out.println(n+" is divisible by both 2 & 5");
			else if(n % 2==0)
				System.out.println(n+" is divisible by 2");
			else if(n%5==0)
				System.out.println(n+ " is divisible by 5"); 
			else
				System.out.println(n+" is not divisible by either 2 or 5");
		

	}

}
