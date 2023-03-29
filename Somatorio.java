import java.util.Scanner;
public class Somatorio{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int soma = 0;
        int numero;
        while(true){
            numero = ler.nextInt();
            if(Somatorio.isPrimo(numero)){
                break;
            }
            soma+=numero;
        }
        System.out.printf("SOMA = %d\n",soma);
    }
    public static boolean isPrimo(int n){
        int div = 0;
        if(n == 0 || n == 1){
            return false;
        }
        for(int i = 1; i<=n; i++){
            if(n%i==0){
            div++;
            }
        }
        if(div == 2){
            return true;
        }
        return false;
    }
}
