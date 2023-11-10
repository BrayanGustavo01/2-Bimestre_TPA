import java.util.Scanner;
public class NomeIdade {
	public static void main(String args []){
		Scanner ler = new Scanner (System.in);
		int anoNasc,anoAtual,idade,n;
		System.out.println("Qual é o seu nome: ");
		n = ler.nextInt();
		System.out.println("Ano de Nascimento: ");
		anoNasc=ler.nextInt();
		System.out.println("Ano atual");
		anoAtual=ler.nextInt();
		idade = anoAtual-anoNasc;
		System.out.println(n+" sua idade é: "+idade);
		ler.close();
	}
}
