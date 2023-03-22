    import java.util.Scanner;
    public class CalculadoraV3{
    	public static void main(String[] args) {
            Scanner ler = new Scanner (System.in);
            char repetir = 'S';
            while (repetir == 'S' || repetir == 's') {
              System.out.println("Informe dois numeros inteiros");
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
            case '*':
                System.out.println("multiplicação = "+(a*b));
                break;
            case '/':
                System.out.println("divsão de "+a+" sobre "+b+" = "+(a/b));
                break;
            case '%':
                System.out.println("resto da divsão de "+a+" sobre "+b+" = "+(a%b));
                break;
            default : 
                System.out.println ("OPÇÃO INVALIDADA!");
                break;
            }
            System.out.println("Desejas fazer outra operação? (S/N)");
            repetir = ler.next().charAt(0);
        }
    }
    }