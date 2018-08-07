package com.cwt.ph.sahoo.bismaya;

import java.util.Scanner;

public class Solution {
	public int prime(int n){
		
		int result = 1;
		//int sum = 0;
	       for (int i = 1; i <= n; i++) {
	    	  
	           result = result * i;
	         
	       }
	       System.out.println(result);
	      
	      //System.out.println(sum);
	       
	        return getSum(result);
	}
	public int getSum(int n)
    {    
        int sum = 0;
         
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
        System.out.println(sum);
     
    return checkPrime(sum);
    }
	public int checkPrime(int n){  
		
		
		  int i,m=0,flag=0;      
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		          
		    } 
		    
		   } 
		   
		   if(flag==0)  {
			   System.out.println(n+" is prime number");
			  
			   }
		   
		  }//end of else  
		  return 1;
		} 

	public static void main(String[] args) {
		Solution s = new Solution();
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Number");
		int number= scn.nextInt();
		s.prime(number);
		System.out.println();
		

	}

}
