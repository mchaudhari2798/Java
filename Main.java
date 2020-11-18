//Run cmd:-  	javac Main.java
//		    java Main
//

import java.util.*;
class Main{ 
    	    public static void main(String[] args) 
    	    { 
    	    	Scanner sc=new Scanner(System.in);
    	    	System.out.println("Enter size of array(N):");
    	    	int N=sc.nextInt();
    	    	int Array[] =new int[N]; 
    	        N = Array.length; 
    	        System.out.println("Enter elements of array(N):");
    	        for(int i = 0; i < N; i++)
    	        {
    	            Array[i] = sc.nextInt();
    	       
    	        }
    	        System.out.println("Repeating element: "); 
    	    	  
    	        for (int i = 0; i < N; i++) { 
    	            int abs_val = Math.abs(Array[i]); 
    	            if (Array[abs_val - 1] > 0) 
    	                Array[abs_val - 1] = -Array[abs_val - 1]; 
    	            else
    	                System.out.println(abs_val); 
    	        } 
    	  
    	        System.out.println("Missing element: "); 
    	        for (int i = 0; i < N; i++) { 
    	            if (Array[i] > 0) 
    	                System.out.println(i + 1); 
    	        } 
    	    } 
    	} 
    	 
