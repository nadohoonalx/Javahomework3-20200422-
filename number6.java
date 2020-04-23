package ¹®Á¦Ç®ÀÌ;

import java.util.Scanner;

public class number6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		String a,b;
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		System.out.print("Ã¶¼ö:");
		a= in.next();
		System.out.print("¿µÈñ:");
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
						System.out.println("ÆĞÀÚ");
						}
								}
				
				else if(a.equals("s")) {
					
					if(b.equals("r")){
						System.out.println("ÆĞÀÚ");
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
						System.out.println("ÆĞÀÚ");
					}
				}
				
								}
			
			
			
		}
		
	}


