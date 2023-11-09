package linea;
import java.util.ArrayList;

public class Linea {

    private int altura;
    private int base;
    private VarianteDeTriunfo varianteDeTriunfo;
    private ArrayList<ArrayList<Character>> tablero;
    private Turno turno = new TurnoRojo();


    public Linea(int base, int altura, char varianteDeTriunfo) {
        this.base = base;
        this.altura = altura;
        this.varianteDeTriunfo = ElejirVariante(varianteDeTriunfo);


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

    public String show() {
       return null;
    }

    public void playRedkAt(int position) {
        // pone una ficha roja en la columna indicada
        // no importa el turno
        // no importa si la columna está llena

        for (int i = 0; i < this.altura; i++) {
            if (this.tablero.get(i).get(position) == ' ') {
                this.tablero.get(i).set(position, 'R');
                break;
            }
        }

    }
        public void playBlueAt ( int position){
            return;
        }

    public boolean finished() {
        // devuelve true si el juego terminó
        // devuelve false si el juego no terminó
        // el juego termina cuando hay 4 fichas del mismo color en línea
        // en cualquier dirección
        // o cuando el tablero está lleno
        return this.varianteDeTriunfo.hayLinea(this.tablero);
    }

//    public boolean triunfoVertical() {
//        // devuelve true si hay 4 fichas del mismo color en línea
//        // en vertical
//        // devuelve false si no
//        for (int i = 0; i < this.base; i++) {
//            for (int j = 0; j < this.altura - 3; j++) {
//                if (this.tablero.get(j).get(i) != ' ' && this.tablero.get(j).get(i) == this.tablero.get(j + 1).get(i)
//                        && this.tablero.get(j).get(i) == this.tablero.get(j + 2).get(i)
//                        && this.tablero.get(j).get(i) == this.tablero.get(j + 3).get(i)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//
//
//    }
//
//    public boolean triunfoHorizontal() {
//        // devuelve true si hay 4 fichas del mismo color en línea
//        // en horizontal
//        // devuelve false si no
//        for (int i = 0; i < this.altura; i++) {
//            for (int j = 0; j < this.base - 3; j++) {
//                if (this.tablero.get(i).get(j) != ' ' && this.tablero.get(i).get(j) == this.tablero.get(i).get(j + 1)
//                        && this.tablero.get(i).get(j) == this.tablero.get(i).get(j + 2)
//                        && this.tablero.get(i).get(j) == this.tablero.get(i).get(j + 3)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public boolean triunfoDiagonal() {
//        // devuelve true si hay 4 fichas del mismo color en línea
//        // en diagonal
//        // devuelve false si no
//        for (int i = 0; i < this.altura - 3; i++) {
//            for (int j = 0; j < this.base - 3; j++) {
//                if (this.tablero.get(i).get(j) != ' ' && this.tablero.get(i).get(j) == this.tablero.get(i + 1).get(j + 1)
//                        && this.tablero.get(i).get(j) == this.tablero.get(i + 2).get(j + 2)
//                        && this.tablero.get(i).get(j) == this.tablero.get(i + 3).get(j + 3)) {
//                    return true;
//                }
//            }
//        }
//        for (int i = 0; i < this.altura - 3; i++) {
//            for (int j = 3; j < this.base; j++) {
//                if (this.tablero.get(i).get(j) != ' ' && this.tablero.get(i).get(j) == this.tablero.get(i + 1).get(j - 1)
//                        && this.tablero.get(i).get(j) == this.tablero.get(i + 2).get(j - 2)
//                        && this.tablero.get(i).get(j) == this.tablero.get(i + 3).get(j - 3)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


}

