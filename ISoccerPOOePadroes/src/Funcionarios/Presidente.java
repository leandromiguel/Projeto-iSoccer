package Funcionarios;

public class Presidente extends Funcionario {

    public void obterFuncionarios() {

        setDadosFuncionario();
    }

    public void showDadosFuncionario() {

        System.out.print("Presidente");
        showInformacoesBasicas();
    }
}