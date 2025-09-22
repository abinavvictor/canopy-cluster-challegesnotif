package Trees;

public class maxHeight {

    public static int maxHeight(TreeNode<Integer> root) {

        if (root == null)

            return -1;

        else {

            int subtreeHeight = Math.max(maxHeight(root.left), maxHeight(root.right));

            return 1 + subtreeHeight;
        }
    }
}
