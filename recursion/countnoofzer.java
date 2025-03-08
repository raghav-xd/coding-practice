public class countnoofzer {
    public static int cnt(int n,int cntt){
        if(n==0){
            return cntt;
        }

        if(n%10==0){
             return cnt(n/10,cntt+1);
        }
          return cnt(n/10,cntt);

    }
    public static void main(String[] args) {
        int n=3020004;
        int cntt=0;
       System.out.println(cnt(n,cntt));
    }
}
