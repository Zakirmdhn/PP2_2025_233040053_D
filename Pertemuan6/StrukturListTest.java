package Pertemuan6;

public class StrukturListTest {
	 public static void main(String[] args) {
	        StrukturList list = new StrukturList();

	        list.addHead(1);
	        list.addHead(5);
	        list.addHead(3);
	        list.addHead(6);
	        list.addHead(2);
	        System.out.println("Tampilan list saat ini:");
	        list.displayElement();
	        list.removeMid();
	        System.out.println("Tampilan list saat ini:");
	        list.displayElement();
	        // Instruksi tambahan agar output menjadi seperti berikut: 2 1
	        list.removeMid();
	        list.removeMid();
	        System.out.println("Tampilan list saat ini:");
	        list.displayElement();
	    }

}
