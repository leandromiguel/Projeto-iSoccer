package Funcionarios;

public class Cozinheiro extends Funcionario {

    public void obterFuncionarios() {

        setDadosFuncionario();
    }

    public void showDadosFuncionario() {

        System.out.print("Cozinheiro");
        showInformacoesBasicas();
    }
}