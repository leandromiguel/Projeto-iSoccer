package Funcionarios;

import java.util.InputMismatchException;
import java.util.Scanner;

import Utilidades.Utilidade;

public class Funcionario {

    Scanner input = new Scanner(System.in);
    public String nome;
    public String email;
    public String cpf;
    public double salario;
    public String numeroTelefone;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone() {
        return this.numeroTelefone;
    }

    public void showInformacoesBasicas() {

        System.out.println("\nNome: " + getNome()
                + "\nEmail: " + getEmail()
                + "\nCPF: " + getCpf()
                + "\nSalario: " + getSalario()
                + "\nNumero de Telefone: " + getNumeroTelefone());
    }

    public Funcionario tipoFuncionario() {

        Funcionario funcionario = null;
        boolean flagFluxo;

        do {

            flagFluxo = false;

            Utilidade.limparTela();
            System.out.println("Escolha o tipo de funcionário:");
            System.out.println("[1] Cozinheiro");
            System.out.println("[2] Medico");
            System.out.println("[3] Motorista");
            System.out.println("[4] Advogado");
            System.out.println("[5] PreparadorFisico");
            System.out.println("[6] Jogador");
            System.out.println("[7] Presidente");
            System.out.println("[8] Tecnico");

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
                    funcionario = new Cozinheiro();
                    break;
                case 2:
                    funcionario = new Medico();
                    break;
                case 3:
                    funcionario = new Motorista();
                    break;
                case 4:
                    funcionario = new Advogado();
                    break;
                case 5:
                    funcionario = new PreparadorFisico();
                    break;
                case 6:
                    funcionario = new Jogador();
                    break;
                case 7:
                    funcionario = new Presidente();
                    break;
                case 8:
                    funcionario = new Tecnico();
                    break;
                default:
                    System.out.println("Escolha uma opção válida, pressione Enter para tentar novamente.");
                    input.nextLine();
                    flagFluxo = true;
            }

        } while (flagFluxo);

        return funcionario;
    }

    public void setDadosFuncionario() {

        boolean flagTeste = true;

        System.out.println("Nome:");
        setNome(input.nextLine());

        System.out.println("E-mail:");
        setEmail(input.nextLine());

        System.out.println("CPF:");
        setCpf(input.nextLine());

        do {
            try {
                System.out.println("Salario:");
                setSalario(input.nextDouble());
                input.nextLine();
                flagTeste = false;
            } catch (InputMismatchException error01) {
                input.nextLine();
                System.out.println("Não é permitido digitar letras");
            }
        } while (flagTeste);

        System.out.println("Número de Telefone:");
        setNumeroTelefone(input.nextLine());
    }

    public void obterFuncionarios() {
    }

    public void setAvailable(boolean disponivel) {
    }

    public void showDadosFuncionario() {
    }
}