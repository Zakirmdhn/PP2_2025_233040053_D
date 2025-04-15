package pertemuan7;

public class ListMatakuliahTest4 {
	public static void main(String[] args) {
		ListMatakuliah list = new ListMatakuliah();
		
		list.addHead(new Matakuliah("IF003","Struktur Dikrit", 3));
		list.addHead(new Matakuliah("IF004","Konstruksi PL Berorientasi Objek", 3));
		list.addMid(new Matakuliah("IF002","Pemrograman Web", 3), 0);
		list.addTail(new Matakuliah("IF001","Dasar Pemrograman", 4));
		list.displayElement();
	}

}
