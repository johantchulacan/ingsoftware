public class MagoBuilder extends PersonajeBuilder {

    
    public void buildNombre() {
        personaje.setNombre("Mago");
    }

    
    public void buildVida() {
        personaje.setVida(100);
    }

    
    public void buildArma() {
        personaje.setArma("Bastón Mágico");
    }

    
    public void buildHabilidad() {
        personaje.setHabilidad("Bola de Fuego");
    }
}