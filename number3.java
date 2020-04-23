package 문제풀이;

import java.util.Scanner;

public class number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int i;
		int j = 0;
		
		Scanner in = new Scanner(System.in);
		
		do {
		
			
			System.out.println("양의 정수를 입력하세요 :");
			num = in.nextInt();
			
			if(num%2 ==0) {
				j+=num;
			}
			
			else if(num<0) {
				break;
			}

			
		}while(true);

		System.out.println("입력한 양의 정수 중에서 짝수의 합은" + j);
}
}
