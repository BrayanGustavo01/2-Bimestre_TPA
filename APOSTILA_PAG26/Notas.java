import java.util.Scanner;
public class Notas {
	public static void main(String args []) {
		Scanner ler = new Scanner (System.in);
		int nota1 ,nota2 ,nota3 ,nota4,media;
		System.out.println("nota1:");
		nota1 = ler.nextInt();
		System.out.println("nota2:");
		nota2 = ler.nextInt();
		System.out.println("nota3:");
		nota3 = ler.nextInt();
		System.out.println("nota4:");
		nota4 = ler.nextInt();
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("A média é de: "+media);
		ler.close();
	}
}
