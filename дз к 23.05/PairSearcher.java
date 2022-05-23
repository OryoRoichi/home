import java.util.Arrays;

public class PairSearcher {
    /**
     * Array can be empty or contain only one value; in this case return 0
     * If there are more pairs of a certain number, count each pair only once. E.g.: for [0, 0, 0, 0]
     * the return value is 2 (= 2 pairs of 0s)
     * Random tests: maximum array length is 1000, range of values in array is between 0 and 1000
     *
     * @param args
     */


    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 20, 6, 20, 2, 6,2};

        int pairCount = pairSearch(array);
        System.out.println(pairCount);
    }

    static int pairSearch(int[] mass){
        int[] array=mass;
        int count=0;

        Arrays.sort(array);

        for (int i=1 ;i< array.length;i++){
            if (array[i-1] == array[i]) {
                count++;
                i++;
            }
        }
        return count;
    }
}


