package Trees;

import java.util.ArrayList;
import java.util.List;

public class AncestorsofBST {

    public static List<Integer> findAncestors(TreeNode<Integer> root, int k) {

        List<Integer> result = new ArrayList<>();
        recfindAncestors(root, k, result);
        return result;

    }

        public static boolean recfindAncestors(TreeNode<Integer> root, int k, List<Integer> result){

            if(root== null) return false;
            else if(root.data == k) return true;


            boolean recurleft = recfindAncestors(root.left, k, result);

            if(recurleft) {
                result.add(root.data);
                return true;
            }
            boolean recurright = recfindAncestors(root.right, k, result);

            if(recurright) {

                result.add(root.data);
                return true;

            }

            return false;

        }
    }
