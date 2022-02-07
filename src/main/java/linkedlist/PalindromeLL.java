package linkedlist;

import java.util.Stack;

public class PalindromeLL {


    //Iterative way brute force
	
	/*public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

		list.addAfterHead(4);
		list.addAfterHead(5);
		list.addAfterHead(9);
		list.addAfterHead(5);
		list.addAfterHead(4);
		
		Node curnt = list.head;
		
		int count = 0;
		while (curnt != null) {
			count++;
			curnt = curnt.getNextNode();
		}
		
		System.out.println("count == "+count);
		
		boolean flag = true;
		
		for (int j = count; j >= 1 ;j--) {
			
			int temp = 0;
			
			Node fn = list.head;
			
			int ic = 0;
			
				while (fn != null) {
					
					ic++;
					if (ic == i) {
					  temp = fn.getData();
						break;
					}
					
					fn = fn.getNextNode();
				}
			
				
		    Node ln = list.head;
			
		    int lic = 0;
		    
				while (ln != null) {
					lic++;
					if (lic == j) {
						
						
						if (!( temp == ln.getData())) {
							flag = false;
							break;
						}
						
						break;
					}
					
					ln = ln.getNextNode();
			}
			
		}
		
		System.out.println(flag == true ? " palindrome" : "not palindrome");
	}
*/

    //using stack
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addAfterHead(4);
        list.addAfterHead(5);
        list.addAfterHead(9);
        list.addAfterHead(58);
        list.addAfterHead(4);


        Stack<Integer> stack = new Stack<>();

        Node curnt = list.head;

        while (curnt != null) {
            stack.push(curnt.getData());
            curnt = curnt.getNextNode();
        }

        System.out.println(stack);

        curnt = list.head;

        boolean flag = true;

        while (curnt != null) {

            if (!(stack.pop() == curnt.getData())) {
                flag = false;
                break;
            }

            curnt = curnt.getNextNode();
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }


    }


}
