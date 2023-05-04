import java.util.ArrayList;
import java.util.List;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String id;
    private List<Persona> amigos = new ArrayList<Persona>();
    
    public Persona(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public Persona(String nombre, String apellido, String id, List<Persona> amigos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.amigos = amigos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Persona> getAmigos() {
        return amigos;
    }

    public void nuevoAmigo(Persona amigo) {
        this.amigos.add(amigo);
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + "]";
    }
}
