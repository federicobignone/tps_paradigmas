package queue;

public class Empty extends Contenedor {
    public boolean isEmpty() {
        return true;
    }

    public Object take() {
        throw new Error("Queue is empty");
    }

    public Object head() {
        throw new Error("Queue is empty");
    }


}