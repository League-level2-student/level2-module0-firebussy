package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] z = {"Cool","Hello", "King", "Fire", "Space"};
		//2. print the third element in the array
		System.out.println(z[2]);
		//3. set the third element to a different value
	z[2]="Cool";
		//4. print the third element again
		System.out.println(z[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < z.length; i++) {
			System.out.println(z[i]);
		}
	
		
		
		//6. make an array of 50 integers
		int[] c= new int [50];
		//7. use a for loop to make every value of the integer array a random number
		Random k = new Random ();
		for (int i = 0; i < c.length; i++) {
			c[i]= k.nextInt(); 
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestvalue=c[0];
		for (int i = 1; i < c.length; i++) {
			if (c[i]<smallestvalue) {
				smallestvalue=c[i];
			}
		}
		System.out.println(smallestvalue);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);	
		}
		
		
		//10. print the largest number in the array.
		int largestvalue= c[c.length-1];
		for (int i = 0; i < c.length; i++) {
			if (c[i]>largestvalue) {
				largestvalue=c[i];
		}
		}
	}

}