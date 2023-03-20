import java.util.Scanner;
public class Calculadora{
	public static void main(String[] args) {
		System.out.println("Informe dois numeros inteiros");
		Scanner ler = new Scanner (System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		int soma = a+b;
		int subtracao = a-b;
		int multiplicacao = a*b;
		float divisao = (float)a/b;
		int resto = a%b;
		System.out.println("Soma: " + soma);
		System.out.println("Subtracao: " + subtracao);
		System.out.println("Multiplicacao: " + multiplicacao);
		System.out.println("Divisao: " + divisao);
		System.out.println("Resto: " + resto); 
	}
}