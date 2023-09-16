package queue;

public abstract class Contenedor {
    public abstract boolean isEmpty();
    public abstract Object take();
    public abstract Object head();
    public static Contenedor empty() {
        return new Empty();
    }

    public static Contenedor notEmpty() {
        return new NotEmpty();
    }
}