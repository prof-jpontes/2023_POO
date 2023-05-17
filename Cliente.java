public class Cliente {
    public String nome;

    public String cpf;

    public String endereco;

    public String getRelatorio(){
        String str = "\n";
        str += "Nome: "+this.nome;
        str += "\nCPF: "+this.cpf;
        str += "\nEndereco: "+this.endereco;
        return str;
    }
}
