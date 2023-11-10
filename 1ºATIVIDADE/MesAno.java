import java.util.Scanner;
public class MesAno {
	public static void main(String args []) {
		Scanner ler = new Scanner (System.in);
		int dias,mes,ano;
		System.out.println("dias:");
		dias = ler.nextInt();
		mes = dias/30;
		ano = dias/365;
		System.out.println(dias+ ",equivale a "+mes+" meses e "+ano+" anos");
		ler.close();
	}

}
