import java.util.Scanner;
public class TestaNumeros{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		byte b = ler.nextByte();
		System.out.println("Tipo Byte: " + b);
		short s = ler.nextShort();
		System.out.println("Tipo Short: " + s);
		long l = ler.nextLong();
		System.out.println("Tipo Long: " + l);
		boolean bool = b==s;
		System.out.println("Tipo Boolean: " + bool);
		float f = ler.nextFloat();
		System.out.println("Tipo Float: " + f);
		System.out.printf("Teste %.2f float\n", f);
		double d = ler.nextDouble();
		System.out.println("Tipo Double: " + d);
	}
}