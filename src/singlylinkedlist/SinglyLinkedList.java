package singlylinkedlist;

public class SinglyLinkedList<T> {

private static class Node<T>{
	private Node<T> next;
	private T element;
	
	public Node(Node<T>n,T val) {
		this.next = n;
		this.element = val;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public T getElement() {
		return element;
	}

}

private Node<T>head = null;
private Node<T>tail = null;

private int size = 0;

public int size() {
	return size;
}
public boolean isEmpty() {
	return size == 0;
}
//
public void addfirst(T val) {
	Node<T> newnode = new Node<>(head,val);
	if(isEmpty()) {
		head = tail = newnode;
	}
	newnode.setNext(head);
	head = newnode;
	size++;	
}
//
public void addlast(T val) {
	Node<T>newnode = new Node<>(tail,val);
	if(isEmpty()) {
		tail = head = newnode;
	}
	newnode.setNext(null);
	tail.setNext(newnode);
	tail = newnode;
	size++;
}
//
public T firstelement() {
	if(isEmpty()) {
		return null;
	}
	return head.getElement();
}
//
public T lastelement() {
	if(isEmpty()) {
		return null;
	}
	return tail.getElement();
}
//
public T removefirst() {
	if(isEmpty()) {
		return null;
	}
	T val = head.getElement();
	head = head.getNext();
	size--;
	return val;
}

}
