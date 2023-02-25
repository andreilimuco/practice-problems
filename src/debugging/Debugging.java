package debugging;

import java.util.*;

public class Debugging {
    public static void main(String[] args) {
        Debugging d1 = new Debugging();
        List<Integer> li = List.of(5,-13,41,5413);
        List<String> ls = List.of("Aa", "cad", "dada");
        System.out.println(Arrays.toString(d1.getComputedHashCodes(li)));
        System.out.println(Arrays.toString(d1.getComputedHashCodes(ls)));
    }


    /**
     Reads a list of objects and returns an array of all the computed hashCode of valid objects, and returns empty if there are no valid objects computed. Method signature cannot be changed

     The function works as-is but will not always satisfy the given requirement

     Assumed targets required to be fixed: 3
     */
    public int[] getComputedHashCodes(List<?> objects) {

        int[] hashes = new int[objects.size()];

        int i = 0;
        for (Object object : objects) {
            hashes[i++] = object.hashCode();
        }

        return hashes;

    }
}