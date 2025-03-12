package ch14utilitiesfactories.stack;

/**
 * Stack implementation with lazy singleton
 */
public class StackManager {
    private static StackManager INSTANCE = null;

    private final String[] stack = new String[100];
    private int top = -1;

    private StackManager() {}

    private boolean isFull() {
        return top == stack.length -1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public static StackManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StackManager();
        }
        return INSTANCE;
    }

    /**
     * Pushes a string on top of the stack
     * @param str the string being pushed
     */
    public void push(String str) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = str;
    }

    /**
     * Pops a string from the top of the stack
     * @return the string being popped or null if empty
     */
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        return stack[top--];
    }
}
