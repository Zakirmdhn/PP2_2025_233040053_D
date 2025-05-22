package pertemuan9dan10;

public class StrukturStack {
	protected int[] array;     
    protected int capacity;
    protected int TOP;
    public final int MIN = -1;

    // Konstruktor
    public StrukturStack(int capacity) {
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    // Mengecek apakah stack penuh
    public boolean isFull() {
        return TOP == capacity - 1;
    }

    // Mengecek apakah stack kosong
    public boolean isEmpty() {
        return TOP == MIN;
    }

    // Mendapatkan ukuran saat ini dari stack
    public int size() {
        return TOP + 1;
    }

    // Mengembalikan nilai elemen paling atas
    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack kosong");
        }
        return array[TOP];
    }

    // Menambahkan elemen ke stack
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            array[++TOP] = data;
        }
    }

    // Menghapus dan mengembalikan elemen teratas dari stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack kosong");
        }
        return array[TOP--];
    }

    // Mendapatkan elemen pada posisi TOP (digunakan untuk print)
    public int[] getElements() {
        int[] elements = new int[size()];
        for (int i = 0; i < size(); i++) {
            elements[i] = array[i];
        }
        return elements;
    }

}
