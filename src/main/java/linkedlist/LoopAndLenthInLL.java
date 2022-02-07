package linkedlist;

public class LoopAndLenthInLL {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addAfterHead(1);

        Node addAfterHead = list.addAfterHead(2);

        list.addAfterHead(3);

        list.addAfterHead(4);

        list.addAfterHead(5).setNextNode(addAfterHead);

//		list.print();


        Node slow = list.head;
        Node fast = list.head;


        while (fast != null && fast.getNextNode() != null) {

            slow = slow.getNextNode();
            fast = fast.getNextNode().getNextNode();

            if (slow == fast) {
                System.out.println(slow.getData());
                break;
            }

        }


        int count = 0;
        while (slow != null) {
            count++;
            slow = slow.getNextNode();
            if (slow == fast) {
                break;

            }


        }

        System.out.println(count);

    }

}
