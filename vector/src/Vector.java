import java.util.NoSuchElementException;

public class Vector<T> {

    private T[] elements;
    private int size;
    private final static int initialCapacity = 10;

    public Vector() {
        this(initialCapacity);
    }

    public Vector(int initialCapacity) {
        elements = (T[]) new Object[initialCapacity];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T get(int index) {
        if (isEmpty()) {
            throw new IllegalStateException("Vect is empty");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return elements[0];
        }
    }

    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return elements[size - 1];
        }
    }

    public int indexOf(T element) {
        if (isEmpty()) {
            throw new IllegalStateException("Vect is empty");
        }
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        size = 0;
    }

    public boolean contains(T element) {
        return indexOf(element) >= 0;
    }

    public void add(T element) {
        resize();
        elements[size++] = element;
    }

    public void add(int index, T element) {
        resize();
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
            if (i == index) {
                elements[i] = element;
                size++;
            }
        }
        elements[index] = element;
    }

    public T remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        T element = elements[index];
        for (int i = index; i <= size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return element;
    }

    private void resize() {
        if (size == elements.length) {
            T[] newArr = (T[]) new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                newArr[i] = elements[i];
            }
            elements = newArr;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elements[i] + ", ");
        }
        if (size > 0) {
            sb.append(elements[size - 1]);
        }
        sb.append("]");
        return sb.toString();
    }
}
