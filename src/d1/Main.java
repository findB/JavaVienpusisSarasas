package d1;

public class Main{

	public static void main(String[] args) {
		ListedElements e1 = new ListedElements();
		e1.add(3);
		e1.add(4);
		e1.add(7);
		e1.add(4);
		e1.add(8);
		e1.printList();
		
		e1.deleteWithValue(7);
		System.out.println();
		e1.printList();
	}

}
