package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import Dados.DadosSingleton;
import Funcionarios.Funcionario;
import SocioTorcedor.ConfigurarContribuicao;
import SocioTorcedor.Socio;
import Utilidades.Utilidade;

public class MenuSistema {

    Scanner input = new Scanner(System.in);

    public void menuSistemaTela(ConfigurarContribuicao configurarContribuicao) {

        boolean flagFluxo = true;
        boolean flagTeste = true;

        do {
            Utilidade.limparTela();
            System.out.println("-----------------------");
            System.out.println("#       ISoccer       #");
            System.out.println("-----------------------");
            System.out.println("[1] - Adicionar funcionário");
            System.out.println("[2] - Adicionar sócio");
            System.out.println("[3] - Definir configuração de contribuição");
            System.out.println("[4] - Alterar a disponibilidade do jogador");
            System.out.println("[5] - Acessar menu de relatórios");
            System.out.println("[6] - Acessar menu de recursos");
            System.out.println("[7] - Sair");
            System.out.println("-----------------------");
            System.out.println("=> Escolha uma opcao: ");


            do {

                try {

                    int opcao = input.nextInt();
                    flagFluxo = menuSistemaDecisao(opcao, configurarContribuicao);
                    input.nextLine();
                    flagTeste = false;

                } catch (InputMismatchException erro1) {

                    input.nextLine();
                    System.err.println("Só é permitido digitar número inteiro! Tente novamente:");
                }

            } while (flagTeste);

        } while (flagFluxo);
    }

    public boolean menuSistemaDecisao(int opcao, ConfigurarContribuicao configurarContribuicao) {

        DadosSingleton Dados = DadosSingleton.getInstance();

        switch (opcao) {

            case 1:
                Funcionario funcionario = new Funcionario();
                funcionario = funcionario.tipoFuncionario();
                funcionario.obterFuncionarios();
                Dados.addFuncionario(funcionario);
                break;
            case 2:
                if (Dados.getNumeroSocio() == 0) {
                    Utilidade.limparTela();
                    System.out.println("Esta informação é necessária:");
                    configurarContribuicao.setConfigurarContribuicao();
                }

                Socio socio = new Socio();
                socio = socio.tipoSocio(socio);
                socio.setDadosSocio();
                Dados.addSocio(socio);
                break;
            case 3:
                configurarContribuicao.setConfigurarContribuicao();
                break;
            case 4:
                Dados.changeDisponibilidadeJogador();
                break;
            case 5:
                MenuRelatorio reportMenu = new MenuRelatorio();
                reportMenu.menuRelatorioTela(configurarContribuicao);
                break;
            case 6:
                MenuRecursos menuRecursos = new MenuRecursos();
                menuRecursos.menuRelatorioTela();
                break;
            case 7:
                return false;
            default:
                System.out.println("\nEscolha uma opção válida, pressione Enter para tentar novamente.");
                input.nextLine();
        }
        return true;
    }
}