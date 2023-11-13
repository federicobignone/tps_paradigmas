package linea;

public class VarianteC extends VarianteDeTriunfo{

    @Override
    public boolean elejirModo(char variante) {
        return variante == 'C';
    }

    @Override
    public boolean metodoDeTriunfo(Linea linea, char position) {
        return linea.horizontal && linea.vertical && linea.diagonal;
    }
}
