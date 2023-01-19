package daw.programacion;

public class Ladron extends Persona{

    private boolean ganzua;
    private boolean horquilla;

    public Ladron(String nombre, boolean ganzua, boolean horquilla){
        super(nombre);
        this.ganzua = ganzua;
        this.horquilla = horquilla;
    }

    public boolean isGanzua() {
        return this.ganzua;
    }

    public void setGanzua(boolean ganzua) {
        this.ganzua = ganzua;
    }

    public boolean isHorquilla() {
        return this.horquilla;
    }

    public void setHorquilla(boolean horquilla) {
        this.horquilla = horquilla;
    }

    @Override
    public String toString() {
        return "Ladron [ganzua=" + ganzua + ", horquilla=" + horquilla + "]";
    }
    
    public void forzarCerradura(Puerta puerta){
        if (this.ganzua == true && this.horquilla == true){
            puerta.setAbierto(true);
        }
    }
}
