import java.util.Scanner;
public class Temperatura {
	public static void main(String args []) {
		Scanner ler = new Scanner (System.in);
		int f,c;
		System.out.println("Temperatura em Fahrenheit: ");
		f = ler.nextInt();
		c = (f-32)*5/9;
		System.out.println("Temperatura em Celsius: "+c);
		ler.close();
	}
}
