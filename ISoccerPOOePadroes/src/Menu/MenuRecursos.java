package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import Dados.DadosSingleton;
import Recursos.Recurso;
import Utilidades.Utilidade;

public class MenuRecursos {

    Scanner input = new Scanner(System.in);

    public void menuRelatorioTela() {

        boolean flagFluxo = true;
        boolean flagTeste = true;

        do {
            Utilidade.limparTela();
            System.out.println("----------------------------------");
            System.out.println("#   ISoccer - Menu de Recursos   #");
            System.out.println("----------------------------------");
            System.out.println("[1] - Adicionar recursos");
            System.out.println("[2] - Verificar disponibilidade de recursos");
            System.out.println("[3] - Alterar capacidade de recursos");
            System.out.println("[4] - Sair");
            System.out.println("----------------------------------");
            System.out.println("=> Escolah uma opção: ");

            do {

                try {

                    int opcao = input.nextInt();
                    input.nextLine();
                    flagFluxo = decisaoMenuRecursos(opcao);
                    flagTeste = false;

                } catch (InputMismatchException erro1) {

                    input.nextLine();
                    System.err.println("Só e permitido entrada de número inteiro! Tente novamente:");
                }
            } while (flagTeste);

        } while (flagFluxo);
    }

    public boolean decisaoMenuRecursos(int opcao) {

        Recurso recurso = new Recurso();
        DadosSingleton Dados = DadosSingleton.getInstance();

        switch (opcao) {

            case 1:
                recurso = recurso.tipoRecurso();
                recurso.obterTodosRecursos();
                Dados.adicionarRecursos(recurso);
                break;
            case 2:
                recurso = Dados.buscareObterRecursos();
                if (recurso != null) {
                    recurso.setDisponibilidade(Utilidade.chooseDisponibilidade());
                }
                break;
            case 3:
                recurso = Dados.buscareObterRecursos();
                if (recurso != null) {
                    recurso.changeCapacidadeRecurso();
                }
                break;
            case 4:
                return false;
            default:
                System.out.println("\nEscolha uma opção válida, pressione qualquer tecla para tentar novamente.");
                input.nextLine();
        }
        return true;
    }
}