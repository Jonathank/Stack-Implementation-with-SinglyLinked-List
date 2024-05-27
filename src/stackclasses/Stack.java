package stackclasses;

public interface Stack<T> {
	int size();
	void push(T value);
	T top();
	T pop();
	boolean isEmpty();

}
