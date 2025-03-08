public class sumofdigits {
    public static int rec(int n){
        
        if(n%10==0){
            return n;
        }
        int digit=n%10; 
         return digit+rec(n/10);

    }
    public static void main(String[] args) {
        // int n=13424;
        // not recursively
        
        // int digit=0;
        // int sum=0;
        // int num=0;
        // while(n!=0){
        //   digit= n%10;
        //   sum=sum+digit;
        //   n=n/10;
        // }
        // System.out.println(sum);

        //recursion


        int n=13425;
        System.out.println(rec(n));

        
    }
}
