import java.util.Random;

public class Coffee {
    Random random= new Random();
    int requeredWaterValue;
    int requeredCoffeeValue;
    int amountGarbageProduced;

    public Coffee(int requeredWaterValue, int requeredCoffeeValue) {

        this.requeredWaterValue = requeredWaterValue;
        this.requeredCoffeeValue = requeredCoffeeValue;
        this.amountGarbageProduced = random.nextInt(requeredCoffeeValue/4);//предположим что обьем создаваемого мусора не должен превышать четверти веса кофе
    }

    @Override
    public String toString() {
        return " {" +
                "requeredWaterValue=" + this.requeredWaterValue +
                ", requeredCoffeeValue=" + this.requeredCoffeeValue +
                '}';
    }
}
