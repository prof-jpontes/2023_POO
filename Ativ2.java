import java.util.Scanner;
public class Ativ2{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		System.out.printf("Adicao de %d por %d = %d\n", a, b, a+b);
		System.out.printf("Subtracao de %d por %d = %d\n", a, b, a-b);
		System.out.printf("Multiplicacao de %d por %d = %d\n", a, b, a*b);
		System.out.printf("Divisao de %d por %d = %.2f\n", a, b, ((float)a/b));
		System.out.printf("Resto da divisao inteira de %d por %d = %d\n", a, b, a%b);
}
}