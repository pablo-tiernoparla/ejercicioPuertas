package daw.programacion;

public class Conserje {

    private String nombre;
    private Llave[] llave;

    public Conserje(String nombre, Llave[] llave){
        this.nombre = nombre;
        this.llave = llave;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Llave getLlave() {
        return this.llave[0];
    }

    public void setLlave(Llave llave) {
        this.llave[0] = llave;
    }

    @Override
    public String toString() {
        return "Conserje [nombre=" + this.nombre + ", llave=" + this.llave + "]";
    }
    
    public void abrir(Puerta puerta){
        this.llave[0].abrirPuerta(puerta);
    }

    public void cerrar(Puerta puerta){
        this.llave[0].cerrarPuerta(puerta);        
    }
}
