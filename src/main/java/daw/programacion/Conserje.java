package daw.programacion;

public class Conserje {

    private String nombre;
    private Llave[] llave;

    public Conserje(String nombre, Llave[] llave) {
        this.nombre = nombre;
        this.llave = llave;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Llave getLlave(int num) {
        return this.llave[num];
    }

    public void setLlave(Llave llave, int num) {
        this.llave[num] = llave;
    }

    @Override
    public String toString() {
        return "Conserje [nombre=" + this.nombre + ", llave=" + this.llave + "]";
    }

    public void abrir(Puerta puerta) {
        for (int i = 0; i < llave.length; i++) {
            this.llave[i].abrirPuerta(puerta);
            if (puerta.isAbierto() == true){
                break;
            }
        }
    }

    public void cerrar(Puerta puerta) {
        for (int i = 0; i < llave.length; i++) {
            this.llave[i].cerrarPuerta(puerta);
            if (puerta.isAbierto() == true){
                break;
            }
        }
    }
}
