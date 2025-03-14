package subsetstrings;

public class skipchar {
    public static String helper(String str, String ans,int i){
        if(i==str.length()){
             return ans;
        }

        if(str.charAt(i)!='a'){
            ans+=str.charAt(i);
        }

        return helper(str,ans,i+1);
    }
    public static void skipp(String str){
        String ans="";
        int i=0;
        ans=helper(str,ans,i);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String str="baccad";
        skipp(str);
        
    }
}
