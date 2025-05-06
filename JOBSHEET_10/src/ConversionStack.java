public class ConversionStack {
    int[] binaryStack;
    int size;
    int top;

    public ConversionStack() {
        this.size = 32; 
        binaryStack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            binaryStack[top] = data;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = binaryStack[top];
            top--;
            return data;
        } else {
            System.out.println("Stack kosong!");
            return -1;
        }
    }
}