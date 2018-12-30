/**
 * Created by apurvatripathi on 12/26/18.
 */
public class medianArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);
        double result = Double.MIN_NORMAL;
        int x = nums1.length;
        int y = nums2.length;
        System.out.println(nums1.length+" : "+ nums2.length);
        //
        //if(y == 0 && x == 1) return (double) nums2[0];
        int low = 0;
        int high = x;

        while(low<=high){
            int partX = (low+high)/2;
            int partY = (x+y+1)/2 - partX;

            int maxXLeft = partX == 0 ? Integer.MIN_VALUE : nums1[partX-1];
            int maxYLeft = partY == 0 ? Integer.MIN_VALUE : nums2[partY-1];

            int minXRight = partX == x ? Integer.MAX_VALUE : nums1[partX];
            int minYRight = partY == y ? Integer.MAX_VALUE : nums2[partY];

            if(maxXLeft <= minYRight && maxYLeft <= minXRight){
                if((x+y) % 2 == 0){
                    result =  ((double)Math.max(maxXLeft, maxYLeft) + Math.min(minXRight, minYRight))/2;

                }else {
                    result =  ((double) Math.max(maxXLeft, maxYLeft));

                }
                break;

            }else if(maxXLeft > minYRight){
                high = partX-1;
            }else{
                low = partX+1;
            }
        }

        return result;
    }

    public static void main(String args[]){
        medianArray obj = new medianArray();
        System.out.println(obj.findMedianSortedArrays(new int[] {4,5,6,8,9}, new int[] {}));
    }
}
