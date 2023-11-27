package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {

	//TC1
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack(10);
		assertEquals(true,s1.isEmpty());
		
		assertEquals(0,s1.getSize());
	}

	//TC2
	public void testPushElmToTop() {
		Stack s2 = new Stack(10);
		assertEquals(false, s2.isFull());
		Object elm = "Test";
		try {
			s2.push(elm);
			assertEquals(false, s2.isEmpty());
			assertEquals(elm, s2.top());
		} catch (Exception e) {
			fail("Unexpected exception: " + e.getMessage());
		}
	}
	
	//TC3
	public void testPushDifferentElmTypeToStack(){
		Stack s3 = new Stack(10);
		
		try {
			s3.push(5);
			s3.push(6);
			s3.push(7);
			assertEquals(false, s3.isEmpty());
			assertEquals(7, s3.top());
			
			s3.push("String");
			fail("Expected exception not thrown");
		} catch (Exception e) {
			assertEquals("All elements in the stack must be of the same type.", e.getMessage());
		}
	}
	
	//TC4
	public void testLastinFirstOut() {
		Stack s4 = new Stack(10);
				
		try {
			s4.push(1);
			s4.push(2);
			s4.push(3);
			assertEquals(3, s4.pop());
			assertEquals(2, s4.pop());
			assertEquals(1, s4.pop());
					
		} catch (Exception e) {
			e.getMessage();
			}
		}
	
	//TC5
	public void testPushToFullStack(){
		Stack s5 = new Stack(3);
		
		try {
			s5.push(1);
			s5.push(2);
			s5.push(3);
			s5.push(4);
			fail();
			assertEquals(true, s5.isFull());
				
		} catch (Exception e) {
			assertEquals("Stack is full.",e.getMessage());
		}
	}
	
	
}
