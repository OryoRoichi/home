import java.util.Objects;

public class Dishes {
    String name;
    int cost;

    public Dishes(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Блюдо - "+this.name+"; Цена  - "+this.cost+" ; "+'\n';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Dishes){
            return this.name.equals(((Dishes) o).name) && this.cost == ((Dishes) o).cost;
        }
        return false;
    }
    public Dishes[] createMenu(int dishesCount){
        Dishes[] dishes= new Dishes[dishesCount];
        for (int i = 0; i<dishes.length;i++){
            dishes[i]=new Dishes("Блюдо", 9);
        }
        return  dishes;
    }


}
