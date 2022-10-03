import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    
    public static void main(String[] args) {

        List<Integer> numsList = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        numsList.add(sc.nextInt());
        numsList.add(sc.nextInt());
        numsList.add(sc.nextInt());

        int target = sc.nextInt();

        System.out.println(twoSum(numsList, target));
    }

    /* O(n2) Solution*/
    public static String twoSum(List<Integer> A, int K) {
        for (int i = 0; i < A.size(); i++) {
            for (int j =  i + 1; j < A.size(); j++) {
                int complement = K - A.get(i);

                if (A.get(j) == complement) {
                    return "yes";
                }
            }
        }
        return "no";
    }


    /* O(n) Solution*/
    public static String twoSumMap(List<Integer> A, int K) {
        Map<Integer,Integer> numMap = new HashMap<>();

        for (int i = 0; i < A.size(); i++) {
            int complement = K - A.get(i);

            if (numMap.containsKey(complement)) {
                return "yes";
            }

            numMap.put(A.get(i), i);
        }

        return "no";
    }

}
