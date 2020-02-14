package Utilidades;

import java.util.Scanner;

public class Utilidade {

    static Scanner input = new Scanner(System.in);

    public static void limparTela() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
    }

    public static boolean chooseDisponibilidade() {

        boolean flagFluxo;
        boolean disponivel = false;

        do {

            flagFluxo = false;

            System.out.println("Escolha uma opção:");
            System.out.println("[1] Disponível");
            System.out.println("[2] Indisponível");

            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {

                case 1:
                    disponivel = true;
                    break;
                case 2:
                    disponivel = false;
                    break;
                default:
                    System.out.println("Escolha uma opção válida, pressione qualquer tecla para tentar novamente.");
                    input.nextLine();
                    flagFluxo = true;
            }

        } while (flagFluxo);

        return disponivel;
    }

    public boolean simOuNao() {

        System.out.println("[1] SIM");
        System.out.println("[2] NAO");
        System.out.println("=> Escolha uma opção: ");

        int opcao = input.nextInt();

        if (opcao == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void pausaMenu() {

        System.out.println("\nPressione qualquer tecla para retornar ao menu");
        input.nextLine();
    }
}