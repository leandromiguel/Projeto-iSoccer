package Funcionarios;

public class Motorista extends Funcionario {

    public String numeroInscricao;

    public void setNumeroInscricao(String numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public String getNumeroInscricao() {
        return this.numeroInscricao;
    }

    public void obterFuncionarios() {

        setDadosFuncionario();

        System.out.println("numeroInscricao:");
        setNumeroInscricao(input.nextLine());
    }

    public void showDadosFuncionario() {

        System.out.print("Motorista");
        System.out.println("Numero de Inscrição: " + getNumeroInscricao());
        showInformacoesBasicas();
    }
}