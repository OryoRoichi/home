public class Main {
    public static void main(String[] args) {
        CoffeeMachineInterface prototype = new CoffeeMachine("prototype",5000,5000,10000);
        System.out.println(prototype.doAmericano());
        System.out.println(prototype.doEspresso());
        prototype.start();
        System.out.println(prototype.doAmericano());
        System.out.println(prototype.doEspresso());
        prototype.charge();
        System.out.println(prototype.doAmericano());
        System.out.println(prototype.doEspresso());
        prototype.clean();
        System.out.println(prototype.doAmericano());
        System.out.println(prototype.doEspresso());
        prototype.turnOff();
        System.out.println(prototype.doAmericano());
        System.out.println(prototype.doEspresso());
    }
}