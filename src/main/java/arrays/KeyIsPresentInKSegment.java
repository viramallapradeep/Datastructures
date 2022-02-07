package arrays;

public class KeyIsPresentInKSegment {

    public static void main(String[] args) {

        int[] array = {4, 5, 3, 4, 9, 3, 1, 7, 3, 3, 12, 4, 7};
        int key = 3;
        int seg = 3;

        boolean is = false;

        int count = 0;
				
		/*for (int i = 0; i < array.length; i++) {
			if(segCount==0)
				is=false;
			
			segCount++;
			
			    if(array[i]==key) {
			    		is=true;
			    		i=((i/seg)+1)*seg-1;
			    		segCount=0;
			    }
			    
			    if(segCount==seg) {
			    	
			    		if(!is) {
			    			break;
			    		}
			    		segCount=0;
			    }
			    
			
		} */

//		int array[]= {4, 5, 4,     4, 9, 3,      1, 7, 3,     3, 12, 4};

        int len = array.length;

        //best case = n;
        // time complexity (n/seg)*seg=O(n)
        //space complexity O(n)
        //best case O(n)

//		for (int i = 0; i < len;) {
//			int temp=i;
//			is=false;
//				for (int j = i; j < temp+seg; j++) {
//						if(array[j]==key) {
//							count++;
//							i=((len/seg)-1)*count;
//							is=true;
//							break;
//						}else {
//							i++;
//						}
//						
//				}
//				
//				if(!is) {
//					break;
//				}
//			
//		}

        System.out.println(is);


        int[] array1 = {4, 5, 3, 4, 9, 3, 1, 7, 3, 9, 12, 3, 3};

        int k = 3, segVal = 3;

        int g = 0;

        if ((array1.length % segVal) > 0)
            g = 1;


        int totalseg = ((array1.length / segVal) + g);

        System.out.println("totalseg = " + totalseg);

        int count1 = 0;

        boolean flag = false;
//	    int i=0;
//	    int array1[]= {4, 5, 3,     4, 9, 3,      1, 7, 3,     9, 12, 4};

        for (int i = 0; i < len - 1; ) {
            System.out.println("lll");
            int temp = i;
            flag = false;
            for (int j = temp; j < segVal + temp && j < len; ) {
                if (array1[j] == k) {
                    count1++;
                    i = ((array1.length / segVal - 1) * count1);
                    System.out.println("lll  " + i);
                    flag = true;
                    break;
                } else {
                    j++;
                }
            }

            if (!flag) {
                break;
            }
        }


        System.out.println("count1==" + count1);


    }


}
