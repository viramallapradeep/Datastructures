package linkedlist;

public class ReverseLL {


    public static Node reverseLL(Node head) {
        Node curntHead = null;
        Node curentNode = head;

        while (curentNode != null) {
            Node nextNode = curentNode.getNextNode();
            curentNode.setNextNode(curntHead);
            curntHead = curentNode;
            curentNode = nextNode;
        }

        head = curntHead;
        return head;

    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addAfterHead(1);
        list.addAfterHead(2);
        list.addAfterHead(3);
        list.addAfterHead(4);
        list.addAfterHead(5);

//		list.head = reverseLL(list.head);

        reverseLL(list.head);

        list.print();

    }
}

