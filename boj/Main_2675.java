package boj;

import java.util.Scanner;

public class Main_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {

			int R = sc.nextInt();
			String S = sc.next(); // nextLine() 을 쓰면 error!

			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) { // R 만큼 반복 출력
					System.out.print(S.charAt(j));
				}
			}

			System.out.println();
		}
		sc.close();
	}
}



/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
	
			String[] str = br.readLine().split(" ");	// 공백 분리
			
			int R = Integer.parseInt(str[0]);	// String -> int
			String S = str[1];
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}

}*/