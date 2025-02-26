package dsa.linkedlist;

public class LinkedListNode {

    public int data;
    public LinkedListNode next;


    public LinkedListNode(int data){
        this.data=data;
        this.next=null;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
