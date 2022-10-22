package queue;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
}

class QueueLL{
	Node front,rear;
	int size = 0;
	void enqueue(int x) {
		Node temp = new Node(x);
		size++;
		if(front == null) {
			front = rear = temp;
			return;
		}
		rear.next = temp;
		rear = temp;
		
	}
	
	int dequeue() {
		if(front == null) return -1;
		front = front.next;
		size--;
		if(front == null) rear = null;
		Node temp = front;
		return temp.data;
	}
	
	int getFront() {
		if(front == null) {
			System.out.println("Queue is empty");
			return -1;
		}
		return front.data;
	}
	
	int getRear() {
		if(rear == null) {
			System.out.println("Queue is empty");
			return -1;
		}
		return rear.data;
	}
	
	int size() {
		return size;
	}
}
public class QueueImplementationLinkedList {

	public static void main(String[] args) {
		QueueLL q = new QueueLL();
	       q.enqueue(1);
	       q.enqueue(2);
	       q.enqueue(3);
	       q.enqueue(4);
	       q.enqueue(5);
	       q.enqueue(6);
	       q.enqueue(7);
//	       System.out.println(q.dequeue());
//	      
//	       System.out.println(q.dequeue());
	       
	       System.out.println(q.getFront()); 
	       System.out.println(q.getRear()); 
	       System.out.println(q.size());
	}

}
