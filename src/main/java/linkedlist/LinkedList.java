package linkedlist;

public class LinkedList {

    public int size = 0;

    public Node head = null;

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addAfterHead(0);
        list.addBeforeHead(-1);
        list.addAfterHead(1);
        list.addAfterHead(-2);
        list.addBeforeHead(2);
        list.addAfterHead(-3);

        list.print();

        System.out.println("size == " + list.size);

        list.deleteNodeWithKey(0);

        list.print();
        System.out.println("size == " + list.size);

        list.deleteNodeWithKey(-1);

        list.print();
        System.out.println("size == " + list.size);

        list.deleteNodeWithIndex(2);

        list.print();
        System.out.println("size == " + list.size);

        list.deleteLinkedList();

        list.print();
        System.out.println("size == " + list.size);

        list.getSize();

        list.addAfterHead(0);
        list.addBeforeHead(-1);
        list.addAfterHead(1);
        list.addAfterHead(2);
        list.addBeforeHead(-2);
        list.addAfterHead(3);

        list.print();
        System.out.println("size == " + list.size);
        list.getSize();

        System.out.println("recursive size = " + list.getSizeByRecursion(list.head));

        System.out.println(" recursive finding = " + list.findKeyWithRecursion(list.head, 24));

        list.print();

        System.out.println("nth node from list " + list.getNthNode(1));
    }

    public Node addAfterHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }

        size++;

        return newNode;

    }

    public void deleteNodeWithKey(int data) {

        Node curent = head;

        if (curent != null && curent.getData() == data) {
            head = curent.getNextNode();
            size--;
            return;
        }

        Node prev = null;

        while (curent != null && curent.getData() != data) {
            prev = curent;
            curent = curent.getNextNode();
        }

        if (curent == null) {
            return;
        }

        prev.setNextNode(curent.getNextNode());
        size--;

    }

    public void deleteNodeWithIndex(int pos) {

        Node curent = head;

        if (pos == 0) {
            head = curent.getNextNode();
            size--;
            return;
        }

        Node prev = null;

        int count = 0;

        while (curent != null) {
            prev = curent;
            curent = curent.getNextNode();

            count++;
            if (count == pos) {
                break;
            }

        }

        if (curent == null) {
            return;
        }

        prev.setNextNode(curent.getNextNode());
        size--;

    }

    public void addBeforeHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.setNextNode(head);
            head = newNode;
        }
        size++;
    }

    public void print() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp + ",");
            temp = temp.getNextNode();
        }
        System.out.println();
    }

    public void print(Node node) {

        Node temp = node;

        while (temp != null) {
            System.out.print(temp + " ");
            temp = temp.getNextNode();
        }
        System.out.println();
    }

    public void deleteLinkedList() {

        head = null;
        size = 0;

    }

    public void getSize() {

        Node current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.getNextNode();
        }

        System.out.println("size from counting = " + count);

    }

    public int getSizeByRecursion(Node node) {

        if (node == null) {
            return 0;
        }
        return 1 + getSizeByRecursion(node.getNextNode());
    }

    public boolean findKeyWithRecursion(Node node, int key) {

        if (node == null) {
            return false;
        }

        if (node != null && node.getData() == key) {
            return true;
        }

        return findKeyWithRecursion(node.getNextNode(), key);

    }

    public Node getNthNode(int val) {

        Node current = head;

        int count = 0;

        while (current != null) {

            if (val == count++) {
//				System.out.println(current);
                return current;
            }

            current = current.getNextNode();

        }

        return null;


    }

    public void loopNodeLL() {


    }

}
