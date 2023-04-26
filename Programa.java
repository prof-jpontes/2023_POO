public class Programa{
	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.largura = 1.5;
		porta.comprimento = 2.0;
		porta.abrir();
		System.out.println("Largura"+ porta.largura + "\n Comprimento" + porta.comprimento + "Status: "+ porta.fechada);
		


	}
}