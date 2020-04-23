package 문제풀이;

import java.util.Scanner;

public class number10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("양의 정수를 입력하세요 :");
		int num = new Scanner(System.in).nextInt();
		
		
		if(isPrime2(num)) 
			System.out.println(num+"는 소수입니다");
		
		else
			System.out.println(num+"는 소수가 아닙니다");
	}
	
	
	public static boolean isPrime2(int a) {
		int i;
		int count=0;
		int x = a;
		
		for(i =2; i<=x; i++) {
			
			if(a%i==0) {
				count+=1;
			}
			
			}
		
		if(count==1)
		{
			return true;
				
				}
	
		return false;
	
}
}
