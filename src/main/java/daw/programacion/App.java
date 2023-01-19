package daw.programacion;

public class App 
{
    public static void main( String[] args )
    {
        Puerta puerta1 = new Puerta(1, false);
        Puerta puerta2 = new Puerta(2, false);
        PuertaBlindada puertab1 = new PuertaBlindada(6, false, 9, false);
        Llave llave1 = new Llave(1, true);
        Llave llave2 = new Llave(2, false);
        Conserje conserje1 = new Conserje("Raul", new Llave[]{llave1, llave2});

        conserje1.abrir(puerta1);
        conserje1.abrir(puerta2);
    }
}
