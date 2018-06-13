package d1;

public class Element {
	
	int value;
	Element next; // rodykle
	
	public Element(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Element [value=" + value + "]";
	}
	
	

}
