public class printnto1 {
    public static void print(int n){
        if(n==0){
            System.out.println(0);
            return;
        }
        System.out.println(n);
        print(n-1);
        
    }
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
}
