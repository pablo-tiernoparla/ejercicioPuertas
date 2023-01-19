package daw.programacion;

public class Puerta {

    private boolean abierto;
    private int numero;

    public Puerta(int numero, boolean abierto){
        this.numero = numero;
        this.abierto = abierto;
    }

    public boolean isAbierto() {
        return this.abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Puerta [abierto=" + this.abierto + ", numero=" + this.numero + "]";
    }
    
    
}
