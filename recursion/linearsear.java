public class linearsear {
    public static int search(int arr[],int target,int i){
        if(arr[i]==target){
            return i;
        }
        return search(arr,target,i+1);
    }
    public static void main(String[] args) {
        int arr[]= {3,2,1,18,9};
        int target=18;
        int i=0;
        System.out.println(search(arr,target,i));
    }
}
