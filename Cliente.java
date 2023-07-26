public class Cliente {
    public String nome;

    public String cpf;

    public String endereco;

    public Cliente(String nome, String cpf){

        this.nome = nome;
        this.cpf = cpf;

    }
    public String getRelatorio(){
        String str = "\n";
        str += "Nome: "+this.nome;
        str += "\nCPF: "+this.cpf;
        str += "\nEndereco: "+this.endereco;
        return str;
    }
}
