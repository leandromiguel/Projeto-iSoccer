package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import Dados.DadosSingleton;
import SocioTorcedor.ConfigurarContribuicao;
import Utilidades.Utilidade;

public class MenuRelatorio {

    Scanner input = new Scanner(System.in);

    public void menuRelatorioTela(ConfigurarContribuicao configurarContribuicao) {

        boolean flagFluxo = true;
        boolean flagTeste = true;

        do {
            Utilidade.limparTela();
            System.out.println("-----------------------------------");
            System.out.println("#   ISoccer - Menu de Relatório   #");
            System.out.println("-----------------------------------");
            System.out.println("[1] - Relatório dos membros da equipe");
            System.out.println("[2] - Relatório de disponibilidade do jogador");
            System.out.println("[3] - Relatório de todos os funcionários");
            System.out.println("[4] - Relatório do estádio e do centro de treinamento");
            System.out.println("[5] - Relatório de Transporte");
            System.out.println("[6] - Relatório de todos os sócios");
            System.out.println("[7] - Sair");
            System.out.println("--------------------------");
            System.out.println("=> Escolha uma opcao: ");

            do {

                try {

                    int opcao = input.nextInt();
                    input.nextLine();
                    flagFluxo = reportMenuDecisao(opcao, configurarContribuicao);
                    flagTeste = false;

                } catch (InputMismatchException erro1) {

                    input.nextLine();
                    System.err.println("Só é permitido digitar número inteiro! Tente novamente:");
                }

            } while (flagTeste);

        } while (flagFluxo);
    }

    public boolean reportMenuDecisao(int opcao, ConfigurarContribuicao configurarContribuicao) {

        DadosSingleton Dados = DadosSingleton.getInstance();

        switch (opcao) {

            case 1:
                Dados.reportMembrosTime();
                break;
            case 2:
                Dados.reportDisponibilidadeJogador();
                break;
            case 3:
                Dados.reportFuncionario();
                break;
            case 4:
                Dados.reportCentroTreinamentoEstadio();
                break;
            case 5:
                Dados.reportTransporte();
                break;
            case 6:
                Dados.reportSocios(configurarContribuicao);
                break;
            case 7:
                return false;
            default:
                System.out.println("Escolha uma opção válida, pressione qualquer tecla para tentar novamente.");
                input.nextLine();
        }
        return true;
    }
}