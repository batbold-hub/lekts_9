package lekts_9;

public class finaltest {
	public static void main(String[] args) {

	final char[] vowels = new char[] {'x', 'y', 'z'};
	System.out.println("�?нхны үү�?г�?�?�?н т�?мд�?гтүүд: ");
	for(char i: vowels) {
		System.out.println(i);
	
	}
	vowels[0] = 'z';
	System.out.println("Ма�?�?ивийн �?хний �?лементийг өөрчил�?ний дараа:");
	for(int i=0; i<3; i++) {
		System.out.println(vowels[i] + "");
	}
	}
}
