package dynamicProgram;

public class KnapSack {

    public static void main(String[] args) {

        int[] w = {2,3,1,4};
        int[] p = {4,5,3,7};
        int kc = 8 , maxp = 0 , temp = 0 ,sum = 0;

        for(int i=0;i<w.length;i++){
           temp = w[i];
           sum= p[i];
            for (int j = i+1; j < w.length; j++) {
                temp += w[j];
                if(temp > kc){
                    break;
                }else{
                    sum +=p[j];
                    maxp = Math.max(maxp,sum);
                }
            }
        }
        System.out.println(maxp);
    }
}
