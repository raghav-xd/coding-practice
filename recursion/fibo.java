public class fibo {
    public static void main(String[] args) {
        //by using third variable sum
        int i=0;
        int j=1;
        int n=10;
        int sum=0;
        System.out.println(i);
        System.out.println(j);
        for(int s=j+1;s<n;s++){
            sum=i+j;
            System.out.println(sum);
            i=j;
            j=sum;
        }

    }
}
