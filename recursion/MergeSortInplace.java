public class MergeSortInplace {
    public static void merge(int arr[],int s,int m,int e){
       int mix[]=new int[e-s];
       int i=s;
       int j=m;
       int k=0;
       while(i<m && j<e){
        if(arr[i]<arr[j]){
            mix[k++]=arr[i++];
        }
        else{
            mix[k++]=arr[j++];
        }
       }

       while(i<m){
        mix[k++]=arr[i++];
       }
       while(j<e){
        mix[k++]=arr[j++];
       }
       
       for( k=0;k<mix.length;k++){
        arr[s+k]=mix[k];
       }
    }

    public static void mergeSort(int arr[],int s,int e){
        if(e-s<=1){
           return;
        }
        int mid=s+(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);

        merge(arr,s,mid,e);

    }
    public static void main(String[] args) {
        int arr[]={3,1,4,2,6};
        int s=0;
        int e=arr.length;
        mergeSort(arr,s,e);

        for(Integer num: arr){
            System.out.println(num);
        }

        
    }
}
