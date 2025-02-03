package ControledeFluxo;

import java.util.Scanner;


class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);  // Passa a mensagem para a classe pai (Exception)
    }
}
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("Erro: " + exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else{
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i < contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}