public class Programa{
	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.largura = 1.5;
		porta.comprimento = 2.2;
		porta.cor = "Branco";
		porta.material = "Aço";
		porta.abrir();
		System.out.println("Dados da Primeira Porta:");
		System.out.println("Largura = "+ porta.largura + "\nComprimento = " + porta.comprimento);
		System.out.println(porta.fechada?"Porta estA fechada":"porta estA aberta");
		System.out.println("Cor da Porta = " + porta.cor + "\nMaterial da porta = " + porta.material);
		System.out.println(porta); //Mostrar endereço de memória da referência

		Porta portaLab01 = new Porta();
		portaLab01.largura = 1.0;
		portaLab01.comprimento = 2.0;
		portaLab01.cor = "Laranja Madeira";
		portaLab01.material = "Madeira";
		portaLab01.abrir();
		System.out.println("\nDados da Segunda Porta:");
		System.out.println("Largura = "+ portaLab01.largura + "\nComprimento = " + portaLab01.comprimento);
		System.out.println(portaLab01.fechada?"Porta estA fechada":"porta estA aberta");
		System.out.println("Cor da Porta = " + portaLab01.cor + "\nMaterial da porta = " + portaLab01.material);
		System.out.println(portaLab01); //Mostrar endereço de memória da referência

		Porta porta3 = new Porta();
		porta3.largura = 1.0;
		porta3.comprimento = 2.0;
		porta3.cor = "Laranja Madeira";
		porta3.material = "Madeira";
		porta3.abrir();
		System.out.println("\nDados da Terceira Porta:");
		System.out.println("Largura = "+ porta3.largura + "\nComprimento = " + porta3.comprimento);
		System.out.println(porta3.fechada?"Porta estA fechada":"porta estA aberta");
		System.out.println("Cor da Porta = " + porta3.cor + "\nMaterial da porta = " + porta3.material);
		System.out.println(porta3); //Mostrar endereço de memória da referência
	}
}