import java.util.*;
//return type arraylist
//return type void - int
public class linearseartatmultipleocc {

    public static ArrayList<Integer> search(int arr[],int i,int target, ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        
        return search(arr,i+1,target,list);
        
        
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,4,4,5,4};
        int i=0;
        int target=4;
         ArrayList<Integer> list=new ArrayList<>();
        System.out.println(search(arr,i,target,list));
    }
}
