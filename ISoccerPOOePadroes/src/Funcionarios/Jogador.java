package Funcionarios;

import java.util.InputMismatchException;

import Utilidades.Utilidade;

public class Jogador extends Funcionario {

    public String tipoJogador;
    public boolean disponibilidade;

    public void setTipoJogador(String tipoJogador) {
        this.tipoJogador = tipoJogador;
    }

    public String getTipoJogador() {
        return this.tipoJogador;
    }

    public void setDisponibilidade(boolean disponivel) {
        this.disponibilidade = disponivel;
    }

    public boolean getDisponibilidade() {
        return this.disponibilidade;
    }

    public String chooseTipoJogador() {

        boolean flagFluxo;
        String tipoJogador = null;

        do {

            flagFluxo = false;

            Utilidade.limparTela();
            System.out.println("Escolha o tipo de jogador:");
            System.out.println("[1] Volante");
            System.out.println("[2] Zagueiro");
            System.out.println("[3] Meia");
            System.out.println("[4] Goleiro");
            System.out.println("[5] Atacante");
            System.out.println("[6] Lateral direito");
            System.out.println("[7] Lateral esquerdo");

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
                    tipoJogador = "Volante";
                    break;
                case 2:
                    tipoJogador = "Zagueiro";
                    break;
                case 3:
                    tipoJogador = "Meia";
                    break;
                case 4:
                    tipoJogador = "Goleiro";
                    break;
                case 5:
                    tipoJogador = "Atacante";
                    break;
                case 6:
                    tipoJogador = "Lateral direito";
                    break;
                case 7:
                    tipoJogador = "Lateral esquerdo";
                    break;
                default:
                    System.out.println("Escolha uma opção válida, pressione qualquer tecla para tentar novamente.");
                    input.nextLine();
                    flagFluxo = true;
            }

        } while (flagFluxo);

        return tipoJogador;
    }

    public void showDadosFuncionario() {


        System.out.print("\nTipo de jogador: " + getTipoJogador()
                + "\nDisponibilidade: " + getDisponibilidade());
        showInformacoesBasicas();
    }

    public void obterFuncionarios() {

        setDadosFuncionario();
        setTipoJogador(chooseTipoJogador());
    }
}