package dsa.linkedlist;
public class LinkedListAllOperation {

    public static LinkedListNode head= null;
    public static void main(String[] args) {
        LinkedListAllOperation linkedListAllOperation= new LinkedListAllOperation();
        linkedListAllOperation.addFirst(105);
        linkedListAllOperation.addFirst(325);
        linkedListAllOperation.addFirst(52);
        linkedListAllOperation.addLast(6552);


        printList();
    }

    private static void printList() {
        LinkedListNode currNode= head;
        while (currNode!=null){
            System.out.print(currNode.data +" ->");
            currNode= currNode.next;
        }
        System.out.println("NULL");
    }

    public void addFirst(int data){
        LinkedListNode newNode= new LinkedListNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        LinkedListNode currNode=head;
        LinkedListNode lastNode= new LinkedListNode(data);
        if(head==null){
            head=lastNode;
            return;
        }
        while (currNode.next!=null){
            currNode= currNode.next;
        }
        currNode.next=lastNode;
    }

}
