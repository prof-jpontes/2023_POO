public class Programa{
	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.largura = 0.9;
		porta.comprimento = 2.2;
		porta.abrir();
		System.out.println("Largura = "+ porta.largura + "\nComprimento = " + porta.comprimento);
		System.out.println(porta.fechada?"Porta está fechada":"porta está aberta");
		


	}
}