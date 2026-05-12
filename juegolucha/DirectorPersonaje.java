public class DirectorPersonaje {

    private PersonajeBuilder builder;

    public void setBuilder(PersonajeBuilder builder) {
        this.builder = builder;
    }

    public Personaje getPersonaje() {
        return builder.getPersonaje();
    }

    public void construirPersonaje() {

        builder.crearNuevoPersonaje();

        builder.buildNombre();
        builder.buildVida();
        builder.buildArma();
        builder.buildHabilidad();
    }
}