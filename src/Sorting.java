import java.util.Arrays;

/**
 * Created by apurvatripathi on 12/25/18.
 */
public class Sorting {

    public int[] bubbleSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]< arr[j]){
                    arr[i] ^= arr[j];
                    arr[j] = arr[i]^ arr[j];
                    arr[i] ^= arr[j];
                }
            }
        }

        return arr;
    }

    public int[] selectionSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            int min = arr[i];
            int index = i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j] < min){
                    min = Math.min(min, arr[j]);
                    index = j;
                }
            }
            if(i==index) continue;
            arr[i] ^= arr[index];
            arr[index] = arr[i] ^ arr[index];
            arr[i] ^= arr[index];
        }
        return arr;
    }

    public void mergeSort(int[] arr){
         mergeSortHelper(arr, 0, arr.length-1);
    }


    private void mergeSortHelper(int[] arr, int l, int r){
        if(l >= r) return;

        //if(r>l) {
            int mid = (l + r) / 2;

            mergeSortHelper(arr, l, mid);
            mergeSortHelper(arr, mid + 1, r);

            mergeArray(arr, l, mid, r);
        //}
    }

    private void mergeArray(int[] arr, int l, int mid, int r){
        int len1 = mid-l+1;
        int len2 = r-mid;

        int[] left = new int[len1];
        int[] right = new int[len2];

        for(int i=0; i<len1; i++){
            left[i] = arr[l+i];
        }


        for(int i=0; i<len2; i++){
            right[i] = arr[mid+1+i];
        }

        int i = 0;
        int j = 0;

        int k = l;

        while(i < len1 && j < len2){

            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<len1){
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j<len2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public void quickSort(int[] arr){
        quickSortHelper(arr, 0, arr.length-1);
    }

    private void quickSortHelper(int[] arr, int l, int r){
        if(l >= r) return;

        int index = partition(arr, l, r);
        quickSortHelper(arr, l, index-1);
        quickSortHelper(arr, index, r);

    }

    private int partition(int[] arr, int l, int r){
        int middle = (l+r)/2;
        int pivot = arr[middle];

        while(l<= r){
            // Find element where it is more than pivot
            while(arr[l]<pivot) l++;
            // Or find element that is less than pivot
            while(arr[r] > pivot) r--;

            // If still right and left are at right position swap elements
            if(l<=r){
                arr[l] ^= arr[r];
                arr[r] = arr[l]^arr[r];
                arr[l] ^= arr[r];
                l++;
                r--;
            }

        }
        return l;
    }

    public int binarySearch(int[] arr, int key, int l, int r){
        if( l >= r) return -1;
        int middle = (l+r)/2;
        if(key == arr[middle]) return middle;
        if(key < arr[middle]) return binarySearch(arr, key, l, middle);
        return binarySearch(arr, key, middle+1, r);
    }

    public static void main(String args[]){
        Sorting obj = new Sorting();
        int[] arr = new int[]{2,3,4,5,6,7,1};
        System.out.println(Arrays.toString(obj.bubbleSort(arr)));
        System.out.println(Arrays.toString(obj.selectionSort(arr)));
        obj.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{2,3,4,5,6,7,1};
        obj.quickSort(arr);
        System.out.println(Arrays.toString(arr));
        //arr = new int[]{2,3,4,5,6,7,1};
        System.out.println(obj.binarySearch(arr, 4, 0, arr.length-1));
    }
}
