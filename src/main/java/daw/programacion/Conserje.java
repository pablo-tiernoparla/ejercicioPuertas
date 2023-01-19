package daw.programacion;

public class Conserje extends Persona{

    private Llave[] llave;

    public Conserje(String nombre, Llave[] llave) {
        super(nombre);
        this.llave = llave;
    }

    public Llave getLlave(int num) {
        return this.llave[num];
    }

    public void setLlave(Llave llave, int num) {
        this.llave[num] = llave;
    }

    @Override
    public String toString() {
        return "Conserje [llave=" + this.llave + "]";
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
            if (puerta.isAbierto() == false){
                break;
            }
        }
    }
}
