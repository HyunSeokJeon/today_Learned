package test;

import java.util.Scanner;

public class SignPrint {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		String result = num < 0 ? "음수" : num > 0 ? "양수" : "0";
		System.out.println(result);
		sc.close();
	}
}
