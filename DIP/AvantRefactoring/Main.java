package DIP.AvantRefactoring;

public class Main {
    public static void main(String[] args) {
        OrderProcessor order = new OrderProcessor();
        // Fixed the method name to match "processOrder"
        order.processOrder("'Données à sauvegarder'");
    }
}
