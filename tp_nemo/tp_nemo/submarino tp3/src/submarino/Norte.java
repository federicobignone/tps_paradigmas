package submarino;

public class Norte extends Direccion{
    public Direccion derecha() {
        return new Este();
    }

    public Direccion izquierda() {
        return new Oeste();
    }

    public void adelante( Nemo nemo ) {
        nemo.aumentarY();
        //falta termnar esto
    }
    public string direccionActual(){
        return "Norte";
    }
}
