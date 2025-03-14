package subsetstrings;
import java.util.*;

public class subset {
    public static ArrayList<String> subset(String p, String up,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        subset(p+ch, up.substring(1),list);
        subset(p,up.substring(1),list);
        return list;
    }

    public static void helper(String up){
        String p="";
        ArrayList<String> list=new ArrayList<>();
        list=subset(p,up,list);
        System.out.println(list);
        System.out.println(list.size());
    }
    public static void main(String[] args) {
        String up="abc";
        String p="";
        helper(up);

    }
}
