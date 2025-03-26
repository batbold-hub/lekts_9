package lekts_9;

import java.util.Scanner;

public class jishee_2_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
        assert x >= 0 : "x < 0 ө.х. х-ийн утга 0-�?�?�? их байна!";
        System.out.println("Өгөгд�?өн тоо =:" + x);
	}

}
