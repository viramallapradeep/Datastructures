package arrayOne;

public class MaxSumConfiguration {


    static void maxSum(int[] arr, int n) {
        int cum_sum = 0;
        for (int i = 0; i < n; i++)
            cum_sum += arr[i];

        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += i * arr[i];

        int res = sum;

        for (int i = 1; i < n; i++) {
            sum = sum - cum_sum + arr[i - 1] * (n);
            res = Math.max(res, sum);
        }

        System.out.println(res);
    }


    public static void main(String[] args) {


        int[] arr = {8, 3, 1, 2};
        int n = arr.length;
        maxSum(arr, n);


//        case 1 BF
		/*
		int a[]  = {8,3,1,2};
		int n= a.length;
		    int max = 0;
		    int rot = 0;
		    
		    
	while(rot < n){
		        
		    	int sum = 0;
		    	
		    	for(int i = 0 ; i<n;i++){
		    		sum += a[i]*i;
		    	}
		    	
		        int temp = a[n-1];
		       for(int i = n-1 ; i>0;i--){
		           a[i] = a[i-1];
		       }
		        a[0] = temp;
		        
		        
		        
		        if(sum > max)
		        max = sum;
		        rot++;

		}
		    
		    System.out.println(max);*/


    }

}
