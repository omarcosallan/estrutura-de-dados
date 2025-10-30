public class Queue<T> {

    private T[] elements;
    private int start;
    private int end;
    private int capacity;
    private int size;
    private final static int initialCapacity = 10;

    public Queue() {
        this(initialCapacity);
    }

    public Queue(int initialCapacity) {
        this.elements = (T[]) new Object[initialCapacity];
        this.start = 0;
        this.end = 0;
        this.capacity = initialCapacity;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean offer(T element) {
        resize();
        elements[end] = element;
        end = (end + 1) % capacity;
        size++;
        return true;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return elements[start];
    }

    public T pool() {
        T removed = peek();
        elements[start] = null;
        start = (start + 1) % capacity;
        size--;
        return removed;
    }

    private void resize() {
        if (size == capacity) {
            T[] newArr = (T[]) new Object[capacity * 2];
            for (int i = 0; i < size; i++) {
                newArr[i] = elements[(start + i) % capacity];
            }
            elements = newArr;
            capacity *= 2;
            start = 0;
            end = size;
        }
    }
}
