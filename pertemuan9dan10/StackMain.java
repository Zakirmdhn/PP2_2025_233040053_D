package pertemuan9dan10;

public class StackMain {

	public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        System.out.println("#Sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen from TOP: ");
        cetakElemen(stack.getElements());

        System.out.println("#Melakukan push 3x:");
        stack.push(1);
        System.out.println("push 2");
        stack.push(4);
        System.out.println("push 4");
        stack.push(2);
        System.out.println("push 1");

        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen from TOP: ");
        cetakElemen(stack.getElements());
    }

    public static void cetakElemen(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
