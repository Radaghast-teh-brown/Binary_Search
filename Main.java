import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner inner = new Scanner(System.in);
		System.out.println("Welcome to my own source code for binary search");
		ArrayList<Integer> list_of_numbers = new ArrayList<Integer>();
		while(true) {
			System.out.println("If ADD type 1 or 2 to EXIT");
			int verification = inner.nextInt();
			if( verification == 1) {
				System.out.println("Type a number:");
				int number = inner.nextInt();
				list_of_numbers.add(number);
			}else if(verification == 2) {
				break;
			}else {
				System.out.println("Incorrect input");
			}	
		}
		for(int i = 0; i < list_of_numbers.size(); i++) {
			System.out.print(list_of_numbers.get(i));
		}
		
		int a, b;
		a = 3;
		b = 4;
		int result = soma(a,b);
		System.out.println("\n"+result);
		
	}
	
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	
}
