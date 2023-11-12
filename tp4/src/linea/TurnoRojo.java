package linea;

public class TurnoRojo extends Turno{

    public void playRedkAt(Linea linea, int position) {
        return linea.addToken(position, '0');
    }


    public Turno nextTurn() {
        return new TurnoAzul();
    }
}
