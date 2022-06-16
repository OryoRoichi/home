public class CoffeeMachine implements CoffeeMachineInterface {
    String model;
    int coffeeCapacity;
    int waterCapacity;
    int garbgeCapacity;
    int currentGarbgeAmount;
    int currentWaterAmount=0;
    int currentCoffeeAmount=0;
    boolean isWorking=false;

    public CoffeeMachine(String model, int coffeeCapacity,int waterCapacity, int garbgeCapacity ) {
        this.model=model;
        this.coffeeCapacity=coffeeCapacity;
        this.waterCapacity=waterCapacity;
        this.garbgeCapacity=garbgeCapacity;
        this.currentGarbgeAmount = garbgeCapacity;
    }

    @Override
    public void charge() {
        this.currentCoffeeAmount = coffeeCapacity;
        this.currentWaterAmount = waterCapacity;
    }

    @Override
    public void start() {
        if(isWorking==false){
            this.isWorking=true;
            System.out.println(this.model+" is on");
        }
    }

    @Override
    public void turnOff() {
        if (isWorking==true){
            this.isWorking= false;
            System.out.println(this.model+" is off");
        }
    }

    @Override
    public Coffee doEspresso() {
        if(this.isWorking==true){
            Coffee espresso = new Espresso();
            if(currentWaterAmount<espresso.requeredWaterValue ){
                System.out.println("ERROR: NOT ENOUGH WATER!");
            }
            if(currentCoffeeAmount<espresso.requeredCoffeeValue){
                System.out.println("ERROR: NOT ENOUGH COFFEE!");
            }
            if(currentGarbgeAmount==garbgeCapacity){
                System.out.println("ERROR: THE TRASH CAN IS FULL!");
            }
            if(currentWaterAmount>=espresso.requeredWaterValue && currentCoffeeAmount>=espresso.requeredCoffeeValue && currentGarbgeAmount!=garbgeCapacity){
                currentGarbgeAmount+=espresso.amountGarbageProduced;
                currentCoffeeAmount-=espresso.requeredCoffeeValue;
                currentWaterAmount-=espresso.requeredWaterValue;
                return espresso;
            }
            return null;
        }
        return null;
    }

    @Override
    public Coffee doAmericano() {
        if(this.isWorking==true){
            Coffee americano= new Americano();
            if(currentWaterAmount<americano.requeredWaterValue ){
                System.out.println("ERROR: NOT ENOUGH WATER!");
            }
            if(currentCoffeeAmount<americano.requeredCoffeeValue){
                System.out.println("ERROR: NOT ENOUGH COFFEE!");
            }
            if(currentGarbgeAmount==garbgeCapacity){
                System.out.println("ERROR: THE TRASH CAN IS FULL!");
            }
            if(currentWaterAmount>=americano.requeredWaterValue && currentCoffeeAmount>=americano.requeredCoffeeValue && currentGarbgeAmount!=garbgeCapacity){
                currentGarbgeAmount+=americano.amountGarbageProduced;
                currentCoffeeAmount-=americano.requeredCoffeeValue;
                currentWaterAmount-=americano.requeredWaterValue;
                return americano;
            }
            return null;
        }
        return null;
    }

    @Override
    public void clean() {
        currentGarbgeAmount = 0;
    }
}
