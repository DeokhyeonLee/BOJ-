package boj;
import java.util.Scanner;

//최댓값
public class Main_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int index =0;
		
		int arr1[] = new int[9];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
			if(arr1[i] > max) {
				max = arr1[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
		sc.close();
	}
}
