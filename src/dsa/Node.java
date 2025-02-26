package dsa;

public class Node {
    private int root;
    private int left;
    private int right;

    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "root=" + root +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
