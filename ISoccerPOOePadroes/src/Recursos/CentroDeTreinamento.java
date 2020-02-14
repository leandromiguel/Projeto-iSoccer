package Recursos;

public class CentroDeTreinamento extends Recurso {

    public String nomeCentroTreinamento;
    public int quartos;

    public void setNomeCentroTreinamento(String nomeCentroTreinamento) {
        this.nomeCentroTreinamento = nomeCentroTreinamento;
    }

    public String getNomeCentroTreinamento() {
        return this.nomeCentroTreinamento;
    }

    public void setTotalQuartos(int Quartos) {
        this.quartos = Quartos;
    }

    public int getTotalQuartos() {
        return this.quartos;
    }

    public void obterTodosRecursos() {

        System.out.println("Quantos dormitórios?");
        setTotalQuartos(input.nextInt());

        input.nextLine();

        System.out.println("Qual é o nome do centro de treinamento?");
        setNomeCentroTreinamento(input.nextLine());
    }

    public void changeCapacidadeRecurso() {

    }

    public void showAllInformacoesRecursos() {

        System.out.println("\nNome centro de treinamento: " + getNomeCentroTreinamento()
                + "\nQuartos: " + getTotalQuartos());

        showBasicInformacaoRecursos();
    }
}