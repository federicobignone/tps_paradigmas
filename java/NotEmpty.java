package queue;

public class NotEmpty extends Contenedor {
    public boolean isEmpty() {
        return false;
    }

    public boolean head() {
        return this.items.get(1);
    }

    public boolean take() {
        Object item = this.items.remove(1);
        return item;
    }
}
