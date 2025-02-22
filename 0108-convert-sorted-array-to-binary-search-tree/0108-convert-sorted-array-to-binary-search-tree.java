/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
          TreeNode root = sortToBST_r(nums, 0, nums.length - 1);
        return root;
    }
    private TreeNode sortToBST_r(int[] arr, int start, int end) {
        if (start > end) 
            return null;
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode();
        node.val = arr[mid];
        node.left = sortToBST_r(arr, start, mid - 1);
        node.right = sortToBST_r(arr, mid + 1, end);
             return node;
    }
}