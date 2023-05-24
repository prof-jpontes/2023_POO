import java.util.ArrayList;
import java.util.List;

public class Controle {

    List<Cliente> listaClientes = new ArrayList<Cliente>();
    List<Conta> listaContas = new ArrayList<Conta>();

    Cliente cliente;
    int i = 0;
    int j = 0;

    Conta conta;
    public void cadastrarCliente(String nome, String cpf, String endereco){
        cliente = new Cliente();
        cliente.nome = nome;
        cliente.endereco = endereco;
        cliente.cpf = cpf;
        listaClientes.add(cliente);


    }

    public void cadastrarConta (String numConta, String numAgencia, double saldo, Cliente cliente){
        conta = new Conta();
        conta.numConta = numConta;
        conta.numAgencia = numAgencia;
        conta.saldo = saldo;
        conta.cliente = cliente;
        listaContas.add(conta);
    }

    public String getRelatorioContas(){
        String str = "\n";
        for (Conta c : listaContas) {
            str += c.getRelatorio() + "\n";
        }
        return str;
    }

    public String listarClientes(){
        String str = "\n";
        for (int i = 0; i<listaClientes.size();i++) {
            str += i +"-"+ listaClientes.get(i).nome+"\n";
        }
        return str;
    }
}
