package thursday_lab;

public class VanillaCoffee extends Thread {
    private CoffeeMachine coffeeMachine;
    private String user;
    private int q;

    public VanillaCoffee(String user, int q, CoffeeMachine cm) {
        super(user + "-v-Thread");
        this.user = user;
        this.q = q;
        this.coffeeMachine = cm;
    }

    
    public void run() {
        coffeeMachine.brewCoffee(user, "v", q);
    }
}
