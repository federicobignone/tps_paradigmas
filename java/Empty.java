package queue;

public class Empty extends Contenedor {
    public boolean isEmpty() {
        return true;
    }

    public boolean take() {
        throw new Error("Queue is empty");
    }

    public boolean head() {
        throw new Error("Queue is empty");
    }


}
