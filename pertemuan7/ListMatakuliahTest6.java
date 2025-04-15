package pertemuan7;

public class ListMatakuliahTest6 {
	public static void main(String[] args) {
		ListMatakuliah list = new ListMatakuliah();
		
		list.addHead(new Matakuliah("IF003", "Struktur Dikrit", 3));
		list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
		list.addHead(new Matakuliah("IF005", "Algoritma Pemrograman 1", 3));
		list.addHead(new Matakuliah("IF006","Algoritma Pemrograman 2", 3));
		list.addMid(new Matakuliah("IF002", "Pemrograman Web", 3), 5);
		list.addTail(new Matakuliah("IF001", "Dasar Pemograman", 4));
		list.displayElement();
		System.out.println("Jumlah Matakuliah: "+ list.count());
		
	}

}
