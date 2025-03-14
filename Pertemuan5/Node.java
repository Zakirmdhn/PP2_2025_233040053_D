package Pertemuan5;

public class Node {
	private double  data;
	public Node next;
	
	//inisialisasi Node
	public Node(double data) {
		this.data = data;
		this.next = null;
	}
	
	//setter and getter
	public void setData(double data) {
		this.data = data;
	}

	public double getData() {
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
