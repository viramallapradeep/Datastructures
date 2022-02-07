package linkedlist;

public class NthNodeFromEnd {


    static int i = 0;

    public static void getNnthNodeFromEnd(Node head, int val) {


        Node curnt = head;
        int count = 0;

        while (curnt != null) {
            count++;
            curnt = curnt.getNextNode();
        }

        Node tempNode = head;

        int temCount = 0;

        while (tempNode != null) {

            temCount++;
            if (temCount == (count - val) + 1) {
                System.out.println(tempNode.getData());
                break;
            }

            tempNode = tempNode.getNextNode();
        }

    }

    public static void getNnthNodeFromEndByRec(Node head, int n) {


        if (head == null) {
            return;
        }

        getNnthNodeFromEndByRec(head.getNextNode(), n);

        if (++i == n)
            System.out.print(head.getData());
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addAfterHead(1);
        list.addAfterHead(2);
        list.addAfterHead(3);
        list.addAfterHead(4);
        list.addAfterHead(5);


        getNnthNodeFromEndByRec(list.head, 2);


    }

}
