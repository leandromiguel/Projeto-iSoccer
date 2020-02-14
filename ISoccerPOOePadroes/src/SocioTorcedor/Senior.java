package SocioTorcedor;

public class Senior extends Socio {

    public double getValorContribuicao(ConfigurarContribuicao configurarContribuicao) {
        return configurarContribuicao.getSeniorContribution();
    }

    public void showAllInformacaoSocio(ConfigurarContribuicao configurarContribuicao) {

        getBasicInformacaoSocio();
        System.out.println("Valor da contribuição sênior: " + getValorContribuicao(configurarContribuicao));
    }
}