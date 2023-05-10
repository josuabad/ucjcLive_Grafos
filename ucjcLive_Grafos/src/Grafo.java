public class Grafo {

    private Persona[] vertices;
    private Persona[][] aristas;

    // Constructor
    public Grafo(Persona[] vertices, Persona[][] aristas) {
        this.vertices = vertices;
        this.aristas = aristas;
    }

    // Getters & Setters
    public Persona[] getVertices() {
        return vertices;
    }

    public void setVertices(Persona[] vertices) {
        this.vertices = vertices;
    }

    public Persona[][] getAristas() {
        return aristas;
    }

    public void setAristas(Persona[][] aristas) {
        this.aristas = aristas;
    }

    
    // Métodos
    public Persona identificador(String id) {
        /*
         * Identifica al amigo correspondiente al ID que es introducido 
         */

        Persona amigo = null;
        for (Persona persona : vertices) {
            if(persona.getId() == id) {
                amigo = persona;
                break;
            }
        }
        return amigo;
    }


    public void subListaAdyacencia() {
        /*
         * Añade todas las conexiones de amigos que tiene un persona a su lista de amigos propia
         */

        String id1 = "";
        String id2 = "";

        for (Persona persona : vertices) {
            for(int fila = 0; fila < aristas.length ; fila++) {
                for(int columna = 0; columna < aristas[fila].length ; columna++) {
                    if(columna == 0) { // Compara todos los IDs para que no se cuente como conexion su propio ID
                        id1 = aristas[fila][columna].getId();
                    } else {
                        id2 = aristas[fila][columna].getId();
                    }
                }
                if(persona.getId() == id1) { // Si tienes el mismo id que el comparador, tu amigo es el id contrario
                    persona.nuevoAmigo(identificador(id2));
                } else if(persona.getId() == id2) {
                    persona.nuevoAmigo(identificador(id1));
                }
            }
        }
    }


    public void listaAdyacencia() {
        /*
         * Logra enseñar por pantalla la lista de amigos que se crea en subListaAdyacencia()
         */

        System.out.println("Lista de adyacencia:");
        subListaAdyacencia(); // Guarda a todos los amigos
        // Hay que hacer que pinte datos
        for (Persona persona : vertices) {
            System.out.print(persona.getNombre() + ": "); // Muestra el nombre de la persona
            System.out.println(persona.getAmigos()); // Muestra todos los amigos de esa persona
        }
    }







    public void posicionFila() {
        byte[][] ubicacionConexionesXAmigo = new byte[getVertices().length][getAristas().length];

        // for (Persona amigo : getVertices()) {
        //     for (int x = 0 ; x < getAristas().length ; x++) {
        //         for(int y = 0 ; y < getAristas()[x].length ; y++) {
        //             if(getAristas()[x][y].getId() == amigo.getId()) {
                        
        //             }
        //         }            
        //     } 
        // }

        for(int amigo = 0 ; amigo < getVertices().length ; amigo++) {
            for (int x = 0 ; x < getAristas().length ; x++) {
                for(int y = 0 ; y < getAristas()[x].length ; y++) {
                    if(getAristas()[x][y].getId() == getVertices()[amigo].getId()) {
                        ubicacionConexionesXAmigo[amigo][x] = 1;
                    }
                }
            }
        }




        for (int x = 0 ; x < ubicacionConexionesXAmigo.length ; x++) {
            for(int y = 0 ; y < ubicacionConexionesXAmigo[x].length ; y++) {
                System.out.print(ubicacionConexionesXAmigo[x][y]);
            }
            System.out.println();
        }


        
}


















}
