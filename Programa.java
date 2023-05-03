public class Programa {
    public static void main(String[] args) {
        Conta cezar = new Conta();
        cezar.numAgencia = "11777";
        cezar.numConta = "00001";
        cezar.nomePessoa = "Cezar";
        cezar.saldo = 1000;

        System.out.println(cezar.getRealatorio());

        if (cezar.sacar(500)){
            System.out.println("Saque realizado!");
        }else{
            System.out.println("Saque não realizado!");
        }

        System.out.println("\nRelatório após saque: "+cezar.getRealatorio());

        cezar.depositar(300);

        System.out.println("\nRelatório após depósito: "+cezar.getRealatorio());

        Conta elen = new Conta();
        elen.numAgencia = "11777";
        elen.numConta = "00012";
        elen.nomePessoa = "Elen";
        elen.saldo = 2109;

        cezar.transferir(1000,elen);

        System.out.println("\nRelatório após tranferência: "+cezar.getRealatorio()+elen.getRealatorio());
    }
}
