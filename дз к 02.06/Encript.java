
public class Encript {
    static String[] alph =new String[]{ "a", "b", "c", "d", "e",
            "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z"};

    public static void main(String[] args) {

        String messege ="scout";
        int key = 1939;
        System.out.println(crr(messege,key));
        recHelper(messege,key);
    }

    static String crr(String str,int key){
        String[] array = str.split( "");
        String[] keyArr = String.valueOf(key).split("");
        String  newStr="";
        int strCount= 0;
        int keyCount=0;

        for(int i = 0;i<array.length;i++){
            for(int j = 0; j < alph.length; j++){
                if (array[i].matches(alph[j])){
                    array[i]=String.valueOf(j+1);
                }
            }
        }
        while(strCount < array.length){
            if(strCount>=keyArr.length){
                keyCount= 0;
            }
            array[strCount]=String.valueOf(Integer.valueOf(array[strCount]) +Integer.valueOf(keyArr[keyCount]));
            strCount++;
            keyCount++;
        }

        for(int i =0; i < array.length;i++){
            if (i == array.length-1){
                newStr= newStr.concat(array[i]+".");
            }else {
                newStr= newStr.concat(array[i] + ", ");
            }
        }
        return newStr;
    }
    static void recHelper(String str, int key){
        int[] result = new int[str.length()];
        String keyStr= String.valueOf(key);
        char[] keyArr= new char[keyStr.length()];
        char[] newStr= new char[str.length()];

        while (keyStr.length() <= str.length())
        {
            keyStr = keyStr.concat(keyStr);
        }

        keyArr= keyStr.toCharArray();
        newStr= str.toCharArray();

        result=rec(keyArr,newStr,0,result,0);

        for(int elem : result){
            System.out.println(elem);
        }

    }
    static int[] rec(char[] keyArr, char[] newStr, int count, int[] result, int sum){
        if(count<newStr.length){
        sum+= (newStr[count]-'a')+1;
        sum+= keyArr[count] - '0';
        result[count]=sum;

        return rec(keyArr,newStr,++count,result,0);
        }
        return result;
    }

}
