package SocioTorcedor;

import java.util.InputMismatchException;
import java.util.Scanner;
import Utilidades.Utilidade;

public class Socio {

    Scanner input = new Scanner(System.in);
    public String nome;
    public String email;
    public String cpf;
    public String numeroTelefone;
    public String endereco;

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

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone() {
        return this.numeroTelefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setDadosSocio() {

        System.out.println("Nome:");
        setNome(input.nextLine());

        System.out.println("E-mail:");
        setEmail(input.nextLine());

        System.out.println("CPF:");
        setCpf(input.nextLine());

        System.out.println("Numero de telofone:");
        setNumeroTelefone(input.nextLine());

        System.out.println("Endereço:");
        setEndereco(input.nextLine());

    }

    public Socio tipoSocio(Socio socio) {

        boolean flagFluxo;

        do {

            flagFluxo = false;

            Utilidade.limparTela();
            System.out.println("Escolha o tipo de sócio:");
            System.out.println("[1] Junior");
            System.out.println("[2] Senior");
            System.out.println("[3] Elite");

            int opcao = 0;

            try {
                opcao = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException error01) {

                input.nextLine();
                System.out.println("Só é possível digitar número inteiro!");
            }

            switch (opcao) {

                case 1:
                    socio = new Junior();
                    break;
                case 2:
                    socio = new Senior();
                    break;
                case 3:
                    socio = new Elite();
                    break;
                default:
                    System.out.println("Escolha uma opção válida, pressione Enter para tentar novamente.");
                    input.nextLine();
                    flagFluxo = true;
            }

        } while (flagFluxo);

        return socio;
    }

    public void getBasicInformacaoSocio() {

        System.out.println("Nome: " + getNome()
                + "Email: " + getEmail()
                + "CPF: " + getCpf()
                + "NumeroTelefone: " + getNumeroTelefone()
                + "Endereco: " + getEndereco());
    }

    public void showAllInformacaoSocio(ConfigurarContribuicao configurarContribuicao) {

    }
}