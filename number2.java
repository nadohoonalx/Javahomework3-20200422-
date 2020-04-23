package 문제풀이;

import java.util.Scanner;

public class number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
		
		switch(num) {
			
		case 1:
			System.out.println("아주 잘했습니다");
			break;
		
		case 2:
		case 3:
			System.out.println("잘했습니다");
			break;
			
		case 4:
		case 5:
		case 6:
			System.out.println("보통입니다");
			break;
		
		default:
			System.out.println("노력하겠습니다");
			break;
		
		
		
		}
		
	}

}
