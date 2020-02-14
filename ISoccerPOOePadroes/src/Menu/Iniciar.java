package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import SocioTorcedor.ConfigurarContribuicao;
import Main.Administrador;
import Utilidades.Utilidade;

public class Iniciar {

    static Scanner input = new Scanner(System.in);

    public void startMenu(Administrador adm, ConfigurarContribuicao configurarContribuicao) {

        boolean flagFluxo = false;
        boolean flagTeste = true;

        do {

            Utilidade.limparTela();
            System.out.println("-----------------------");
            System.out.println("#       ISoccer       #");
            System.out.println("-----------------------");
            System.out.println("[1] - Inscrever-se");
            System.out.println("[2] - Sair");
            System.out.println("--------------------------");
            System.out.println("=> Escolha uma opção: ");

            do {

                try {

                    int opcao = input.nextInt();
                    input.nextLine();
                    flagFluxo = startDecisao(opcao, adm, configurarContribuicao);
                    flagTeste = false;

                } catch (InputMismatchException erro1) {

                    input.nextLine();
                    System.err.println("Só é permitido digitar número inteiro! Tente novamente:");

                }

            } while (flagTeste);

        } while (flagFluxo);
    }

    public boolean startDecisao(int opcao, Administrador adm, ConfigurarContribuicao configurarContribuicao) {

        switch (opcao) {

            case 1:
                if (adm.verificarConta()) {
                    MenuSistema menuSistema = new MenuSistema();
                    menuSistema.menuSistemaTela(configurarContribuicao);
                }
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Escolha uma opcão válida! Pressione Enter para tentar novamente.");
                input.nextLine();
        }

        return true;
    }
}