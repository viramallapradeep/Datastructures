package linkedlist2;

import java.util.HashSet;

public class LinkedList {

  static  Node head = null;

   public void pushAtEnd(int val){

       if(head == null){
            head = new Node(val);
       }else{
           Node temp = head;
           while(temp != null && temp.getNext()!=null){
               temp = temp.getNext();
           }
           temp.setNext(new Node(val));
       }
    }

    public void pushAtStart(int val){
       if(head == null){
         head = new Node(val);
       }else{
          Node temp =  new Node(val);
          temp.setNext(head);
          head = temp;
       }
    }

     static void printList(){
       Node temp = head;
       while(temp != null){
           System.out.println(temp.getData());
           temp = temp.getNext();
       }
    }

    void pushAfter(int after, int val){

       if(head == null){
           System.out.println("list is empty");
       }else {
           Node temp = head;
           boolean flag = false;
           while (temp != null) {
               if (temp.getData() == after) {
                   flag = true;
                   if(temp.getNext()!=null){
                       Node last =temp.getNext();
                       Node newNode=new Node(val);
                       temp.setNext(newNode);
                       newNode.setNext(last);
                       break;
                   }
               }
               temp = temp.getNext();
           }
           if (!flag){
               System.out.println("element not found");
           }
       }
    }

    void pushBefore(int before, int val){

       if(head == null){
           System.out.println("empty LL");
       }else{
           Node temp = head;
           Node prev = null;
           while(temp != null){
               if(temp.getData() == before){
                   Node newNode=new Node(val);
                   prev.setNext(newNode);
                   newNode.setNext(temp);
                   break;
               }
               prev = temp;
               temp = temp.getNext();
           }
        }
    }

    void deleteNode(int val){

       if(head == null ){
           System.out.println("list is empty");
       }else{
            Node temp = head;
            Node  prev = null;
            while (temp != null){
                if(temp.getData() == val){

                    if(temp.getNext() != null){
//                        Node nextNode = temp.getNext();
                        prev.setNext(temp.getNext());
                        break;
                    }
                }
                prev = temp;
                temp = temp.getNext();
            }
       }
    }

       int recursiveLength(Node head){

       if(head == null ){
           return 0;
       }
       int num = recursiveLength(head.getNext());
       return 1+num;
    }


    boolean recFind(Node head,int val){

       boolean flag = false;
       if(head == null)
           return false;
       if(head.getData()==val)
          return true;

       return recFind(head.getNext(),val);

    }


    void removeDuplicate(Node head)
    {
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) {
            int curval = current.getData();

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.setNext(current.getNext());
            }else {
                hs.add(curval);
                prev = current;
            }
            current = current.getNext();
        }
    }



    public static void main(String[] args) {
    LinkedList ll = new LinkedList();
               ll.pushAtEnd(6);
                ll.pushAtEnd(7);
                ll.pushAtEnd(8);
                ll.pushAtEnd(9);
                ll.pushAtEnd(9);
                ll.pushAtEnd(9);
                ll.pushAtEnd(10);
                ll.pushAtEnd(9);
                ll.removeDuplicate(head);
        printList();


    }


}
