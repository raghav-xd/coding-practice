package subsetstrings;

public class SkipString {
    public static String skip(String p,String up){
          if(up.isEmpty()){
            return p;
          }

        char ch=up.charAt(0);
          if(up.startsWith("apple")){
            return skip(p, up.substring(5));
          }
          return skip(p+up.charAt(0),up.substring(1));

    }
    public static void main(String[] args) {
        String up="bdapplefg";
        String p="";
        p=skip(p,up);
        System.out.println(p);
    }
}
