public class GuerreroBuilder extends PersonajeBuilder {

    
    public void buildNombre() {
        personaje.setNombre("Guerrero");
    }

    
    public void buildVida() {
        personaje.setVida(150);
    }

    
    public void buildArma() {
        personaje.setArma("Espada");
    }

    
    public void buildHabilidad() {
        personaje.setHabilidad("Ataque Pesado");
    }
}