package linea;

public class VarianteA extends VarianteDeTriunfo {


    @Override
    public boolean elejirModo(char variante) {
        return variante == 'A';
    }

    @Override
    public boolean metodoDeTriunfo(Linea linea, char position) {
    return linea.horizontal || linea.vertical;
    }
        }
