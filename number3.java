package ����Ǯ��;

import java.util.Scanner;

public class number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int i;
		int j = 0;
		
		Scanner in = new Scanner(System.in);
		
		do {
		
			
			System.out.println("���� ������ �Է��ϼ��� :");
			num = in.nextInt();
			
			if(num%2 ==0) {
				j+=num;
			}
			
			else if(num<0) {
				break;
			}

			
		}while(true);

		System.out.println("�Է��� ���� ���� �߿��� ¦���� ����" + j);
}
}
