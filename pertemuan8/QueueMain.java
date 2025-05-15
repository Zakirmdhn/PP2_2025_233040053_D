package pertemuan8;

public class QueueMain {
	public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();
        
//        System.out.println("Latihan 4");
//        System.out.println("### Sebelum Enqueue 3x ###");
//        System.out.println("size: " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//        
//        queue.enqueue(3);
//        queue.enqueue(2);
//        queue.enqueue(1);
//
//        System.out.println("### Enqueue 3x ###");
//        System.out.println("size: " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//        System.out.println("Front: " + queue.front());
        
        System.out.println("Latihan 5");
        System.out.println("### setelah Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();

        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        System.out.println("### Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Front: " + queue.front());
        queue.displayElements();
        

    	}
    }

