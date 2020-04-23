package ¹®Á¦Ç®ÀÌ;

import java.util.Scanner;

public class number7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String c = input("Ã¶¼ö");
		String k = input("¿µÈñ");
		
		
		whosWin(c,k);
		
		
		
		
	}
	
	public static String input (String a) {
		String x;
		x =a;
		return x;
	
	}
	
	public static void whosWin (String x, String y) {
		
	

	String a,b;
	Scanner in = new Scanner(System.in);
	Scanner in2 = new Scanner(System.in);
	
	System.out.print(x+":");
	a= in.next();
	System.out.print(y+":");
	b = in2.next();
	
	
	
	if(a.equals(b)) {
		System.out.println("¹«½ÂºÎ");
	}
		
		else 					{
			
			if(a.equals("r")) {
				
				if(b.equals("s")){
					System.out.println("½ÂÀÚ");
								}
				else { //p
					System.out.println("ÆÐÀÚ");
					}
							}
			
			else if(a.equals("s")) {
				
				if(b.equals("r")){
					System.out.println("ÆÐÀÚ");
								}
				else {
					System.out.println("½ÂÀÚ");
					}
							}

			else if(a.equals("p")) {

				if(b.equals("r")){
					System.out.println("½ÂÀÚ");
				}
				else {
					System.out.println("ÆÐÀÚ");
				}
			}
			
							}
		
	}

}
