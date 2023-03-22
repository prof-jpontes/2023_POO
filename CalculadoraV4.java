    import java.lang.Math;
    import java.util.Scanner;
    public class CalculadoraV4{
    	public static void main(String[] args) {
            Scanner ler = new Scanner (System.in);
            char repetir = 'S';
            while (repetir == 'S' || repetir == 's') {
              System.out.println("Informe dois numeros inteiros");
              int a = ler.nextInt();
              int b = ler.nextInt();
              System.out.println("Qual operação deseja realizar?");
              System.out.println("+ -> Soma \n- -> SubtraçAo \n* -> MultiplicaçAo \n/ -> DivisAo \n% -> Resto \nr -> DivisAo Real \n@ -> Valor Absoluto \n^ -> PotenciaçAo \n& -> RadiciaçAo ");
              char opcao = ler.next().charAt(0);
              switch (opcao){
            case '+': 
                System.out.println("soma = "+(a+b));
                break;
            case '-':
                System.out.println("SubtraçAo = "+(a-b));
                break;
            case '*':
                System.out.println("MultiplicaçAo = "+(a*b));
                break;
            case '/':
                System.out.println("DivsAo de "+a+" sobre "+b+" = "+(a/b));
                break;
            case '%':
                System.out.println("Resto da divsAo de "+a+" sobre "+b+" = "+(a%b));
                break;
            default : 
                System.out.println ("OPÇÃO INVALIDADA!");
                break;
            case 'r':
                System.out.println("DivsAo real de "+a+" sobre "+b+" = "+((float)a/b));
                break;
            case '@':
                System.out.println("Valor absoluto de "+(a-b)+" = "+(Math.abs(a-b)));
                break;
            case '^':
                System.out.println("PotenciaçAo de "+a+ "^"+b+ " = "+(Math.pow(a, b)));
                break;
            case '&':
                System.out.println("RadiciaçAo de "+a+ " por "+b+ " = "+(Math.pow(a, 1.0/b)));
                break;
            }
            System.out.println("Desejas fazer outra operaçAo? (S/N)");
            repetir = ler.next().charAt(0);
        }
    }
    }