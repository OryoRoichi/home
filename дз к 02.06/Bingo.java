import java.util.Random;

public class Bingo {

    public static void main(String[] args) {
        int[] numberArray = new int[10];
        Random random =new Random();
        for(int i =0; i< numberArray.length;i++){
            numberArray[i]=random.nextInt(26);
        }
        System.out.println(bingo(numberArray));
        System.out.println(recHelper(numberArray));
    }
    /**
     * b=2 i=9 n=14 g=7 o=15
     */
    public static String bingo(int[] numberArray){
        for(int elem: numberArray){
            System.out.print(elem+" ");
        }
        System.out.println();
        int bingoCount= 0;
        for(int i = 0; i < numberArray.length; i++){
            if (numberArray[i]==2){
                bingoCount++;
                break;
            }
        }
        for(int i = 0; i < numberArray.length; i++){
            if (numberArray[i]==9){
                bingoCount++;
                break;
            }
        }
        for(int i = 0; i < numberArray.length; i++){
            if (numberArray[i]==14){
                bingoCount++;
                break;
            }
        }
        for(int i = 0; i < numberArray.length; i++){
            if (numberArray[i]==7){
                bingoCount++;
                break;
            }
        }
        for(int i = 0; i < numberArray.length; i++){
            if (numberArray[i]==15){
                bingoCount++;
                break;
            }
        }
        System.out.println(bingoCount);
        if(bingoCount==5){
            return "WIN";
        }else{
            return "LOSE";
        }
    }
    static String recHelper(int[] numberArray){
        int bingoCount= 0 ;
        for(int elem: numberArray){
            System.out.print(elem+" ");
        }
        System.out.println();
        bingoCount=rec(numberArray,0,bingoCount,2 );
        bingoCount=rec(numberArray,0,bingoCount,9 );
        bingoCount=rec(numberArray,0,bingoCount,14 );
        bingoCount=rec(numberArray,0,bingoCount,7 );
        bingoCount=rec(numberArray,0,bingoCount,15 );
        System.out.println(bingoCount);

        if(bingoCount==5){
            return "WIN";
        }else{
            return "LOSE";
        }
    }
    static int rec(int[] numb,int count,int bingo, int macGuffin){
        if(count< numb.length){
          if(numb[count]==macGuffin) {
              bingo++;
              return bingo;
          }
          count++;
          return rec(numb,count,bingo,macGuffin);
        }
        return bingo;
    }
}
