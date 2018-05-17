/**
 * Created by apurvatripathi on 5/13/18.
 */
public class MergeSortAlgorithm {
    public static void mergeSort(int[] arr){
        mergeSortRecursive(arr,new int[arr.length], 0,arr.length-1);
    }

    public static void mergeSortRecursive(int[] arr, int[] temp, int left, int right){
        if(left>=right){
            return ;
        }
        int middle=(left+right)/2;
        mergeSortRecursive(arr,temp,left,middle);
        mergeSortRecursive(arr,temp, middle+1,right);
        merge(arr,temp, left,right);
    }

    public static void merge(int[] arr,int[] temp, int left,int right){
        int start = (left+right)/2;
        int rightStart = start+1;
        int index = left;

        while(left<= start && rightStart <= right){
            if(arr[left] <= arr[right]){
                temp[index]= arr[left];
                left++;
            }else{
                temp[index]= arr[right];
                right++;
            }
            index++;
        }

        System.arraycopy(arr,left, temp, index, start-left+1);
        System.arraycopy(arr,left, temp, index, start-left+1);


    }
}
