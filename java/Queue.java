package queue;
import java.util.ArrayList;



public class Queue {
	private ArrayList<Contenedor> items;

	public Queue() {
		this.items = new ArrayList<>();
	}

	public boolean isEmpty() {
		return this.items.isEmpty();
	}

	public Queue add( Contenedor cargo) {
		this.items.add(cargo);
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
