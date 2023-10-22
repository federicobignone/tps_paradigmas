package submarino;

public class Oeste extends Direccion{
    public Direccion derecha() {
        return new Norte();
    }

    public Direccion izquierda() {
        return new Sur();
    }

    public void adelante( Nemo nemo ) {
        nemo.aumentarX();
        //falta termnar esto
    }
    public string direccionActual(){
        return "Oeste";
    }
}
