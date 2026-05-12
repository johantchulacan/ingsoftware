public class Personaje {

    private String nombre;
    private int vida;
    private String arma;
    private String habilidad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", arma='" + arma + '\'' +
                ", habilidad='" + habilidad + '\'' +
                '}';
    }
}