
public class NoFive {

    public static void main(String[] args) {
        int first = 4;
        int last = 17;

        int res = dontGiveMeFive(first, last);
        System.out.println(res);
    }

    static int dontGiveMeFive(int first, int last) {
        int result = 0;
        for (int i = first; i < last + 1; i++) {
            if (!String.valueOf(i).contains("5")) {
                result++;
            }
        }
        return result;
    }
}





