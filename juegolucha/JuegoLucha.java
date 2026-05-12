public class JuegoLucha {

    private Personaje jugador1;
    private Personaje jugador2;

    public JuegoLucha(Personaje jugador1,
                       Personaje jugador2) {

        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void iniciarPelea() {

        System.out.println("La pelea comienza");
    }

    public void turno() {

        System.out.println("Turno de ataque");
    }
}