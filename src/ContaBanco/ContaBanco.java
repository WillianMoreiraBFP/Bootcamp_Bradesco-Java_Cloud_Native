package ContaBanco;

import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Número da Agência:");
        String agencia = scanner.nextLine();
        System.out.println("Número da conta:");
        int numero = scanner.nextInt();
        System.out.println("Saldo da conta:");
        double saldo = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nome, saldo);

        System.out.println(conta.printNome());

    }
}