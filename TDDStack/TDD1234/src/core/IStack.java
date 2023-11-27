package core;

public interface IStack {
	//TC1
	int getSize() ;
	boolean isEmpty() ;
	
	//TC2
	void push(Object elm) throws Exception;
	boolean isFull(); 
	Object top();
	
	//TC4
	Object pop() throws Exception;
	

}
