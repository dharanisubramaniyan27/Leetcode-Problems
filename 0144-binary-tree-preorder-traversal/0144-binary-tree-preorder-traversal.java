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
    List<Integer> preOrderList = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
         preOrderRecursive(root);
        return preOrderList;
    }
    private void preOrderRecursive(TreeNode root) {
        if(root == null) return;
        preOrderList.add(root.val);
        preOrderRecursive(root.left);    
        preOrderRecursive(root.right);
    }
}