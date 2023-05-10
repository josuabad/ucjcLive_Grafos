public class Main {

    public static void main(String[] args) {

        // El grafo que vamos a representar esta formado por las relaciones que tienen unas personas que usan una red social
        // Cabe resaltar que es un grafo sin direcciones
        // Se crea a las personas
        Persona maria = new Persona("María", "Herrainz", "0000m");
        Persona diego = new Persona("Diego", "Serrano", "0001d");
        Persona matias = new Persona("Matías", "Reinoso", "0002m");
        Persona edu = new Persona("Edu", "Vicedo", "0003e");
        Persona claudia = new Persona("Claudia", "Martínez", "0004c");
        Persona pablo = new Persona("Pablo", "Ruiz", "0005p");
        Persona josu = new Persona("Josu", "Abad", "0006j");
        Persona joel = new Persona("Joel", "Romano", "0007j");
        Persona isabella = new Persona("Isabella", "Cristancho", "0008i");
        Persona jesus = new Persona("Jesús", "Lacruz", "0009j");


        // Si un grafo (G) = (vertices (V), aristas (E))
        // Entonces, las personas son los vertices y las conexiones de amigos son las aristas
        Persona[] vertices = {
            maria, diego, matias, edu, claudia, pablo, josu, joel, isabella, jesus
        };

        Persona[][] aristas = {
            {maria, diego}, // e1
            {diego, matias}, // e2
            {diego, edu}, // e3
            {edu, claudia}, // e4
            {edu, josu}, // e5
            {claudia, pablo}, // e6
            {josu, joel}, // e7
            {joel, isabella}, // e8
            {isabella, jesus} // e9
        };

        Grafo grafo = new MatrizIncidencia(vertices, aristas);
        grafo.listaAdyacencia();
        // System.out.println("==========================");
        // System.out.println(claudia.getAmigos().size());


        System.out.println();
        System.out.println();
        System.out.println();


   
        grafo.posicionFila();




    }
}
