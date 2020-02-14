package Recursos;

public class CentroDeTreinamentoFactory implements RecursoFactory {

    @Override
    public Recurso createRecursos() {
        return new CentroDeTreinamento();
    }
}