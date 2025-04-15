package pertemuan7;

public class ListMatakuliah {
	private Node head;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addHead(Matakuliah data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
		}
		else {
			newNode.setNext(head);
			head = newNode;
		}
	}
	
	public void displayElement() {
		if (isEmpty()) {
			System.out.println("list kosong");
		}
		else {
			Node curNode = head;
			while(curNode != null) {
				System.out.println("Matakuliah: " +
			curNode.getData().getKode() + "," +
			curNode.getData().getNama() + "," + 
			curNode.getData().getSks());
				curNode = curNode.getNext();
			}
			System.out.println();
		}
	}
	
	public void addTail (Matakuliah data) {
		Node posNode=null, curNode=null;
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
		}
		else {
			curNode = head;
			while (curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode);
		}
	}
	
	public void addMid (Matakuliah data, int position) {
		Node posNode = null, curNode;
		int i=0;
		
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			curNode = head;
			if(position == 1) {
				newNode.setNext(curNode);
				head = newNode;
			}else {
				i = 1;
			}while (curNode != null && i<position) {
				posNode = curNode;
				curNode = curNode.getNext();
				i++;
			}
			posNode.setNext(newNode);
			newNode.setNext(curNode);
		}
	}
	
	public int count() {
		Node curNode = head;
		int jumlah = 0;
		
		while (curNode != null) {
			jumlah += 1;
			curNode = curNode.getNext();
		}
		
		return jumlah;
	}
	
	private void dispose(Node node) {
		node.setNext(null);
		node = null;
	}
	
	public void removeHead() {
		if(isEmpty()) {
			System.out.println("List is empty");
		}else {
			Node temp =head;
			head = head.getNext();
			dispose(temp);
		}
	}
	
	public void removeTail() {
		if(isEmpty()) {
			System.out.println("List is empty");
		}else {
			Node lastNode = head;
			Node preNode = null;
			
			while(lastNode.getNext() != null) {
				preNode = lastNode;
				lastNode = lastNode.getNext();
			}
			
			preNode.setNext(null);
			dispose(lastNode);
		}
	}

}

