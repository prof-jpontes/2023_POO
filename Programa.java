public class Programa {
    public static void main(String[] args) {
        Cliente cezar = new Cliente();
        cezar.nome = "Cezar";
        cezar.cpf = "777.777.777-77";
        cezar.endereco = "Rua Poo";


        Conta contaCezar = new Conta();
        contaCezar.cliente = cezar;
        contaCezar.numAgencia = "11777";
        contaCezar.numConta = "00001";
        contaCezar.saldo = 1000;

        System.out.println(contaCezar.getRealatorio());

        if (contaCezar.sacar(500)){
            System.out.println("Saque realizado!");
        }else{
            System.out.println("Saque não realizado!");
        }

        System.out.println("\nRelatório após saque: "+contaCezar.getRealatorio());

        contaCezar.depositar(300);

        System.out.println("\nRelatório após depósito: "+contaCezar.getRealatorio());

        Conta contaElen = new Conta();
        contaElen.numAgencia = "11777";
        contaElen.numConta = "00012";
        contaElen.saldo = 2109;

        contaCezar.transferir(100,contaElen);

        //System.out.println("\nRelatório após tranferência: "+contaCezar.getRealatorio()+contaElen.getRealatorio());
    }
}
