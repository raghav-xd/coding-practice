public class revrse {
    public static int rev(int n,int rev){

        if(n==0){
            return rev;
        }

       rev= rev*10+(n%10);
       return rev(n/10,rev);

    }
    public static void main(String[] args) {
        int n=12345;
        // withut recursion
        // int rev=0;
        // int dig=0;
        // while(n!=0){
        //     dig=n%10;
        //     rev=rev*10+dig;
        //     n=n/10;
        // }

        // System.out.println(rev);
        int rev=0;
        int s=rev(n,rev);
        System.out.println(s);
    }
}
