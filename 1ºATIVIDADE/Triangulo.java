import java.util.Scanner;
public class Triangulo {
	public static void main(String args[]){
		Scanner ler = new Scanner (System.in);
		double base,h,area;
		System.out.println("Entre com a base:");
		base = ler.nextDouble();
		System.out.println("Entre com a altura:");
		h = ler.nextDouble();
		area=(base*h)/2;
		System.out.println("a area do triangulo é "+area);
		ler.close();
	}

}
