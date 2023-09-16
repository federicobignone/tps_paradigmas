package queue;
import java.util.ArrayList;
public class NotEmpty extends Contenedor {
    private ArrayList<Contenedor> items = new ArrayList<>();
    private Object cargo;

    public NotEmpty(Object cargo) {
        this.cargo = cargo;
    }

    public Object Contenido() {
        return this.cargo;
    }
    public boolean isEmpty() {
        return false;
    }

    public Object head() {
        return items.get(1);
    }

    public Object take() {
        return items.remove(1);
    }
}