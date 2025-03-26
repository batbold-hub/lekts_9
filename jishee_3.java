package lekts_9;

import java.util.Scanner;

public class jishee_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		assert age >=18 :"Age must be at least 18.";
		System.out.println("Access granted");

	}

}
