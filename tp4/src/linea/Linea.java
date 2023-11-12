package linea;
import java.util.ArrayList;
import java.util.List;

public class Linea {

    private int altura;
    private int base;
    private VarianteDeTriunfo varianteDeTriunfo;
    private List<List<String>> tablero;
    private Turno turno = new TurnoRojo();
    private int movesMade = 0;
    private int maxMoves;


    public Linea(int base, int altura, char varianteDeTriunfo) {
        this.base = base;
        this.altura = altura;
        this.varianteDeTriunfo = ElejirVariante(varianteDeTriunfo);
        maxMoves = base * altura;

    }


    public void playRedkAt(int position) {
    turno.playRedkAt(this, position);
    turno = turno.nextTurn();

    }

    public boolean finished() {
        if (movesMade == maxMoves) {
            return true;

        }
        return false;
    }

    public void playBlueAt ( int position){


        }

        public boolean show () {


            return false;
        }


        private VarianteDeTriunfo ElejirVariante ( char varianteDeTriunfo){
           return null;
        }


    public void addToken(int position, char c) {
        //I need you to add a token to the board
        

    }
}




