package queue;

public abstract class Contenedor {
    public abstract boolean isEmpty();
    public abstract boolean take();
    public abstract boolean head();
    public static Contenedor empty() {
        return new Empty();
    }

    public static Contenedor notEmpty() {return new NotEmpty();
    }
}
