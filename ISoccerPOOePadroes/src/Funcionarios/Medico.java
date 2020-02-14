package Funcionarios;

public class Medico extends Funcionario {

    public String crm;

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return this.crm;
    }

    public void obterFuncionarios() {

        setDadosFuncionario();

        System.out.println("CRM:");
        setCrm(input.nextLine());
    }

    public void showDadosFuncionario() {

        System.out.print("Medico");
        System.out.println("CRM: " + getCrm());
        showInformacoesBasicas();
    }
}