package queue;

public abstract class Contenedor {
    private static Object Cargo;
    public abstract boolean isEmpty();
    public abstract Object take();
    public abstract Object head();
    public abstract Object Contenido();
    public static Contenedor empty() {
        return new Empty();
    }
    public static Contenedor notEmpty() {
        return new NotEmpty(Cargo);
    }
}