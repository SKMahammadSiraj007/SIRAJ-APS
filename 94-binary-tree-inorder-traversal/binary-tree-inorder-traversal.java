class Solution {
    public static void helper(List<Integer> arr, TreeNode root){
        if(root == null)return;
        helper(arr, root.left);
        arr.add(root.val);
        helper(arr, root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        helper(arr, root);
        return arr;
    }
}