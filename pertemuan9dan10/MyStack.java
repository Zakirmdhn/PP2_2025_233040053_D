package pertemuan9dan10;

public class MyStack extends StrukturStack {
	public MyStack(int capacity) {
        super(capacity);
    }

    public void displayStack(String s) {
        System.out.println(s);
        System.out.println("Stack (bottom-->top):");
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println();
    }

    public int peekN(int n) {
        return array[n]; // sekarang bisa akses karena protected
    }
}