package Recursos;

public class OnibusFactory implements RecursoFactory {

    @Override
    public Recurso createRecursos() {
        return new Onibus();
    }
}