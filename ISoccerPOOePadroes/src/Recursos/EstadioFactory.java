package Recursos;

public class EstadioFactory implements RecursoFactory {

    @Override
    public Recurso createRecursos() {
        return new Estadio();
    }
}