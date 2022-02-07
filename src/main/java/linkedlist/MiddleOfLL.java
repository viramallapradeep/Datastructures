package linkedlist;

public class MiddleOfLL {


    public static void middleOdLL(Node head) {


        Node curr = head;

        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.getNextNode();
        }

        curr = null;

        curr = head;

        int count1 = 0;

        while (curr != null) {

            count1++;

            if ((count / 2) + 1 == count1) {
                System.out.println(curr.getData());
                break;
            }

            curr = curr.getNextNode();
        }

    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addAfterHead(1);
        list.addAfterHead(2);
        list.addAfterHead(3);
        list.addAfterHead(4);
        list.addAfterHead(5);

        middleOdLL(list.head);

    }

}
