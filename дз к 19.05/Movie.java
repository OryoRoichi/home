public class Movie {



    public static void main(String[] args) {
        int card=100;
        int ticket=10;
        double perc=0.95;
        double count = Math.ceil(movie(card,ticket,perc));
        double firstSystemValue= firstSystem(ticket,count);
        double secondSystemValue= secondSystem(card,ticket,perc,count);
        System.out.println(count +" in System A = "+firstSystemValue);
        System.out.println(count +" in System B = "+Math.ceil(secondSystemValue));



    }
    public static double  firstSystem(int ticket, double count){

        double firstSystemValue=ticket * count;

        return firstSystemValue;
    }

    public static double  secondSystem(int card, int ticket, double perc, double count){
        double secondSystemValue= ticket* ((1- Math.pow(perc,count+1))/(1-perc))+ card- ticket;
        //card + count*(ticket*Math.pow(perc,count));

        return secondSystemValue;
    }

    public static double movie(int card,int ticket,double perc){

        double count=  (ticket/(1-perc))-ticket+card;
        count= count/ticket;


        return count;
    }

}
