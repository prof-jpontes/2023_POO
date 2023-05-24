public class Controle {
    Cliente[] clientes = new Cliente[10];
    Conta[] contas = new Conta[10];

    Cliente cliente;
    int i = 0;
    int j = 0;

    Conta conta;
    public void cadastrarCliente(String nome, String cpf, String endereco){
        cliente = new Cliente();
        cliente.nome = nome;
        cliente.endereco = endereco;
        cliente.cpf = cpf;
        clientes[i++] = cliente;


    }

    public void cadastrarConta (String numConta, String numAgencia, double saldo, Cliente cliente){
        conta = new Conta();
        conta.numConta = numConta;
        conta.numAgencia = numAgencia;
        conta.saldo = saldo;
        conta.cliente = cliente;
        contas[j++] = conta;
    }

    public String getRelatorioContas(){
        String str = "\n";
        for (int k = 0; k < j; k++){
            str += contas[k].getRelatorio();
        }
        return str;
    }

    public String listarClientes(){
        String str = "\n";
        for (int k = 0;k < i;k++){
            str += k + clientes[k].nome;
        }
        return str;
    }



}
