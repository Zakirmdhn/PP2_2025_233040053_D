package pertemuan8;

public class StrukturQueue {
		 	private Node FRONT;
		    private Node REAR;

		    public void enqueue(int data) {
		        Node newNode = new Node(data);
		        if (isEmpty()) {
		            FRONT = newNode;
		            REAR = newNode;
		        } else {
		            REAR.setNext(newNode);
		            REAR = newNode;
		        }
		    }

		    public boolean isEmpty() {
		        return FRONT == null;
		    }

		    public int size() {
		        int size = 0;
		        Node curNode = FRONT;
		        while (curNode != null) {
		            size++;
		            curNode = curNode.getNext();
		        }
		        return size;
		    }

		    public int front() {
		        if (!isEmpty()) {
		            return (int) FRONT.getData();
		        } else {
		            throw new RuntimeException("Queue kosong");
		        }
		    }
		    
		    public void displayElements() {
		        if (isEmpty()) {
		            System.out.println("Elemen Queue: Queue kosong");
		        } else {
		            System.out.print("Elemen Queue: ");
		            Node current = FRONT;
		            while (current != null) {
		                System.out.print(current.getData() + " ");
		                current = current.getNext();
		            }
		            System.out.println();
		        }
		    }

		    public int dequeue() {
		        if (isEmpty()) {
		            throw new RuntimeException("Queue kosong");
		        }
		        int data = (int) FRONT.getData();
		        FRONT = FRONT.getNext();
		        if (FRONT == null) {
		            REAR = null;
		        }
		        return data;
		    } 
	}

