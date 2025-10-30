import java.util.EmptyStackException;

public class Stack<T> {

    private T[] elements;
    private int top;
    private final static int initialCapacity = 10;

    public Stack() {
        this(initialCapacity);
    }

    public Stack(int initialCapacity) {
        elements = (T[]) new Object[initialCapacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(T element) {
        resize();
        elements[++top] = element;
    }

    public T pop() {
        T removed = peek();
        elements[top--] = null;
        return removed;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[top];
    }

    public int size() {
        return top + 1;
    }

    private void resize() {
        int size = top + 1;
        if (size == elements.length) {
            T[] newArr = (T[]) new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                newArr[i] = elements[i];
            }
            elements = newArr;
        }
    }
}
