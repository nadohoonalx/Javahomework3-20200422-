package ����Ǯ��;

import java.util.Scanner;

public class number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
		
		switch(num) {
			
		case 1:
			System.out.println("���� ���߽��ϴ�");
			break;
		
		case 2:
		case 3:
			System.out.println("���߽��ϴ�");
			break;
			
		case 4:
		case 5:
		case 6:
			System.out.println("�����Դϴ�");
			break;
		
		default:
			System.out.println("����ϰڽ��ϴ�");
			break;
		
		
		
		}
		
	}

}
