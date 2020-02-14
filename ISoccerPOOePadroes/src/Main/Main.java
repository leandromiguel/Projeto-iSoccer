package Main;

import SocioTorcedor.ConfigurarContribuicao;
import Menu.Iniciar;

public class Main {

    public static void main(String[] args) {

        Administrador adm = new Administrador();
        adm.criarConta();
        ConfigurarContribuicao configurarContribuicao = new ConfigurarContribuicao();

        Iniciar start = new Iniciar();
        start.startMenu(adm, configurarContribuicao);

    }

}