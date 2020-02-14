package SocioTorcedor;

public class Junior extends Socio {

    public double getValorContribuicao(ConfigurarContribuicao configurarContribuicao) {
        return configurarContribuicao.getJuniorContribuicao();
    }

    public void showAllInformacaoSocio(ConfigurarContribuicao configurarContribuicao) {

        getBasicInformacaoSocio();
        System.out.println("Junior contribution amount: " + getValorContribuicao(configurarContribuicao));
    }
}