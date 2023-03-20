import java.util.Scanner;
public class Calculadora2{
	public static void main(String[] args) {
		System.out.println("Informe dois numeros inteiros");
		Scanner ler = new Scanner (System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		System.out.println("Qual operação deseja realizar?");
        System.out.println("+ -> Soma \n- -> Subtração \n* -> Multiplicação \n/ -> divisão \n% -> resto");
        char opcao = ler.next().charAt(0);
        switch (opcao){
            case '+': 
                System.out.println("soma = "+(a+b));
                    break;
            case '-':
                System.out.println("subtração = "+(a-b));
                    break;
            
        }

	}
}