package boj;

import java.util.Scanner;

public class Main_10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] arr1 = new int[5];
		
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
			if (arr1[i] < 40) {
				arr1[i] = 40;
			} 
			
			sum += arr1[i];
			
		}
		int avg =  sum / arr1.length;
		System.out.println(avg);
		sc.close();
	}
}
