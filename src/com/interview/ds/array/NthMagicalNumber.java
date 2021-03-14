package com.interview.ds.array;

public class NthMagicalNumber {

	public static void main(String[] args) {
		System.out.println("---------------------Test Case 1-------------------------");
		int n = 5 ;
		int a = 2 ;
		int b = 4;
		System.out.println("Nth Magical Number : "+nthMagicalNumber(n, a, b));
		System.out.println();
		
		System.out.println("---------------------Test Case 2-------------------------");
		n = 4 ;
		a = 2 ;
		b = 3;
		System.out.println("Nth Magical Number : "+nthMagicalNumber(n, a, b));
		
		System.out.println("---------------------Test Case 3-------------------------");
		n = 3 ;
		a = 6 ;
		b = 4;
		System.out.println("Nth Magical Number : "+nthMagicalNumber(n, a, b));
		
		System.out.println("---------------------Test Case 4-------------------------");
		n = 5 ;
		a = 2 ;
		b = 4;
		System.out.println("Nth Magical Number : "+nthMagicalNumber(n, a, b));
		
		System.out.println("---------------------Test Case 5-------------------------");
		n = 3 ;
		a = 8 ;
		b = 3;
		System.out.println("Nth Magical Number : "+nthMagicalNumber(n, a, b));
		
		System.out.println("---------------------Test Case 6-------------------------");
		n = 1000000000 ;
		a = 40000 ;
		b = 40000;
		System.out.println("Nth Magical Number : "+nthMagicalNumber(n, a, b));
		
		System.out.println("---------------------Test Case 7-------------------------");
		n = 1000000000 ;
		a = 39999 ;
		b = 40000;
		System.out.println("Nth Magical Number : "+nthMagicalNumber(n, a, b));
		
	}
	
	 public static  int nthMagicalNumber(int n, int a, int b) {
		if(a < b) {
			int temp = a;
			a = b;
			b = temp;
		} 
		long lcm = findLCM(a, b)% ((int)Math.pow(10, 9) + 7);
	    long migicalOccurenceInLCM = lcm / a + lcm / b -1;

	    long prod = n /migicalOccurenceInLCM ;
	    prod = prod % ((int)Math.pow(10, 9) + 7);
	    long mod = n % migicalOccurenceInLCM;
	    long nThMagicalNumbner = 0 ;
	    nThMagicalNumbner = (lcm * prod) % ((int)Math.pow(10, 9) + 7) ;
	    long count = 0;
	    long ai = 1 , bi = 1;
	    
	    while(count < mod) {
	    	
	    	if(a*ai < b*bi) {
	    		ai++;
	    	}else {
	    		
	    		bi++;
	    	}
	    	count++;
	    }
	    ai-- ; bi--;
	    if(a*ai > b*bi) {
	    	nThMagicalNumbner = (nThMagicalNumbner  % ((long)Math.pow(10, 9) + 7) + a*ai % ((long)Math.pow(10, 9) + 7)) % ((long)Math.pow(10, 9) + 7) ;
	    }else {
	    	nThMagicalNumbner = (nThMagicalNumbner  % ((long)Math.pow(10, 9) + 7) + b*bi % ((long)Math.pow(10, 9) + 7)) % ((long)Math.pow(10, 9) + 7) ;
	    }
	    
		return (int)(nThMagicalNumbner  % ((long)Math.pow(10, 9) + 7) );
	  }
	 
	 private static long findLCM (long a , long b) {
			long gcd = findGCD(a, b);
		 
		 return (a * b )/ gcd;
	 }

	private static long findGCD(long a, long b) {
		
		if(a % b == 0) {
			return b;
		}
		
		return findGCD(b, a%b);
	}
	

}
