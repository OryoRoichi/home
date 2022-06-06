import java.util.Arrays;
import java.util.Random;

public class Caffee {
    Dishes[] dishes;
    Hall[] halls;

    public Caffee(int hallCount,int tableCount,int dishesCount) {
        this.dishes = new Dishes[dishesCount];
        this.halls = new Hall[hallCount];
        setHall(tableCount);
        setDishes();
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Caffee){
            return ((Caffee) obj).dishes.equals(this.dishes) && ((Caffee) obj).halls.equals(this.halls);
        }
        return false;
    }
    @Override
    public String toString() {
        return "Caffee{" +
                "dishes=" + Arrays.toString(dishes) +'\n'+
                ", halls=" + Arrays.toString(halls) +'\n'+
                '}';
    }

    public Dishes[] getDishes() {
        return dishes;
    }
    public void setDishes() {
        Random random = new Random();
        for(int i= 0 ; i<dishes.length; i++) {
            if(i<(dishes.length/2)-1)
            this.dishes[i] = new First("CУП " + i, random.nextInt(20) );
            if(i>=(dishes.length/2)-1){
                this.dishes[i] = new Second("Котлетка с пюрешкой " + i, random.nextInt(15) );
            }
            if(i>= dishes.length-3){
                this.dishes[i] = new Dessert("Шоколадное мороженое " + i, random.nextInt(10));
            }
        }
    }

    public Hall[] getHalls() {
        return halls;
    }
    private void setHall(int tableCount) {
        for (int i = 0; i < halls.length ; i++) {
            if(i==0){
                this.halls[i] = new Hall(1);
            }
            this.halls[i] = new Hall(tableCount);
        }
    }
}
