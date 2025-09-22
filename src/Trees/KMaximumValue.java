package Trees;

public class KMaximumValue {

    public static int findKthMax(TreeNode<Integer> root, int k) {
        int[] kValue = { k };
        return kthMaximumRec(root, kValue);
    }
    private static int kthMaximumRec(TreeNode<Integer> node, int[] k) {

        if (node == null) {
            return -1;
        }

        int right = kthMaximumRec(node.right, k);

        if (right != -1) {
            return right;
        }

        k[0]--;

        if (k[0] == 0) {
            return node.data;
        }

        return kthMaximumRec(node.left, k);
    }
}
