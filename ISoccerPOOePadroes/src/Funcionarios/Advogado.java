package Funcionarios;

public class Advogado extends Funcionario {

    public void obterFuncionarios() {

        setDadosFuncionario();
    }

    public void showDadosFuncionario() {

        System.out.print("Advogado");
        showInformacoesBasicas();
    }
}