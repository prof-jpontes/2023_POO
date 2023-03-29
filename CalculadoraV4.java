    import java.lang.Math;
    import java.util.Scanner;
    public class CalculadoraV4{
    	public static void main(String[] args) {
            Scanner ler = new Scanner (System.in);
            char repetir = 'S';
            principal:while (true) {
              System.out.println("Informe dois numeros inteiros");
              int a = ler.nextInt();
              int b = ler.nextInt();
              System.out.println("Que operacAo deseja realizar?");
              System.out.println("+ -> Soma \n- -> SubtracAo \n* -> MultiplicacAo \n/ -> DivisAo \n% -> Resto \nr -> DivisAo Real \n@ -> Valor Absoluto \n^ -> PotenciacAo \n& -> RadiciacAo \nl -> Logaritmo de base 10\nb -> Logaritmo de A na base B\nS -> Sair\n");
              char opcao = ler.next().charAt(0);
              switch (opcao){
            case '+': 
                System.out.println("soma = "+(a+b));
                break;
            case '-':
                System.out.println("SubtracAo = "+(a-b));
                break;
            case '*':
                System.out.println("MultiplicacAo = "+(a*b));
                break;
            case '/':
                System.out.println("DivisAo de "+a+" sobre "+b+" = "+(a/b));
                break;
            case '%':
                System.out.println("Resto da divsAo de "+a+" sobre "+b+" = "+(a%b));
                break;
            default : 
                System.out.println ("OPÇÃO INVALIDADA!");
                break;
            case 'r':
                System.out.println("DivisAo real de "+a+" sobre "+b+" = "+((float)a/b));
                break;
            case '@':
                System.out.println("Valor absoluto de "+(a-b)+" = "+(Math.abs(a-b)));
                break;
            case '^':
                System.out.println("PotenciacAo de "+a+ "^"+b+ " = "+(Math.pow(a, b)));
                break;
            case '&':
                System.out.println("RadiciacAo de "+a+ " por "+b+ " = "+(Math.pow(a, 1.0/b)));
                break;
            case 'l':
                //System.out.println("Logaritmos de " +a+ " e de "+b+ " sAo, respectivamente, "+Math.log10(a)+" e "+Math.log10(b));
                System.out.printf("Logaritmos de A e de B sAo, respectivamente, %.2f e %.2f\n",Math.log10(a),Math.log10(b));
                break;
            case 'b':
            double logA = Math.log10(a);
            double logB = Math.log10(b);
                System.out.printf("Logaritmo de A na base B = %.2f \n", logA/logB);            
            case 's':
                System.out.printf("VocE escolheu sair do sistema\n");
                break principal;
                
            }
            
        }
    }
    }
