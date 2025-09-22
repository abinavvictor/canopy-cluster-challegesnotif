package Trees;

public class MinValINBST {

    public static int minVale(TreeNode<Integer> root){

        if(root ==null) return -1;

        TreeNode<Integer> current = root;

        while(current.left != null){

            current = current.left;
        }

        return current.data;
    }
}
