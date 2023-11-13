package linea;

public class TurnoAzul extends Turno{

    public void playRedkAt(Linea linea, int position) {


    }

    public void playBlueAt(Linea linea, int position) {
        linea.addToken(position, '0');

    }
    public Turno nextTurn() {
        return new TurnoRojo();


    }
}


