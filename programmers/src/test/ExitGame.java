package test;

import java.util.Scanner;

public class ExitGame {
	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		int input;
		Scanner sc = new Scanner(System.in);
		while (cnt != 5) {
			cnt++;
			input = sc.nextInt();
			System.out.print("입력 : " + input);

			sum += input;
			System.out.println(", 합 : " + sum);
			if (sum >= 100) {
				break;
			}
		}
		System.out.println("프로그램 종료!");
		sc.close();
	}
}
