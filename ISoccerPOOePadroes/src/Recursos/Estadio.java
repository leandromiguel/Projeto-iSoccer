package Recursos;

public class Estadio extends Recurso {

    public int capacidadeSocio;
    public int totalLanchonete;
    public int totalBanheiro;
    public String nomeEstadio;

    public void setNomeEstadio(String nomeEstadio) {
        this.nomeEstadio = nomeEstadio;
    }

    public String getNomeEstadio() {
        return this.nomeEstadio;
    }

    public void setCapacidadeSocio(int capacidadeSocio) {
        this.capacidadeSocio = capacidadeSocio;
    }

    public int getCapacidadeSocio() {
        return this.capacidadeSocio;
    }

    public void setTotalLanchonete(int totalLanchonete) {
        this.totalLanchonete = totalLanchonete;
    }

    public int getTotalLanchonete() {
        return this.totalLanchonete;
    }

    public void setTotalBanheiro(int totalBanheiro) {
        this.totalBanheiro = totalBanheiro;
    }

    public int getTotalBanheiro() {
        return this.totalBanheiro;
    }

    public void obterTodosRecursos() {

        System.out.println("Qual é a capacidade dos sócios?");
        setCapacidadeSocio(input.nextInt());

        System.out.println("Quantas lanchonetes?");
        setTotalLanchonete(input.nextInt());

        System.out.println("Quantos banheiros?");
        setTotalBanheiro(input.nextInt());

        input.nextLine();

        System.out.println("Qual é o nome do estádio?");
        setNomeEstadio(input.nextLine());
    }

    public void changeCapacidadeRecurso() {

        System.out.println("Qual é o novo número de capacidade de sócios?");
        setCapacidadeSocio(input.nextInt());

        System.out.println("Qual é o novo número capacidade de lanchonetes?");
        setTotalLanchonete(input.nextInt());

        System.out.println("Qual é o novo número de capacidade de banheiros?");
        setTotalBanheiro(input.nextInt());
    }

    public void showAllInformacoesRecursos() {

        System.out.println("\nNome estádio: " + getNomeEstadio()
                + "\nCapacidade sócio:" + getCapacidadeSocio()
                + "\nTotal lanchonete: " + getTotalLanchonete()
                + "\nTotal banheiro: " + getTotalBanheiro());

        showBasicInformacaoRecursos();
    }
}