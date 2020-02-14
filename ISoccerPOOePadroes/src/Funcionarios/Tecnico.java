package Funcionarios;

public class Tecnico extends Funcionario {

    public void obterFuncionarios() {

        setDadosFuncionario();
    }

    public void showDadosFuncionario() {

        System.out.print("Tecnico:");
        showInformacoesBasicas();
    }
}