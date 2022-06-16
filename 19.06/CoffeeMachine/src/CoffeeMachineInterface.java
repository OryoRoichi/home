public interface CoffeeMachineInterface {
    void start();
    void turnOff();
    Coffee doEspresso();
    Coffee doAmericano();
    void clean();

    void charge();

}
