package Dados;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Utilidades.Utilidade;
import Funcionarios.Funcionario;
import Funcionarios.Jogador;
import Funcionarios.Tecnico;
import SocioTorcedor.ConfigurarContribuicao;
import SocioTorcedor.Socio;
import Recursos.Onibus;
import Recursos.Recurso;
import Recursos.Estadio;
import Recursos.CentroDeTreinamento;


public class DadosSingleton {

    private static DadosSingleton Dados = null;

    public ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    public ArrayList<Socio> socios = new ArrayList<Socio>();
    public ArrayList<Recurso> recursos = new ArrayList<Recurso>();
    public Scanner input = new Scanner(System.in);

    public static DadosSingleton getInstance() {

        if (Dados == null) {
            Dados = new DadosSingleton();
        }

        return Dados;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public int getNumeroFuncionario() {
        return this.funcionarios.size();
    }

    public void addSocio(Socio socio) {
        this.socios.add(socio);
    }

    public int getNumeroSocio() {
        return this.socios.size();
    }

    public void changeDisponibilidadeJogador() {

        System.out.println("Qual é o cpf do jogador?");
        String cpf = input.nextLine();

        for (Funcionario funcionario : funcionarios) {

            if (funcionario.getCpf().equals(cpf)) {

                funcionario.setAvailable(Utilidade.chooseDisponibilidade());

            }
        }

    }

    public Recurso buscareObterRecursos() {

        boolean flagFluxo;

        do {

            flagFluxo = false;
            String identificar;

            Utilidade.limparTela();
            System.out.println("Escolha o tipo de recurso:");
            System.out.println("[1] Onibus");
            System.out.println("[2] Estadio");
            System.out.println("[3] Centro de Treinamento");

            int opcao = 0;

            try {
                opcao = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException error01) {
                input.nextLine();
                System.out.println("Só é permitido digitar número inteiro!");
            }

            switch (opcao) {

                case 1:
                    System.out.println("Qual é a placa do carro?");
                    identificar = input.nextLine();
                    for (Recurso recurso : recursos) {
                        if (recurso instanceof Onibus && ((Onibus) recurso).getPlacaCarro().equals(identificar)) {
                            return recurso;
                        }
                    }
                    System.out.println("\nNão temos esse ônibus, pressione enter para retornar ao menu");
                    input.nextLine();
                    break;
                case 2:
                    System.out.println("Qual é o nome do estádio?");
                    identificar = input.nextLine();
                    for (Recurso recurso : recursos) {
                        if (recurso instanceof Estadio && ((Estadio) recurso).getNomeEstadio().equals(identificar)) {
                            recurso.setDisponibilidade(Utilidade.chooseDisponibilidade());
                            return recurso;
                        }
                    }
                    System.out.println("\nNão temos este estádio, pressione enter para retornar ao menu");
                    input.nextLine();
                    break;
                case 3:
                    System.out.println("Qual é o nome do Centro de Treinamento?");
                    identificar = input.nextLine();
                    for (Recurso recurso : recursos) {
                        if (recurso instanceof CentroDeTreinamento && ((CentroDeTreinamento) recurso).getNomeCentroTreinamento().equals(identificar)) {
                            recurso.setDisponibilidade(Utilidade.chooseDisponibilidade());
                            return recurso;
                        }
                    }
                    System.out.println("\nNão temos este centro de treinamento, pressione enter para retornar ao menu");
                    input.nextLine();
                    break;
                default:
                    System.out.println("Escolha uma opção válida, pressione Enter para tentar novamente.");
                    input.nextLine();
                    flagFluxo = true;
            }

        } while (flagFluxo);

        return null;
    }

    public void adicionarRecursos(Recurso recurso) {
        this.recursos.add(recurso);
    }

    public void reportMembrosTime() {

        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Tecnico) {
                funcionario.showDadosFuncionario();
            }
        }

        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Jogador) {
                funcionario.showDadosFuncionario();
            }
        }

        Utilidade.pausaMenu();
    }

    public void reportDisponibilidadeJogador() {

        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Jogador) {
                System.out.println("\nNome: " + funcionario.getNome()
                        + "\nTipo de jogador: " + ((Jogador) funcionario).getTipoJogador()
                        + "\nDisponibilidade: " + ((Jogador) funcionario).getDisponibilidade());

            }
        }

        Utilidade.pausaMenu();
    }

    public void reportFuncionario() {

        for (Funcionario funcionario : funcionarios) {
            funcionario.showDadosFuncionario();
        }

        if (funcionarios.size() == 0) {
            System.out.println("No Workers");
        }

        Utilidade.pausaMenu();
    }

    public void reportCentroTreinamentoEstadio() {

        for (Recurso recurso : recursos) {
            if (recurso instanceof Estadio || recurso instanceof CentroDeTreinamento) {
                recurso.showAllInformacoesRecursos();
            }
        }

        Utilidade.pausaMenu();
    }

    public void reportTransporte() {

        for (Recurso recurso : recursos) {
            if (recurso instanceof Onibus) {
                recurso.showAllInformacoesRecursos();
            }
        }

        Utilidade.pausaMenu();
    }

    public void reportSocios(ConfigurarContribuicao configurarContribuicao) {

        System.out.println("Tem" + socios.size() + "socios");

        for (Socio socio : socios) {
            socio.showAllInformacaoSocio(configurarContribuicao);
        }

        Utilidade.pausaMenu();
    }
}