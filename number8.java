package 문제풀이;

public class number8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i, j;
		
		for(i=1; i<=5; i++) {
			printStar(i);
			System.out.println("");
			
		}
		
		
		
		
	}
	
	public static void printStar(int x) {
		int y;
		for(y=0; y<x; y++) {
			System.out.print("*");
		}
	
	}
}
