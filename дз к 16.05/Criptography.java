public class Criptography {
    static String str= "�������� '�' ! ���� ����� �� ���������.";
    static String[] arStr = str.split(" ");
    public static void main(String[] args) {
        int key = 5;
        encript(key);
        print();
        decript(key);
        print();
    }
    static void print(){
        for (int i = 0; i < arStr.length; i++) {
            System.out.print(arStr[i] + " ");
        }
        System.out.print('\n');
    }
    static void encript(int key){
        for (int i = 0; i < arStr.length; i++) {
            char[] word = arStr[i].toCharArray();
            for (int j = 0; j < word.length; j++) {

                if (word[j] >= '�' && word[j] < (char) ('�' + key) || word[j] >= '�' && word[j] < (char) ('�' + key)) {
                    word[j] = (char) (word[j] + key);
                }
            }
            arStr[i] = String.valueOf(word);
        }
    }
    static void decript(int key){
        for (int i = 0; i < arStr.length; i++) {
            char[] word = arStr[i].toCharArray();
            for (int j = 0; j < word.length; j++) {

                if (word[j] >= '�' && word[j] <= (char) ('�' + key) || word[j] >= '�' && word[j] <= (char) ('�' + key)) {
                    word[j] = (char) (word[j] - key);
                }
            }
            arStr[i] = String.valueOf(word);
        }
    }
}
