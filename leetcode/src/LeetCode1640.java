//import java.util.HashMap;
//import java.util.Map;
//
//
//class Node{
//
//
//    int val;
//    NNode next;
//
//    Node(int val){
//        this.val = val;
//    }
//
//
//}
//
//public class LeetCode1640 {
//    static String s1;
//    String s2;
//    public static void main(String[] args) {
//        NNode head = new NNode(0);
//        NNode temp = head;
//        for(int i=1; i<10; i++){
//            temp.next = new NNode(i);
//            temp = temp.next;
//        }
//
//        NNode temp1 = head;
//        while (temp1 != null) {
//            System.out.println(temp1.val);
//            temp1 = temp1.next;
//        }
//
//    }
//
//    public NNode reverseLinkedList(NNode node){
//
//        if (node.next == null){
//            return node;
//        }
//
//
//
//        return null;
//    }
//
//    class Solution {
//        public boolean canFormArray(int[] arr, int[][] pieces) {
//
//            int n = arr.length, m = pieces.length;
//            Map<Integer, Integer> map = new HashMap<>();
//            for(int i = 0; i < m; i++) {
//                map.put(pieces[i][0],i);
//            }
//            for(int i = 0;i < n; ) {
//                if(!map.containsKey(arr[i]))
//                    return false;
//                int j = map.get(arr[i]),len = pieces[j].length;
//                for(int k = 0; k < len; k++) {
//                    if(arr[i + k] != pieces[j][k])
//                        return false;
//                }
//                i+= len;
//            }
//            return true;
//
//        }
//    }
//
//}
