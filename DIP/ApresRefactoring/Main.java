package DIP.ApresRefactoring;

public class Main {
    public static void main(String[] args) {

        // Utilisation de MySQL
        Database database = new MySQLDatabase();
        OrderProcessor order = new OrderProcessor(database);
        order.processOrder("Données à sauvegarder via MySQL");

        // Utilisation de MongoDB (sans modifier OrderProcessor)
        database = new MongoDBDatabase();
        OrderProcessor order1 = new OrderProcessor(database);
        order1.processOrder("Données à sauvegarder via MongoDB");
    }
}
