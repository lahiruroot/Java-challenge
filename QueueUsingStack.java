package queue;

import java.util.*;

//O(N)
class  QueueUS{
	int rear;
	Stack<Integer> s1;
	Stack<Integer> s2;
	QueueUS() {
		s1  = new Stack<Integer>();
		s2  = new Stack<Integer>();
	}
	void enqueue(int x) {
		if(s1.size() == 0) {
			s1.add(x);
		} else {
			while(s1.size()!=0) {
				s2.add(s1.pop());
			}
			s1.add(x);
			while(s2.size() != 0) {
				s1.add(s2.pop());
			}
		}
		rear = x;
	}
	int rear() {
		if(s1.size() == 0) {
			 return -1;
		}
		return rear;
	}
	int dequeue() {
		if(s1.size() == 0) {
			return -1;
		}
		return s1.pop();
	}
	
	int front( ) {
		if(s1.size() == 0) {
			return -1;
		}
		return s1.peek();
	}
	
	boolean isEmpty() {
		return s1.size() == 0;
	}
}


//*Optimized approach* O(1) and amortised O(1)

class QueueOUS {
	int rear;
	Stack<Integer> input;
	Stack<Integer> output;
	
	QueueOUS() {
		input = new Stack<>();
		output = new Stack<>();
	}
	
	void enqueue(int x) {
		input.add(x);
		rear = x;
	}
	
	int dequeue() {
		if(output.size() == 0) {
			while(input.size()!=0) {
				output.add(input.pop());
			}
			return output.pop();
		}
		return output.pop();
	}
	
	int front() {
		if(output.size()==0) {
			while(input.size() != 0) {
				output.add(input.pop());
			}
			return output.peek();
		}
		return output.peek();
	}
	
	int rear() {
		if(output.size() == 0) {
			 return -1;
		}
		return rear;
	}
	
	boolean isEmpty() {
		return output.size() == 0;
	}
	
}

public class QueueUsingStack {

	public static void main(String[] args) {
		 QueueOUS q = new QueueOUS();
	       q.enqueue(1);
	       
	       q.enqueue(2);
	       q.enqueue(3);
	       q.enqueue(4);
//	       System.out.println(q.front());
	       q.enqueue(5);
//	       System.out.println(q.dequeue());
	       q.enqueue(6);
	       System.out.println(q.dequeue());
	       q.enqueue(7);
	       
	       while(!q.isEmpty()) {
	           System.out.println(q.dequeue());
	       }
	       System.out.println(q.rear());
	}

}
