public class BTS<T extends Comparable> {
    Node<T> root;
    int size;

    BTS() {

    }

    public boolean insert(T data) {
        Node<T> parrent = null;
        Node<T> current = root;
        if (root == null) {
            root = new Node<>(data);
            size++;
            return true;
        } else {
            while (current != null) {
                if (current.data.compareTo(data) > 0) {
                    parrent = current;
                    current = current.left;
                } else if (current.data.compareTo(data) < 0) {
                    parrent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (parrent.data.compareTo(data) > 0) {
                parrent.left = new Node<>(data);
            } else {
                parrent.right = new Node<>(data);
            }
        }
        size++;
        return true;
    }

    Node<T> findMax(Node<T> root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    Node<T> findMin(Node<T> root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public Node<T> remove(T element) {
        root =  remove(root, element);
        return root;
    }

    private Node<T> remove(Node<T> root, T element) {
        if (root == null) {
            return null;
        } else{
            if (root.data.compareTo(element) > 0) {
                Node<T> current = root;
                root.left = remove(root.left, element);
            } else if (root.data.compareTo(element) < 0) {
                root.right = remove(root.right, element);
            } else{
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                } else {
                    root.data = findMin(root.right).data;
                    root.right =  remove(root.right, root.data);
                }
            }
        }
        return root;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node<T> root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
}
