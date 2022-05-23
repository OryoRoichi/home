
public class GreatestComDiv {

    public static void main(String[] args) {
        int first = 451;
        int last = 287;

        int res = greatestComDiv(first, last);
        System.out.println(res);
    }

    static int greatestComDiv(int x, int y) {
        int result = 0;
        while(x!=y){
            if(x>y){
                x= x - y;
            }else{
                y = y-x;

            }
        }
        result=x;
        return result;
    }
}





