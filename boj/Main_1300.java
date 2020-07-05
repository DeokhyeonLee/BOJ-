package boj;
//두 수 비교하기
import java.util.Scanner;

public class Main_1300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a>b) {
			System.out.println(">");
		} else if(a<b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}
