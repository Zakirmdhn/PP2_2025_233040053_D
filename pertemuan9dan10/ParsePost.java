package pertemuan9dan10;

public class ParsePost {
	private MyStack stack;
    private String input;

    public ParsePost(String input) {
        super();
        this.input = input;
    }

    public int doParse() {
        stack = new MyStack(20);
        char ch;
        int i;
        int bil1, bil2, hasilops;

        for (i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            stack.displayStack("" + ch + " ");

            if (ch >= '0' && ch <= '9') {
                stack.push((int)(ch - '0'));
            } else {
                bil2 = stack.top();
                bil1 = stack.top();

                switch (ch) {
                    case '+':
                        hasilops = bil1 + bil2;
                        break;
                    case '-':
                        hasilops = bil1 - bil2;
                        break;
                    case '*':
                        hasilops = bil1 * bil2;
                        break;
                    case '/':
                        hasilops = bil1 / bil2;
                        break;
                    default:
                        hasilops = 0;
                        break;
                }
                stack.push(hasilops);
            }
        }

        hasilops = stack.top();
        return hasilops;
    }

}
