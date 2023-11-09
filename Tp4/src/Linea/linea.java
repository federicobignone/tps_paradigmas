package Linea;
import java.util.ArrayList;

public class linea {

    private int altura;
    private int base;
    private VarianteDeTriunfo varianteDeTriunfo;
    private Turno turno;
    private ArrayList<ArrayList<Character>> tablero;



    public linea(int base, int altura, char varianteDeTriunfo) {
        this.base = base;
        this.altura = altura;
        this.varianteDeTriunfo = ElejirVariante(varianteDeTriunfo);
        this.turno = new TurnoRojo();

    }

    public VarianteDeTriunfo ElejirVariante(char varianteDeTriunfo) {
        // si es 'A' devuelve una instancia de VarianteA
        // si es 'B' devuelve una instancia de VarianteB
        // si es 'C' devuelve una instancia de VarianteC

        if (varianteDeTriunfo == 'A') {
            return new VarianteA();
        } else if (varianteDeTriunfo == 'B') {
            return new VarianteB();
        } else if (varianteDeTriunfo == 'C') {
            return new VarianteC();
        } else {
            return null;
        }
    }
    public void crearTablero() {
        this.tablero = new ArrayList<ArrayList<Character>>();
        for (int i = 0; i < this.altura; i++) {
            ArrayList<Character> fila = new ArrayList<Character>();
            for (int j = 0; j < this.base; j++) {
                fila.add(' ');
            }
            this.tablero.add(fila);
        }
    }
    public String show() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.altura; i++) {
            sb.append("|");
            for (int j = 0; j < this.base; j++) {
                sb.append(this.tablero.get(i).get(j));
            }
            sb.append("|\n");
        }
        return sb.toString();

    }
    public void playRedkAt(int position) {
        // si el turno es de rojo, pone una ficha roja en la columna indicada
        // si el turno es de azul, no hace nada
        if (this.turno.esRojo()) {
            for (int i = this.altura - 1; i >= 0; i--) {
                if (this.tablero.get(i).get(position - 1) == ' ') {
                    this.tablero.get(i).set(position - 1, 'X');
                    break;
                }
            }
            this.turno = new TurnoAzul();
        }
    }
    public void playBlueAt(int position) {
        // si el turno es de azul, pone una ficha azul en la columna indicada
        // si el turno es de rojo, no hace nada
        if (this.turno.esAzul()) {
            for (int i = this.altura - 1; i >= 0; i--) {
                if (this.tablero.get(i).get(position - 1) == ' ') {
                    this.tablero.get(i).set(position - 1, '0');
                    break;
                }
            }
            this.turno = new TurnoRojo();
        }
    }
    public boolean finished() {
        // devuelve true si el juego terminó
        // devuelve false si el juego no terminó
        // el juego termina cuando hay 4 fichas del mismo color en línea
        // en cualquier dirección
        // o cuando el tablero está lleno
        return this.varianteDeTriunfo.hayLinea(this.tablero);
    }
    public boolean triunfoVertical() {
        // devuelve true si hay 4 fichas del mismo color en línea
        // en vertical
        // devuelve false si no
        for (int i = 0; i < this.base; i++) {
            for (int j = 0; j < this.altura - 3; j++) {
                if (this.tablero.get(j).get(i) != ' ' && this.tablero.get(j).get(i) == this.tablero.get(j + 1).get(i)
                        && this.tablero.get(j).get(i) == this.tablero.get(j + 2).get(i)
                        && this.tablero.get(j).get(i) == this.tablero.get(j + 3).get(i)) {
                    return true;
                }
            }
        }
        return false;


    }
    public  boolean triunfoHorizontal() {
        // devuelve true si hay 4 fichas del mismo color en línea
        // en horizontal
        // devuelve false si no
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base - 3; j++) {
                if (this.tablero.get(i).get(j) != ' ' && this.tablero.get(i).get(j) == this.tablero.get(i).get(j + 1)
                        && this.tablero.get(i).get(j) == this.tablero.get(i).get(j + 2)
                        && this.tablero.get(i).get(j) == this.tablero.get(i).get(j + 3)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean triunfoDiagonal() {
        // devuelve true si hay 4 fichas del mismo color en línea
        // en diagonal
        // devuelve false si no
        for (int i = 0; i < this.altura - 3; i++) {
            for (int j = 0; j < this.base - 3; j++) {
                if (this.tablero.get(i).get(j) != ' ' && this.tablero.get(i).get(j) == this.tablero.get(i + 1).get(j + 1)
                        && this.tablero.get(i).get(j) == this.tablero.get(i + 2).get(j + 2)
                        && this.tablero.get(i).get(j) == this.tablero.get(i + 3).get(j + 3)) {
                    return true;
                }
            }
        }
        for (int i = 0; i < this.altura - 3; i++) {
            for (int j = 3; j < this.base; j++) {
                if (this.tablero.get(i).get(j) != ' ' && this.tablero.get(i).get(j) == this.tablero.get(i + 1).get(j - 1)
                        && this.tablero.get(i).get(j) == this.tablero.get(i + 2).get(j - 2)
                        && this.tablero.get(i).get(j) == this.tablero.get(i + 3).get(j - 3)) {
                    return true;
                }
            }
        }
        return false;
    }

}

