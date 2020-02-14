package Recursos;

import java.util.InputMismatchException;
import java.util.Scanner;

import Utilidades.Utilidade;

public class Recurso {

    boolean disponibilidade;
    Scanner input = new Scanner(System.in);

    public Recurso() {
        this.disponibilidade = true;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean getDisponibilidade() {
        return this.disponibilidade;
    }

    public Recurso tipoRecurso() {

        Recurso recurso = null;
        RecursoFactory recursosFactory = null;
        boolean flagFluxo;

        do {

            flagFluxo = false;

            Utilidade.limparTela();
            System.out.println("Choose the type of recurso:");
            System.out.println("[1] Onibus");
            System.out.println("[2] Estadio");
            System.out.println("[3] Centro de Treinamento");

            int opcao = 0;

            try {
                opcao = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException error01) {
                input.nextLine();
                System.out.println("You are not allowed to enter letters, just enter integer!");
            }

            switch (opcao) {


                case 1:
                    recursosFactory = new OnibusFactory();
                    break;
                case 2:
                    recursosFactory = new EstadioFactory();
                    break;
                case 3:
                    recursosFactory = new CentroDeTreinamentoFactory();
                    break;
                default:
                    System.out.println("Escolha uma opção válida, pressione Enter para tentar novamente.");
                    input.nextLine();
                    flagFluxo = true;
            }

        } while (flagFluxo);

        recurso = recursosFactory.createRecursos();

        return recurso;
    }

    public void changeCapacidadeRecurso() {

    }

    public void obterTodosRecursos() {
    }

    public void showBasicInformacaoRecursos() {

        System.out.println("Disponibilidade: " + getDisponibilidade());
    }

    public void showAllInformacoesRecursos() {

    }
}