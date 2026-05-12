public abstract class PersonajeBuilder {

    protected Personaje personaje;

    public Personaje getPersonaje() {
        return personaje;
    }

    public void crearNuevoPersonaje() {
        personaje = new Personaje();
    }

    public abstract void buildNombre();

    public abstract void buildVida();

    public abstract void buildArma();

    public abstract void buildHabilidad();
}