import java.util.Scanner;
public class Salario {
	public static void main(String args []) {
	Scanner ler = new Scanner (System.in);
	int sal, maxdiv;
	System.out.println("coloque o seu salario: ");
	sal = ler.nextInt();
	maxdiv = sal+(sal*30)/100;
	System.out.println("Valor máximo de dívidas = " +maxdiv);
	ler.close();
	}
}
