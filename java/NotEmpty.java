package queue;

public class NotEmpty extends Contenedor {

    private Object cargo;

    public boolean isEmpty() {
        return false;
    }

    public Object head() {
        return this.items(1);
    }

    public Object take() {
        return items.remove(1);
    }
}