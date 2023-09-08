package queue;
import java.util.ArrayList;
public class Queue {
	private ArrayList<Object> items;

	public Queue() {
		this.items = new ArrayList<>();
	}

	public boolean isEmpty() {
		return this.items.isEmpty();
	}

	public Queue add( Object  cargo ) {
		this.items.add(cargo);
		return this;
	}

	public Object take() {
		if (this.items.isEmpty()) {
			throw new Error("Queue is empty");
		} else {
			Object item = this.items.remove(0);
			return item;
		}
	}

	public Object head() {
		if (this.items.isEmpty()) {
			throw new Error("Queue is empty");
		} else {
			return this.items.get(0);
		}
	}

	public int size() {
		return this.items.size();
	}

}
