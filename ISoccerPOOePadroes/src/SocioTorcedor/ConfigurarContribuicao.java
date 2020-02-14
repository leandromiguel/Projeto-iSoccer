package SocioTorcedor;

import java.util.Scanner;

public class ConfigurarContribuicao {

    public Double juniorContribuicao;
    public Double seniorContribuicao;
    public Double eliteContribuicao;
    Scanner input = new Scanner(System.in);

    public void setJuniorContribuicao(Double juniorContribuicao) {
        this.juniorContribuicao = juniorContribuicao;
    }

    public Double getJuniorContribuicao() {
        return this.juniorContribuicao;
    }

    public void setSeniorContribuicao(Double seniorContribuicao) {
        this.seniorContribuicao = seniorContribuicao;
    }

    public Double getSeniorContribution() {
        return this.seniorContribuicao;
    }

    public void setEliteContribuicao(Double eliteContribuicao) {
        this.eliteContribuicao = eliteContribuicao;
    }

    public Double getContribuicaoElite() {
        return this.eliteContribuicao;
    }

    public void setConfigurarContribuicao() {

        System.out.println("Qual é a contribuição do tipo junior?");
        setJuniorContribuicao(input.nextDouble());

        System.out.println("Qual é a contribuição do tipo senior?");
        setSeniorContribuicao(input.nextDouble());

        System.out.println("Qual é a contribuição do tipo elite?");
        setEliteContribuicao(input.nextDouble());
    }
}