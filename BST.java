public class BST {
    class Node {
        int key;
        Node left, right;

        public Node(int data) {
            key = data;
            left = right = null;
        }
    }

    Node root;

    BST() {
        root = null;
    }

    void insert(int key) {
        root = insertEle(root, key);
    }

    Node insertEle(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertEle(root.left, key);
        else if (key > root.key)
            root.right = insertEle(root.right, key);

        return root;
    }

    boolean search(int key) {
        root = searchEle(root, key);
        if (root != null)
            return true;
        else
            return false;
    }

    public Node searchEle(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (root.key < key)
            return searchEle(root.right, key);

        return searchEle(root.left, key);
    }

    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        boolean ele = tree.search(50);
        System.out.println(ele);

    }
}
