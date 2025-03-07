package dsa.binarytree;

public class BTTraversal {

    Node root;

    public static void main(String[] args) {

        BTTraversal tree = new BTTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder Traversal:");
        inorderTraversal(tree.root);
        postOrderTraversal(tree.root);

    }

    public static void inorderTraversal(Node node){
        if(node==null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
        System.out.println();
    }

    public static void preorderTraversal(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.data +" ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void postOrderTraversal(Node node){
        if(node==null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data+ " ");
    }
}
