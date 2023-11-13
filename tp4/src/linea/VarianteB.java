package linea;

public class VarianteB extends VarianteDeTriunfo{

    @Override
    public boolean elejirModo(char variante) {
        return variante == 'B';
    }

    @Override
    public boolean metodoDeTriunfo(Linea linea, char position) {
        return linea.diagonal;
    }
}
