package queue;

public class Empty extends Contenedor {

    public static final String QUEUE_IS_EMPTY = "Queue is empty";

    public boolean isEmpty() {
        return true;
    }


    public Object Contenido() {
        throw new Error(QUEUE_IS_EMPTY);
    }

    public Object take() {
        throw new Error(QUEUE_IS_EMPTY);
    }

    public Object head() {
        throw new Error(QUEUE_IS_EMPTY);
    }


}