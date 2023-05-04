public class Grafo {
    
    public Persona identificador(Persona[] personas, String id) {
        Persona amigo = null;
        for (Persona persona : personas) {
            if(persona.getId() == id) {
                amigo = persona;
                break;
            }
        }
        return amigo;
    }


    public void subListaAdyacencia(Persona[] v, Persona[][] e) { // Luego hacemos la llamada por el numero de aristas para no tener que pasarlas por ahora

        String id1 = "";
        String id2 = "";

        for (Persona persona : v) {
            for(int fila = 0; fila < e.length ; fila++) {
                for(int columna = 0; columna < e[fila].length ; columna++) {
                    if(columna == 0) {
                        id1 = e[fila][columna].getId();
                    } else {
                        id2 = e[fila][columna].getId();
                    }
                }
                if(persona.getId() == id1) { // Si tienes el mismo id que el comparador, tu amigo es el id contrario
                    persona.nuevoAmigo(identificador(v, id2));
                } else if(persona.getId() == id2) {
                    persona.nuevoAmigo(identificador(v, id1));
                }
            }
        }
    }


    public void listaAdyacencia(Persona[] v, Persona[][] e) {
        System.out.println("Lista de adyacencia:");
        subListaAdyacencia(v, e);
        // Hay que hacer que pinte datos
    }



}
