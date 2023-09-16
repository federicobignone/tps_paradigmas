package queue;
import java.util.ArrayList;



public class Queue {

    public ArrayList<Contenedor> items = new ArrayList<>();


    public Queue() {
        items.add(new Empty());
    }

    public boolean isEmpty() {
        return items.size() == 1;
    }

    public Queue add(Object cargo) {
        items.add(1, new NotEmpty(cargo));
        return this;

    }

    public Object take() {
        return items.remove(size()).Contenido();
    }


    public Object head() {
        return items.get(size()).Contenido();
    }

    public int size() {
        return this.items.size()-1;
    }

}
