package ����Ǯ��;

import java.util.Scanner;

public class number7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String c = input("ö��");
		String k = input("����");
		
		
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
		System.out.println("���º�");
	}
		
		else 					{
			
			if(a.equals("r")) {
				
				if(b.equals("s")){
					System.out.println("����");
								}
				else { //p
					System.out.println("����");
					}
							}
			
			else if(a.equals("s")) {
				
				if(b.equals("r")){
					System.out.println("����");
								}
				else {
					System.out.println("����");
					}
							}

			else if(a.equals("p")) {

				if(b.equals("r")){
					System.out.println("����");
				}
				else {
					System.out.println("����");
				}
			}
			
							}
		
	}

}
