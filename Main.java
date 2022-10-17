import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner inner = new Scanner(System.in);
		System.out.println("Welcome to my own source code for binary search. \n");
		System.out.println("Type the size of your list:\n");
		
		int list_size = inner.nextInt();
		int [] list_of_numbers = new int[list_size];
		
		for(int i = 0; i < list_size; i++) {
			System.out.println("Type the number: ");
			int number = inner.nextInt();
			list_of_numbers[i] = number;
			
		}
		System.out.println("Raw list\n");
		for(int i = 0; i < list_of_numbers.length; i++) {
			System.out.print(list_of_numbers[i] + " ");
		}
		
		System.out.println("\nThe answer (1) or (0)\n");
		
		int answer  = binary_search(1, 0, list_of_numbers.length, list_of_numbers);
		System.out.println(answer);
	}
	

	
	public static int binary_search(int value, int beg, int ed, int [] new_array) {
		int begin = beg;
		int end = ed;
		
		while( end >= begin) {
			if( new_array.length == value) {
				return 1;
				}
			else {
				int middle = (begin + end)/2;
				if( new_array[middle] == value) {
					return middle;
				}else if(new_array[middle] > value) {
					binary_search(value, 0, middle-1, new_array );
				}else if(new_array[middle] < value) {
					binary_search(value, middle+1 , new_array.length, new_array );
				}
				return -1;
			}
		}
		return -1;
		
	}
	
}
