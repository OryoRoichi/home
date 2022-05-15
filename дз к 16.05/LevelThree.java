public class LevelThree {
    static String str= "≈хал грека через реку, сунул грека руку в реку";
    static String[] arStr = str.split(" ");
    public static void main(String[] args) {

        for(int i=0; i<arStr.length;i++){
            if (i%2!=0){
                arStr[i] = arStr[i].toUpperCase();
            }
        }
        print(1);
        print(0);

    }
    static void print(int key) {
        if (key == 1) {
            for (int i = 0; i < arStr.length; i++) {
                System.out.println(arStr[i]);
            }
        }else{
            for (int i = arStr.length - 1; i >= 0; i--) {
                System.out.print(arStr[i] + " ");
            }
        }
    }
}


