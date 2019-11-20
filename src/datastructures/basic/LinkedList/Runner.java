package datastructures.basic.LinkedList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insertAtStart(50);
		list.insertAt(2, 33);
		list.show();
	}

}
