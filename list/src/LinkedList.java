public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void add(T value) {
        insertLast(value);
    }

    public void add(int index, T value) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Index " + index + " not valid");
        }
        if (index == 0) {
            insertStart(value);
        } else if (index == size) {
            insertLast(value);
        } else {
            Node<T> prev = getByIndex(index - 1);
            insertAfter(prev, value);
        }
    }

    private void insertStart(T value) {
        Node<T> start = head;
        Node<T> newNode = new Node<>(value, start);
        head = newNode;
        if (start == null) {
            tail = newNode;
        }
        size++;
    }

    private void insertLast(T value) {
        Node<T> last = tail;
        Node<T> newNode = new Node<>(value, null);
        tail = newNode;
        if (last == null) {
            head = newNode;
        } else {
            last.setNext(newNode);
        }
        size++;
    }

    private void insertAfter(Node<T> prev, T value) {
        Node<T> next = prev.getNext();
        Node<T> newNode = new Node<>(value, next);
        prev.setNext(newNode);
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        Node<T> first = head;
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return first.getValue();
    }

    public T removeLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        if (size == 1) {
            return removeFirst();
        }
        Node<T> last = tail;
        tail = getByIndex(size - 2);
        tail.setNext(null);
        size--;
        return last.getValue();
    }

    public T remove(int index) {
        checkIndex(index);
        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return removeLast();
        }
        Node<T> prev = getByIndex(index - 1);
        Node<T> current = prev.getNext();
        Node<T> next = current.getNext();
        prev.setNext(next);
        size--;
        return current.getValue();
    }

    public T get(int index) {
        Node<T> node = getByIndex(index);
        return node != null ? node.getValue() : null;
    }

    public int indexOf(T value) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    private Node<T> getByIndex(int index) {
        checkIndex(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public void clear() {
        for (Node<T> current = head; current != null; ) {
            Node<T> nodeNext = current.getNext();
            current.setValue(null);
            current.setNext(null);
            current = nodeNext;
        }
        head = null;
        tail = null;
        size = 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index " + index + " not valid");
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Node<T> current = head;
        for (int i = 0; i < size - 1; i++) {
            builder.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        builder.append(current.getValue()).append("]");
        /*builder.append(current.getValue());
        while (current.getNext() != null) {
            builder.append(", ");
            current = current.getNext();
            builder.append(current.getValue());
        }*/
        return builder.toString();
    }
}
