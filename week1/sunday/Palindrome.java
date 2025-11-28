package week1.sunday;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// PALINDROME
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int rev = 0;
		
//					12		
		for (int i=num; i>0; i=i/10) {
			int x = i%10;	//2
			rev = rev*10+x;		//2
		}
		if (num==rev) {
			System.out.println(num+" is a Palindrome");
		}
		else {
			System.out.println(num+ " is not a palindrome");
		}

	}

}

/*		num	=	12
 * 		rev =    0
 * 	
 * 			i		x=i%10		rev*10+x = rev		i=i/10		i>0
 * 			12		2			0*10+2 = 2				1		y
 * 			1		1			2*10+1 = 21			 	.1		n
 * 
 * 
 * 
 * 		num	=	1234
 * 		rev =    0
 * 	
 * 			i		x=i%10		rev*10+x = rev		i=i/10		i>0
 * 	
 * 			1234	4			0*10+4 = 4			123			y
 * 			123		3			4*10+3 = 43			12			y
 * 			12		2			43*10+2 = 432		1			y
 * 			1		1			432*10+1 = 4321		0			n		
 * 
 * 
 * 
 * 		num	=	121
 * 		rev =    0
 * 	
 * 			i		x=i%10		rev*10+x = rev		i=i/10		i>0
 * 	
 * 			121		1			0*10+1 = 1			12			y
 * 			12		2			1*10+2 = 12			1			y
 * 			1		1			12*10+1 = 121		0			n 		
 * 
 * 
 * 
 * 
 */ 