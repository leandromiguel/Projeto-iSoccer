package Recursos;

public class Onibus extends Recurso {

    public int totalCadeiras;
    public String placaCarro;

    public void setTotalCadeiras(int totalCadeiras) {
        this.totalCadeiras = totalCadeiras;
    }

    public int getTotalCadeiras() {
        return this.totalCadeiras;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getPlacaCarro() {
        return this.placaCarro;
    }

    public void obterTodosRecursos() {

        System.out.println("Quantos assentos?");
        setTotalCadeiras(input.nextInt());

        input.nextLine();

        System.out.println("Qual é a placa do carro?");
        setPlacaCarro(input.nextLine());
    }

    public void changeCapacidadeRecurso() {

        System.out.println("Qual é o novo número de assentos?");
        setTotalCadeiras(input.nextInt());
    }

    public void showAllInformacoesRecursos() {

        System.out.println("\nPlaca do carro: " + getPlacaCarro()
                + "\nCadeira: " + getTotalCadeiras());

        showBasicInformacaoRecursos();
    }
}