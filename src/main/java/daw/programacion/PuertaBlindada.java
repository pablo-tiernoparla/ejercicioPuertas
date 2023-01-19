package daw.programacion;

public class PuertaBlindada extends Puerta{

    private int numBlindada;
    private boolean abrirBlindada;
    
    public PuertaBlindada(int numero, boolean abierto, int numBlindada, boolean abrirBlindada){
        super(numero, abierto);
        this.numBlindada = numBlindada;
        this.abrirBlindada = abrirBlindada;
    }

    public int getNumBlindada() {
        return numBlindada;
    }

    public void setNumBlindada(int numBlindada) {
        this.numBlindada = numBlindada;
    }

    @Override
    public String toString() {
        return "PuertaBlindada [numBlindada=" + this.numBlindada + "numero=" + this.getNumero() + "abierto=" + this.isAbierto() + "]";
    }

    public boolean isAbrirBlindada() {
        return abrirBlindada;
    }

    public void setAbrirBlindada(boolean abrirBlindada) {
        this.abrirBlindada = abrirBlindada;
    }
    
    
}
