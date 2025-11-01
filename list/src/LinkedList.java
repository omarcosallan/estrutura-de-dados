public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (size == 0) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public void clear() {
        for (Node<T> current = head; current != null;) {
            Node<T> nodeNext = current.getNext();
            current.setValue(null);
            current.setNext(null);
            current = nodeNext;
        }
        head = null;
        tail = null;
        size = 0;
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
