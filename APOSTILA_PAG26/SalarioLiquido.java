import java.util.Scanner;
public class SalarioLiquido {
	public static void main(String args []) {
		Scanner ler = new Scanner (System.in);
		int pi,vh,na,sal,desc,sl;
		System.out.println("Coloque o percentual do INSS: ");
		pi = ler.nextInt();
		System.out.println("Numeros de aulas:");
		na = ler.nextInt();
		System.out.println("Coloque o valor da hora:");
		vh = ler.nextInt();
		sal= na*vh;
		desc= sal/100*pi;
		sl= sal-desc;
		System.out.println("Salário Liquído= " +sl);
		ler.close();
	}
}