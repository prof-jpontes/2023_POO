//programa: leia o nome e a idade de alguém 
//e escreva se ela pode ou não se casar.
//se a pessoa tiver menos de 16, diga que não pode se casar
import java.util.Scanner;
public class Casamento{
    public static void main(String[] args){
        String nome;
        int idade;
        boolean autorizar = true;
        Scanner ler = new Scanner (System.in);
        System.out.println ("Digite o Nome da Pessoa:  ");
        nome = ler.nextLine();
        System.out.println ("Digite a Idade da Pessoa:  ");
        idade = ler.nextInt ();
        if(idade<=15){
            autorizar = false;
        }else if (idade<18){
            autorizar = false;
            System.out.println ("Os Pais autorizam o Casamento (S/N) ?");
            char r = ler.next().charAt(0);
            if (r=='S'||r=='s'){
            autorizar = true; 
            }
        }
        if(autorizar){
            System.out.println(nome+" pode se casar");

        }else{
        System.out.println(nome+" Não pode se casar");  
        }
    }

}