package hackerChallenge;

import java.util.Scanner;

public class OutPutFormatting {

	public static void main(String[] args) {
		String s;
		int n;
		String formatting;
		String spaces;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===========================");
		
		for(int i=0;i<3;i++) {
			
			s = scan.next(); // finds & returns the next complete token in the scanner.
			n = scan.nextInt(); // scans the next token of input as int.
			/*is to take an integer n & format it as a string with a 
			  minimum width of 3 charaters.
			  If n requires less than 3 characters to represent, 
			  leading zeros will be added to make up the width of 3 characters.*/
			formatting = String.format("%03d", n); 
			
			spaces = "";
			
			for(int j =0; j<=(15-s.length());j++)
				spaces = spaces + " ";
				System.out.println(s+spaces+n);
		}
		System.out.println("===========================");	
		scan.close();
	}
	
}
