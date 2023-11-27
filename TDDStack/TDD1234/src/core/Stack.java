package core;

public class Stack implements IStack {

	private Object[] stack;
	private int size;
	private int capacity;
	
	Stack(int capacity){
		this.capacity = capacity;
		this.size = 0;
		this.stack = new Object[capacity];
	}
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public void push(Object elm) throws Exception{
		if(isFull()) {
			throw new Exception("Stack is full.");
		}
		
		if (size > 0 && !elm.getClass().equals(stack[size-1].getClass())) {
			throw new Exception("All elements in the stack must be of the same type.");
		}
		
		stack[size] = elm;
		size++;
	}
	
	@Override
	public boolean isFull() {
		return size == capacity;
	}
	
	@Override
	public Object top() {
		if(isEmpty()) {
			return null;
		}
		return stack[size-1];
	}
	
	@Override
	public Object pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is Empty.");
		}
		
		Object popElm = stack[size - 1];
		size--;
		return popElm;
	}

}
