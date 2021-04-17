package test;

public class SumAvg {
	public static void main(String[] args) {
		int num = 100;
		int sum = ((1 + num) * num) / 2 ;
		double avg = (double) sum / num;
		
		System.out.println("1~100 ÇÕ°è: " + sum);
		System.out.printf("Æò±Õ: %.2f \n", avg);
	}
}
