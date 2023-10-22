package submarino;

public class Sur extends Direccion{
    public Direccion derecha() {
        return new Oeste();
    }

    public Direccion izquierda() {
        return new Este();
    }

    public void adelante( Nemo nemo ) {
        nemo.aumentarY();
        //falta termnar esto
    }
    public string direccionActual(){
        return "Sur";
    }
}
