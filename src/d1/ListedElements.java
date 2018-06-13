package d1;

import java.util.NoSuchElementException;

public class ListedElements{

	public Element root; // head, pradzia
	public int size = 0;

	public void add(int value) {
		
		this.size++;
		
		if (root == null) {
			root = new Element(value);
			return;
		}

		// pradedam nuo galvos
		Element current = root;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Element(value);
	}
	
	public int getSize() {
		return this.size;
	}
	

	public void addBefore(int value) {
		Element newRoot = new Element(value);
		newRoot.next = root;
		root = newRoot;
	}

	public void deleteWithValue(int value) {
		
		// jeigu tuscias, griztam
		if (root == null)
			return;

		// jeigu norime naikinti root, pradzia
		if (root.value == value) {
			root = root.next;
			this.size--;
			return;
		}

		// pasiimame pradzia
		Element current = root;

		// einame iki paskutines, bet ne null reiksmes
		while (current.next != null) {
			if (current.next.value == value) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
			this.size--;
		}
	}
	
	public boolean contains(int value) {
		Element current = root;
		while(current != null) {
			if (current.value == value) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public void printList() {
		Element current = root;
		while(current != null) {
			System.out.println(" " + current.value);
			current = current.next;
		}
	}

	public int returnElement(int index) {
		if (index > getSize()) {
			throw new NoSuchElementException();
		}
		Element current = root;
		for(int i=0; i<index; i++) {
			current = current.next;
		}
		return current.value;
	}
	
	public int[] toArray() {
		Element current = root;
		int[] arr = new int[getSize()];
		int i = 0;
		while(current != null) {
			arr[i] = current.value;
			i++;
			current = current.next;
		}
		return arr;
	}
	
}
