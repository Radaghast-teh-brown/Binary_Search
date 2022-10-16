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
		
		System.out.println("\nSorted list\n");
		
		for(int i = 0; i < list_of_numbers.length; i++) {
			System.out.print(list_of_numbers[i] + " ");
		}
		
		int answer  = binary_search(1,list_of_numbers);
		System.out.println(answer);
	}
	

	
	public static int binary_search(int value, int [] array_enter) {
		
		int[] new_array = new int[array_enter.length];
		new_array = array_enter.clone();
		int begin = 0;
		int end = array_enter.length;
		
		while( end >= begin) {
			if( new_array.length == 0)return -1;
			else {
				int middle = (begin + end)/2;
				if( new_array[middle] == value) {
					return middle;
				}else if(new_array[middle] > value) {
					System.arraycopy(array_enter, 0, new_array, 0,middle-1);
					binary_search(value, new_array );
				}else if(new_array[middle] < value) {
					System.arraycopy(array_enter, 0, new_array, 0,middle+1);
					binary_search(value, new_array );
				}
				return -1;
			}
		}
		return -1;
		
	}
	
}
