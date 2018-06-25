import java.util.Arrays;

/**
 * Created by apurvatripathi on 5/13/18.
 */
public class MergeSortAlgorithm {
    public static void mergeSort(int[] arr){
        mergeSort(arr,new int[arr.length], 0,arr.length-1);
    }

    public static void mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd){
        if(leftStart>=rightEnd){
            return;
        }

        int middle = (leftStart+rightEnd)/2;
        mergeSort(arr,temp,leftStart,middle);
        mergeSort(arr,temp,middle+1,rightEnd);
        sortArray(arr,temp,leftStart,rightEnd);

    }

    public static void sortArray(int[] arr,int[] temp, int leftStart, int rightEnd){
        int middle = (leftStart+rightEnd)/2;

        int leftEnd= middle;
        int rightStart = middle+1;

        int left = leftStart;
        int right = rightStart;

        int index = leftStart;
        int size = rightEnd - leftStart +1;

        //int temp = 0;

        while(left <= leftEnd && right <= rightEnd){
            if(arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
            }else{
                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        System.arraycopy(arr,left,temp,index,leftEnd-left+1);
        System.arraycopy(arr,right,temp,index,rightEnd-right+1);
        System.arraycopy(temp,leftStart,arr,leftStart,size);

    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,19,23,81,17,2,4,0,22,99,101,1001,100,999,283,435};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.print(Arrays.toString(arr));



    }
}
