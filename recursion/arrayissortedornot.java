public class arrayissortedornot {
    public static boolean check(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return check(arr,i+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,10,8,9,12};
        int i=0;
        System.out.println(check(arr,i));
    }
}
