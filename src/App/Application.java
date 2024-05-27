package App;

import stackclasses.LinkedList;

public class Application {

	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		Integer a = 1,b=2,c=3,d=4;
		
		System.out.println("the size is :  "+	stack.size());
		System.out.println("is it empty : "+	stack.isEmpty());
		stack.push(a);
		System.out.println("first element is : "+stack.top());
		System.out.println("the size is :  "+	stack.size());
		System.out.println("is it empty : "+	stack.isEmpty());
		stack.pop();
		System.out.println("first element is : "+stack.top());
		stack.push(a);
		System.out.println("first element is : "+stack.top());
		System.out.println("the size is :  "+	stack.size());
		System.out.println("is it empty : "+	stack.isEmpty());
		stack.push(b);
		System.out.println("first element is : "+stack.top());
		System.out.println("the size is :  "+	stack.size());
		System.out.println("is it empty : "+	stack.isEmpty());
		stack.push(c);
		System.out.println("first element is : "+stack.top());
		System.out.println("the size is :  "+	stack.size());
		System.out.println("is it empty : "+	stack.isEmpty());
		stack.push(d);
		System.out.println("first element is : "+stack.top());
		System.out.println("the size is :  "+	stack.size());
		System.out.println("is it empty : "+	stack.isEmpty());

	}

}
