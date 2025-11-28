package week1.sunday;

public class Fibonacci {

	public static void main(String[] args) {

//	FIBONACCI SERIES
		
		int limit = 8;
		int i=0,j=1;
		
		for (int n=0; n<limit;n++) {
			
			System.out.println(i);
			int s = i+j;
			i=j;
			j=s;
	
		}
	}
}

/***
 * 	output	0	1	1	2	3	5	8
 * 
 * 		print i		s		i	j	
 * 							0	1
 * n=0
 * 		0			1		1	1
 * n=1
 * 		1			2		1	2
 * n=2	
 * 		1			3		2	3
 * n=3
 * 		2			5		3	5
 * n=4
 * 		3			8		5	8
 * n=5
 * 		5			13		8	13
 * n=6
 * 		8			21		13	21
 * n=7
 * 		13			34		21	34
 * 
 * 
 * 
 * 
 */



