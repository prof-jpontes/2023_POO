import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println(getMenu());
        int opcao = Integer.parseInt(ler.nextLine());
        Controle controle = new Controle();
        while(opcao!=0){
            switch (opcao){
                case 1:
                    controle.cadastrarCliente(ler.nextLine(),ler.nextLine(),ler.nextLine());
                    break;
                case 2:
                    String numConta = ler.nextLine();
                    String numAgencia = ler.nextLine();
                    double saldo = Double.parseDouble(ler.nextLine());
                    System.out.println(controle.listarClientes());
                    int id = Integer.parseInt(ler.nextLine());

                    controle.cadastrarConta(numConta,numAgencia,saldo,controle.listaClientes.get(id));
                    break;
                case 3:
                    System.out.printf(controle.getRelatorioContas());
                    break;
                case 0:
                    System.out.println("Voce escolheu sair do sistema :(");
                    break;
                default:
                    System.out.println("opcao invalida");
                    break;
            }
            System.out.println(getMenu());
            opcao = Integer.parseInt(ler.nextLine());
        }

        ler.close();
    }
    public static String getMenu(){
        String str = "\nOpções: ";
        str += "\n1-Cadastrar Cliente";
        str += "\n2-Cadastrar Conta";
        str += "\n3-Emitir relatório de Contas";
        str += "\n0-Sair";
        return str;
    }
}

