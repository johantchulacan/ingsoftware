public class Main {

    public static void main(String[] args) {

        // Crear director
        DirectorPersonaje director = new DirectorPersonaje();

        // Crear builder para guerrero
        PersonajeBuilder guerreroBuilder =
                new GuerreroBuilder();

        // Construcción del guerrero
        director.setBuilder(guerreroBuilder);
        director.construirPersonaje();

        Personaje guerrero = director.getPersonaje();

        // Mostrar guerrero
        System.out.println("=== PERSONAJE 1 ===");
        System.out.println(guerrero);

        System.out.println();

        // Crear builder para mago
        PersonajeBuilder magoBuilder =
                new MagoBuilder();

        // Construcción del mago
        director.setBuilder(magoBuilder);
        director.construirPersonaje();

        Personaje mago = director.getPersonaje();

        // Mostrar mago
        System.out.println("=== PERSONAJE 2 ===");
        System.out.println(mago);

        System.out.println();

        // Crear juego
        JuegoLucha juego =
                new JuegoLucha(guerrero, mago);

        // Iniciar pelea
        juego.iniciarPelea();
    }
}