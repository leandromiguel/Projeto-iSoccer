package Funcionarios;

public class PreparadorFisico extends Funcionario {

    public void obterFuncionarios() {

        setDadosFuncionario();
    }

    public void showDadosFuncionario() {

        System.out.print("PreparadorFisico");
        showInformacoesBasicas();
    }
}