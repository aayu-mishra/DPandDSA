package dsa.binarytree;

public class BinarySearchTree {

    Node root;

    public static void main(String[] args) {

    }

    public static Node insertBST(Node root, int data){
        if(root==null){
            root = new Node(data);
            return root;
        }
        if(data>root.data){
            root.right= insertBST(root.right,data);
        }
        else {
            root.left= insertBST(root.left, data);
        }
        return root;
    }
}
