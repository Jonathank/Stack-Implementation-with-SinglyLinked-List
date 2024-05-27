package stackclasses;

import singlylinkedlist.SinglyLinkedList;

public class LinkedList<T> implements Stack<T>{

	SinglyLinkedList<T> list =  new SinglyLinkedList<T>();
	
	@Override
	public int size() {
		return list.size();
	}

	@Override
	public void push(T value) {
		list.addfirst(value);
	}


	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public T top() {
		return list.firstelement();
	}

	@Override
	public T pop() {
		return list.removefirst();
	}

}
