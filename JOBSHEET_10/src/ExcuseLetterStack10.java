public class ExcuseLetterStack10 {
    private ExcuseLetter10[] stack; 
    private int top;
    private int size;

    public ExcuseLetterStack10(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new ExcuseLetter10[size];
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(ExcuseLetter10 letter) {
        if (!isFull()) {
            stack[++top] = letter;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public ExcuseLetter10 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("No letters to process.");
            return null;
        }
    }

    public ExcuseLetter10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("No letters available.");
            return null;
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].getName().equalsIgnoreCase(name)) {
                System.out.println("\nLetter found:\n" + stack[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No letter found for " + name + ".");
        }
    }
}