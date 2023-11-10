import java.util.Scanner;
public class AreaRetangulo {
	public static void main(String args []) {
		Scanner ler = new Scanner (System.in);
		double v1,v2,area;
		System.out.println("Base: ");
		v1 = ler.nextDouble();
		System.out.println("Altura: ");
		v2 = ler.nextDouble();
		area = v1*v2;
		System.out.println("A área do retangulo é: "+ area);
		ler.close();
	}
}
