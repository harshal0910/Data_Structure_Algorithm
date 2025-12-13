// Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.

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

    // Map to store inorder value -> index
    private Map<Integer, Integer> inorderIndexMap;
    private int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        inorderIndexMap = new HashMap<>();

        // Build hashmap for inorder traversal
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        // Start from last index of postorder
        postIndex = postorder.length - 1;

        return buildTreeHelper(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] inorder, int[] postorder,
                                     int inStart, int inEnd) {

        // Base case
        if (inStart > inEnd) {
            return null;
        }

        // Root value from postorder
        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);

        // Root index in inorder
        int rootIndex = inorderIndexMap.get(rootVal);

        // IMPORTANT:
        // Build RIGHT subtree first, then LEFT subtree
        root.right = buildTreeHelper(inorder, postorder, rootIndex + 1, inEnd);
        root.left = buildTreeHelper(inorder, postorder, inStart, rootIndex - 1);

        return root;
    }
}