package lekts_9;

import java.util.Scanner;

public class jishee2_2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        System.out.print("Тоо оруулна уу: ");
        int x = sc.nextInt();
        
        assert x >= 0 : "Тоо 0-�?�?�? их буюу т�?нцүү байх ё�?той";
        
        System.out.println("Өгөгд�?өн тоо: " + x);
        
        sc.close();

	}

}
