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
		
		System.out.println("Raw list\n");
		for(int i = 0; i < list_of_numbers.size(); i++) {
			System.out.print(list_of_numbers.get(i) + " ");
		}
		
		System.out.println("\nSorted list\n");
		list_of_numbers.sort(null);
		for(int i = 0; i < list_of_numbers.size(); i++) {
			System.out.print(list_of_numbers.get(i) + " ");
		}
	}
	

	
	public static int binary_search(int value, ArrayList<Integer> array_enter) {
		
		ArrayList<Integer> new_array = new ArrayList<Integer>();
		new_array = array_enter;
		
		if( new_array.size() == 0)return -1;
		else {
			int middle = new_array.size()/2;
			if( new_array.get(middle) == value) {
				return middle;
			}else if(new_array.get(middle) > value) {
				new_array = (ArrayList<Integer>) array_enter.subList(0, middle);
				binary_search(value, new_array );
			}else if(new_array.get(middle) < value) {
				new_array = (ArrayList<Integer>) array_enter.subList(middle + 1, new_array.size());
			}
			return -1;
			
		}
	}
	
}
