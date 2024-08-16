
import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------- Desafio Controle de fluxo - DIO -----------------");
        System.out.println("Digite dois valores para saber o número de interações entre eles.");
        System.out.println("Informe o 1º valor: ");

        int paramentro1 = valorInteiro(sc);

        System.out.println("Informe o 2º valor: ");
        int paramentro2 = valorInteiro(sc);

        try {
            contador(paramentro1, paramentro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void contador(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int diferenca = parametroDois - parametroUm;
            for (int i = 1; i <= diferenca; ++i) {
                System.out.println("Imprimindo a " + i + "ª interação: " + i);
            }
        }
    }

    public static int valorInteiro(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("OPS!! Encontramos um erro. Por Favor,  digite um número inteiro:");
            }
        }

	}

}
