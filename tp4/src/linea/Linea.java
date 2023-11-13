package linea;
import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Linea {

    public boolean horizontal;
    public boolean vertical;
    public boolean diagonal;
    private int altura;
    private int base;
    private VarianteDeTriunfo varianteDeTriunfo;
    private List<List<Character>> tablero;
    private Turno turno = new TurnoRojo();
    private int movesMade = 0;
    private int maxMoves;


    public Linea(int base, int altura, char variante) {
        this.base = base;
        this.altura = altura;
        this.varianteDeTriunfo = ElejirVariante(variante);
        maxMoves = base * altura;

        tablero = new ArrayList<>();
        IntStream.range(0, base).forEach(j -> tablero.add(new ArrayList<>()));
    }

    public VarianteDeTriunfo ElejirVariante(char variante) {
        ArrayList<VarianteDeTriunfo> varianteElegida = new ArrayList<>(Arrays.asList(new VarianteA(), new VarianteB(), new VarianteC()));

        return varianteElegida.stream().filter(varianteDeTriunfo -> varianteDeTriunfo.elejirModo(variante)).findFirst().orElseThrow(() -> new RuntimeException("No existe la variante"));
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

    public void playBlueAt(int position) {
        turno.playBlueAt(this, position);
        turno = turno.nextTurn();
    }


    public void addToken(int position, char c) {
        position = position - 1;
        tablero.get(position).add(c);


    }

    public String show() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                result.append(tablero.get(i).get(j)).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public boolean horizontal(char player) {
          int requiredMatches = 4;
          return IntStream.range(0, altura)
                 .anyMatch(i -> IntStream.range(0, base - requiredMatches + 1)
                            .anyMatch(j -> IntStream.range(0, requiredMatches)
                                  .allMatch(k -> tablero.get(i).get(j + k) == player)));
    }

    public boolean vertical( char player) {
        int requiredMatches = 4;
        return IntStream.range(0, altura - requiredMatches + 1)
                .anyMatch(i -> IntStream.range(0, base)
                        .anyMatch(j -> IntStream.range(0, requiredMatches)
                                .allMatch(k -> tablero.get(i + k).get(j) == player)));
    }
        public boolean diagonal (char player){
            // Check diagonals from top-left to bottom-right
            boolean topLeftToBottomRight = IntStream.range(0, altura - 3)
                    .anyMatch(i -> IntStream.range(0, base - 3)
                            .anyMatch(j -> IntStream.range(0, 4)
                                    .allMatch(k -> tablero.get(i + k).get(j + k) == player)));

            // Check diagonals from top-right to bottom-left
            boolean topRightToBottomLeft = IntStream.range(0, altura - 3)
                    .anyMatch(i -> IntStream.range(3, base)
                            .anyMatch(j -> IntStream.range(0, 4)
                                    .allMatch(k -> tablero.get(i + k).get(j - k) == player)));

            return topLeftToBottomRight || topRightToBottomLeft;
        }

}




