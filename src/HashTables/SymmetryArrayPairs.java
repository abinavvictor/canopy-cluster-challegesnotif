package HashTables;
import java.util.*;


public class SymmetryArrayPairs {
    public static List<List<Integer>> findSymmetric(int[][] arr) {

        Set<List<Integer>> lookup = new HashSet<>();
        List<List<Integer>>  list = new ArrayList<>();

        for (int i=0; i< arr.length; i++){
            int first= arr[i][0];
            int second = arr[i][1];

            List<Integer> pair = Arrays.asList(first,second);
            List<Integer> reversePair = Arrays.asList(second, first);

            if(lookup.contains(reversePair)){

                list.add(pair);
                list.add(reversePair);
            }
            else {

                lookup.add(pair);
            }
        }

        return list;
    }
}
