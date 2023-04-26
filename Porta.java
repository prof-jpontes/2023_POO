public class Porta{
	String cor;
	String material;
	double comprimento;
	double largura;
	boolean fechada = true;
	public void abrir(){
		this.fechada = false;
	}
	public void fechar(){
		this.fechada = true;
	}
	public double getArea(){
		return this.comprimento * this.largura;
	}
	public double getPerimetro(){
		return 2*(this.comprimento + this.largura);
	}
}

