import java.util.*;

public class Conta {

    public String numConta;

    public String numAgencia;

    public Cliente cliente;

    public double saldo;

    public String chavePix;

    public Conta(String numConta, String numAgencia){

        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.saldo = 0;


    }
    public boolean sacar(double valor) {
        valor = 1.01 * valor;
      if(valor <= this.saldo){
          this.saldo -= valor;
          return true;
      }
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean transferir(double valor, Conta destino) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public boolean fazerPix(double valor, String chave) {
        //identificar conta vinculada a chave;
        Conta c = null;
        return this.transferir(valor,c);
    }

    public String getRelatorio(){
        String relatorio = "\n";
        relatorio += "Número da Agência: "+this.numAgencia;
        relatorio += "\nNúmero da Conta: "+this.numConta;
        relatorio += "\nCliente: "+this.cliente.getRelatorio();
        relatorio += "\nSaldo: "+this.saldo;
        return relatorio;
    }
}
