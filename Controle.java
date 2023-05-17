public class Controle {
    Cliente[] clientes = new Cliente[10];
    Conta[] contas = new Conta[10];

    Cliente cliente;
    int i = 0;
    public void cadastrarCliente(String nome, String cpf, String endereco){
        cliente = new Cliente();
        cliente.nome = nome;
        cliente.endereco = endereco;
        cliente.cpf = cpf;
        clientes[i++] = cliente;

        


    }
}
