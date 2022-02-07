package linkedlist;

public class ReverseLLByRRecursion {


//	null 1 2 3 4 5

    static Node reverse(Node head, Node newHead) {


        if (head == null) {
            return newHead;
        }

        Node nextNode = head.getNextNode();
        head.setNextNode(newHead);
        newHead = head;
        head = nextNode;

        return reverse(head, newHead);

    }

    static Node reverse2(Node head) {

        if (head == null || head.getNextNode() == null) {
            return head;
        }

        Node node = reverse2(head.getNextNode());

        return node;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addAfterHead(1);
        list.addAfterHead(2);
        list.addAfterHead(3);
        list.addAfterHead(4);
        list.addAfterHead(5);

//		Node reverse = reverse(list.head, null);

//		list.print(reverse);


        reverse2(list.head);

    }

}
