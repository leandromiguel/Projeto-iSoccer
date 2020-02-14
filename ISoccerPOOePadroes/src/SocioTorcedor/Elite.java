package SocioTorcedor;

public class Elite extends Socio {

    public double getValorContribuicao(ConfigurarContribuicao configurarContribuicao) {
        return configurarContribuicao.getContribuicaoElite();
    }

    public void showAllInformacaoSocio(ConfigurarContribuicao configurarContribuicao) {

        getBasicInformacaoSocio();
        System.out.println("Valor da contribuição Elite: " + getValorContribuicao(configurarContribuicao));
    }
}