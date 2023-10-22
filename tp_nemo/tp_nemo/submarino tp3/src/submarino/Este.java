package submarino;

public class Este extends Direccion{
    public Direccion derecha() {
        return new Sur();
    }

    public Direccion izquierda() {
        return new Norte();
    }

    public void adelante( Nemo nemo ) {
        nemo.aumentarX();
        //falta termnar esto
    }
    public string direccionActual(){
        return "Este";
    }
}
