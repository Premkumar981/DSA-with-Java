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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currAns = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> main = new ArrayDeque<>();
        Queue<TreeNode> temp = new ArrayDeque<>();

        main.add(root);

        while(main.size() > 0){
            TreeNode currNode = main.remove();
            currAns.add(currNode.val);

            if(currNode.left != null){
                temp.add(currNode.left);
            }
            if(currNode.right != null){
                temp.add(currNode.right);
            }

            if(main.size() == 0){
                ans.add(currAns);
                currAns = new ArrayList<>();

                main = temp;
                temp = new ArrayDeque<>();
            }
        }
        return ans;
    }
}
//premkumarsuru
