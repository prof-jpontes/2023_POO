import java.util.Scanner;
public class TestaIdade{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe a idade atual");
		int idadeAtual = ler.nextInt();
		//int idadeProximoAno = idadeAtual+1;
		System.out.println("Idade ano que vem: "+ (idadeAtual+1)); 
		System.out.println("Informe um ano"); 
		int ano = ler.nextInt();
		int novaIdade = idadeAtual + ano - 2023;
		System.out.println("Nova idade: "+ novaIdade);

	}
}