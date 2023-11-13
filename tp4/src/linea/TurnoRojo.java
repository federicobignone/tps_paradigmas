package linea;

public class TurnoRojo extends Turno{

    public void playRedkAt(Linea linea, int position) {
        linea.addToken(position, '0');
    }

    @Override
    public void playBlueAt(Linea linea, int position) {

    }


    public Turno nextTurn() {
        return new TurnoAzul();
    }
}
