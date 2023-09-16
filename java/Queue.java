package queue;
import java.util.ArrayList;



public class Queue {

    public ArrayList<Contenedor> items = new ArrayList<>();


    public Queue() {
        items.add(new Empty());
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public Queue add(Object cargo) {
        items.add(1, new NotEmpty());
        return this;

    }

    public Object take() {
        return null;
    }


    public Object head() {
        return null;
    }

    public int size() {
        return this.items.size()-1;
    }

}
