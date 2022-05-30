
public class Glue {

    public static void main(String[] args) {
        String[] array= new String[]{"Без", "труда", "не", "вытащишь", "рыбку", "из", "пруда"};
        String str= adding(array);

        String st = recursivAdding(array,0,"");
        System.out.println(str);
        System.out.println(st);
    }
    static String adding(String[] array){
        String str="";
        for(int i = 0; i< array.length;i++){

            if(i == array.length-1){
                str=str.concat(array[i]+".");
            }
            else {
                str = str.concat(array[i] + " ");
            }
        }
        return str;
    }
    static String recursivAdding(String[] array, int count,String str){
        if(count < array.length){
            if(count == array.length-1){
                str=str.concat(array[count]+".");
            }
            else {
                str = str.concat(array[count] + " ");
            }
            count++;
            return recursivAdding(array,count,str);
        }
        return str;
    }


}





