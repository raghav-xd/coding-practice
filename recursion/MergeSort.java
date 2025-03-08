import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int left[],int right[]){
        int i=0;
        int j=0;
        int n=left.length+right.length;
        int ans[]=new int[n];
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k++]=left[i];
                i++;
            }
            else if(right[j]<left[i]){
                ans[k++]=right[j];
                j++;
            }
        }
        while(j<right.length){
        ans[k++]=right[j];
        j++;
        }

        while(i<left.length){
            ans[k++]=left[i];
            i++;
        }

        return ans;
    }
    public static int[] divide(int arr[]){
        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;
        int left[]= divide(Arrays.copyOfRange(arr,0,mid));
        int right[] = divide(Arrays.copyOfRange(arr,mid,arr.length));
        
        return merge(left,right);

    }

    public static void main(String[] args) {
        int arr[]={3,1,4,2,6};
        int sorted[]=divide(arr);

        for(int i=0;i<sorted.length;i++){
            System.out.println(sorted[i]);
        }
    }
}
