import java.util.Scanner;
public class PrestacaoAtrasada {
	public static void main(String args []) {
		Scanner ler = new Scanner (System.in);
		int val,tax,t,p;
		System.out.println("valor: ");
		val = ler.nextInt();
		System.out.println("taxa: ");
		tax = ler.nextInt();
		System.out.println("Tempo: ");
		t = ler.nextInt();
		p = val+(val*(tax/100)*t);
		System.out.println("prestação: "+p);
		ler.close();
	}

}
