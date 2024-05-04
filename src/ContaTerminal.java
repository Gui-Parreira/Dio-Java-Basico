import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta Bancária: (Ex: 1021)");
        numero = leitura.nextInt();

        leitura.nextLine();

        System.out.println("Por favor, digite a número da Agência: (Ex: 067-8)");
        agencia = leitura.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente: (Ex: Joao Gabriel)");
        nomeCliente = leitura.nextLine();

        System.out.println("Por favor, digite o Saldo da Conta Bancária: (Ex: 100,00)");
        saldo = leitura.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
                " já está disponível para saque !");
    }
}