package week1.sunday;

import java.util.*;

public class PrimeNumber {
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		if (a<=1) {
			System.out.println(a+" is less than 1, so not a prime number");
		}
		else {

			boolean prime = true;
			
			for (int i=2; i<=Math.sqrt(a); i++) {
				if(a%i==0) {
					prime = false;
					break;
				}
			}

			if (prime){
				System.out.println(a+" is a prime number");
				}
			else
			{					
				System.out.println(a+" is NOT a prime number");

			}

		}
		
	
}
}