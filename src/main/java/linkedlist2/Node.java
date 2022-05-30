package linkedlist2;

public class Node {

   private int data;
   private Node next;


   public Node(int val){
       this.data =  val;
   }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
