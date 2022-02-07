package linkedlist;

public class RemoveDuplicates {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addAfterHead(4);
        list.addAfterHead(90);
        list.addAfterHead(9);
        list.addAfterHead(5);
        list.addAfterHead(4);

        Node curnt = list.head;


        while (curnt != null) {


            curnt = curnt.getNextNode();
        }


//		case 1
		/*HashSet<Integer> set = new HashSet<>();
		Node prev = null;
		
		while (curnt!=null) {
			
			if (set.contains(curnt.getData())) {
				prev.setNextNode(curnt.getNextNode());
			}else {
				set.add(curnt.getData());
				prev = curnt;
			}
			
			curnt = curnt.getNextNode();
		}
		list.print();
		*/


    }

}
