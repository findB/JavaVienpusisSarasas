package d1;

import java.util.Arrays;

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
		System.out.println(Arrays.toString(e1.toArray()));
		
//		for(int i=0; i<e1.toArray().length; i++) {
//			System.out.println(e1.toArray()[i]);
//		}
	}

}
