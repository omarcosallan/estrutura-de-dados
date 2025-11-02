public class Tree<T extends Comparable<T>> {

    private Node<T> root;
    private Tree<T> left;
    private Tree<T> right;

    public Tree(T root) {
        this.root = new Node<>(root);
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (root == null) {
            root = newNode;
        } else {
            addNode(newNode);
        }
    }

    public Tree search(T value) {
        if (root == null || root.getValue() == value) {
            return this;
        }
        if (value.compareTo(root.getValue()) < 0) {
            return left.search(value);
        }
        return right.search(value);
    }

    public T min() {
        Tree<T> current = this;
        while (current.left != null) {
            current = current.left;
        }
        return current.root.getValue();
    }

    public T max() {
        Tree<T> current = this;
        while (current.right != null) {
            current = current.right;
        }
        return current.root.getValue();
    }

    public void inorder() {
        if (root != null) {
            if (left != null) {
                left.inorder();
            }
            System.out.print(root.getValue() + " ");
            if (right != null) {
                right.inorder();
            }
        }
    }

    private void addNode(Node<T> node) {
        Tree<T> tree = new Tree<>(node.getValue());
        if (node.getValue().compareTo(root.getValue()) < 0) {
            if (left == null) {
                left = tree;
            } else {
                left.add(node.getValue());
            }
        } else {
            if (right == null) {
                right = tree;
            } else {
                right.add(node.getValue());
            }
        }
    }
}
