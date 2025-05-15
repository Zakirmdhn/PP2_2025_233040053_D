package pertemuan8;

public class Node {
	private int  data;
	public Node next;
	
	//inisialisasi Node
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	//setter and getter
	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}
	
	//setter untuk next
	public void setNext(Node next) {
        this.next = next;
    }

	//getter untuk next
	public Node getNext() {
        return next;
    }
	
}


