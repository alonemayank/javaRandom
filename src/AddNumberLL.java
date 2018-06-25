import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by apurvatripathi on 6/25/18.
 */

class ListNode{
    int val;
    ListNode next;

    public ListNode(int in){
        this.val=in;
    }
}

public class AddNumberLL {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode sum = new ListNode(0);
        ListNode head = sum;

        int total;
        while(l1!=null || l2!=null || (l1==null && l2 == null && carry!=0)){
            //ListNode temp = new ListNode(0);
            total = 0;
            if(l1!=null){
                total += l1.val;
                l1=l1.next;
            }

            if(l2!=null){
                total += l2.val;
                l2 = l2.next;
            }

            total += carry;

            if(total>9) {
                carry = total/10;
            }else{
                carry = 0;
            }

            if(total > 9){
                total = total - 10;
            }

            sum.val = total;

            if(l1!=null || l2!=null || (l1==null && l2 == null && carry!=0)){
                sum.next = new ListNode(0);
                sum = sum.next;
            }



        }

        return head;
    }



        public static int[] stringToIntegerArray(String input) {
            input = input.trim();
            input = input.substring(1, input.length() - 1);
            if (input.length() == 0) {
                return new int[0];
            }

            String[] parts = input.split(",");
            int[] output = new int[parts.length];
            for (int index = 0; index < parts.length; index++) {
                String part = parts[index].trim();
                output[index] = Integer.parseInt(part);
            }
            return output;
        }

        public static ListNode stringToListNode(String input) {
            // Generate array from the input
            int[] nodeValues = stringToIntegerArray(input);

            // Now convert that list into linked list
            ListNode dummyRoot = new ListNode(0);
            ListNode ptr = dummyRoot;
            for (int item : nodeValues) {
                ptr.next = new ListNode(item);
                ptr = ptr.next;
            }
            return dummyRoot.next;
        }

        public static String listNodeToString(ListNode node) {
            if (node == null) {
                return "[]";
            }

            String result = "";
            while (node != null) {
                result += Integer.toString(node.val) + ", ";
                node = node.next;
            }
            return "[" + result.substring(0, result.length() - 2) + "]";
        }

        public static void main(String[] args) throws IOException {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = in.readLine()) != null) {
                ListNode l1 = stringToListNode(line);
                line = in.readLine();
                ListNode l2 = stringToListNode(line);

                ListNode ret = addTwoNumbers(l1, l2);

                String out = listNodeToString(ret);

                System.out.print(out);
            }
        }
    }

