public class MatrizIncidencia extends Grafo{

    public MatrizIncidencia(Persona[] vertices, Persona[][] aristas) {
        super(vertices, aristas);
    }
    
    // public void posicionFila() {
    //         byte[][] ubicacionConexionesXAmigo = new byte[getVertices().length][getAristas().length];

    //         // for (Persona amigo : getVertices()) {
    //         //     for (int x = 0 ; x < getAristas().length ; x++) {
    //         //         for(int y = 0 ; y < getAristas()[x].length ; y++) {
    //         //             if(getAristas()[x][y].getId() == amigo.getId()) {
                            
    //         //             }
    //         //         }            
    //         //     } 
    //         // }

    //         for(int amigo = 0 ; amigo < getVertices().length ; amigo++) {
    //             for (int x = 0 ; x < getAristas().length ; x++) {
    //                 for(int y = 0 ; y < getAristas()[x].length ; y++) {
    //                     if(getAristas()[x][y].getId() == getVertices()[amigo].getId()) {
    //                         ubicacionConexionesXAmigo[amigo][x] = 1;
    //                     }
    //                 }
    //             }
    //         }


    //         System.out.println(ubicacionConexionesXAmigo);


            
    // }

}
