import java.util.Scanner;
public class Coelho {
	public static void main(String args []) {
		Scanner ler = new Scanner (System.in);
		double nc,c;
		System.out.println("Quantidade de Coelhos: ");
		nc = ler.nextDouble();
		c = (nc*0.70)/18+10;
		System.out.println("Valor do Coelho: "+c);
		ler.close();
	}
}
