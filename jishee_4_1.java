package lekts_9;

import java.util.Scanner;

public class jishee_4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		assert age>=18: "Санал өгч болохгүй";
		System.out.println("Ирг�?ний на�?:"+age);
		sc.close();

	}

}
