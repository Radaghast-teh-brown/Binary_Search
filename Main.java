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
		
		int answer  = binary_search(10, 0, list_of_numbers.length, list_of_numbers);
		System.out.println(answer);
	}
	

	
	public static int binary_search(int value, int beg, int ed, int [] new_array) {
		int begin = beg;
		int end = ed;
		int middle = begin + (end - begin)/2;
		if( end >= begin) {
				if( new_array[middle] == value){
					return 1;
				}
				if(new_array[middle] > value) {
					return binary_search(value, begin, middle-1, new_array );
				}
				if(new_array[middle] < value) {
					return binary_search(value, middle+1 , end, new_array );
				}
			}
		return 0;
		
	}
	
}
