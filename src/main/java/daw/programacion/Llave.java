package daw.programacion;

public class Llave {

    private int numero;
    private boolean maestra;

    public Llave(int numero, boolean maestra) {
        this.numero = numero;
        this.maestra = maestra;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Llave [numero=" + this.numero + "]";
    }

    public boolean abrirPuerta(Puerta puerta) {
        if (puerta.isAbierto() == false) {
            if (this.numero == puerta.getNumero() || this.maestra == true) {
                System.out.println("Se abre la cerradura");
                return true;
            }
            System.out.println("No se puede abrir la puerta");
            return false;
        }
        System.out.println("La puerta esta abierta ya");
        return true;
    }

    public boolean cerrarPuerta(Puerta puerta){
        if (puerta.isAbierto() == true){
            if (this.numero == puerta.getNumero() || this.maestra == true) {
                puerta.setAbierto(false);
                System.out.println("Se cierra la puerta");
                return false;
            }
            System.out.println("No se puede cerrar la puerta");
            return true;
        }
        System.out.println("La puerta esta cerrada ya");
        return false;
    }

    public boolean isMaestra() {
        return this.maestra;
    }

    public void setMaestra(boolean maestra) {
        this.maestra = maestra;
    }
}
