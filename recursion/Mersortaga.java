//in place
public class Mersortaga {
    public static void merge(int arr[],int s,int m,int e){
       int i=s;
       int j=m;
       int ans[]=new int[e-s];
       int k=0;
       while(i<m && j<e){
        if(arr[i]<arr[j]){
            ans[k++]=arr[i++];
        }
        else{
            ans[k++]=arr[j++];
        }
       }

       while(i<m){
        ans[k++]=arr[i++];
       }
       while(j<e){
        ans[k++]=arr[j++];
       }
    
       int g=s;
       for( k=0;k<ans.length;k++){
          arr[g++]=ans[k];
       }

    }
    public static void mergesort(int arr[],int s,int e){
        if(e-s<=1){
            return;
        }
        int mid=s+(e-s)/2;

        mergesort(arr,s,mid);
        mergesort(arr,mid,e);
        merge(arr,s,mid,e);

    }
    public static void main(String[] args) {
        int arr[]={3,4,1,2,5};
        int s=0;
        int e=arr.length;
        mergesort(arr,s,e);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
