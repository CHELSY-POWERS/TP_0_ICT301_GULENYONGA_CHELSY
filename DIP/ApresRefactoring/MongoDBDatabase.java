package DIP.ApresRefactoring;

// Implémentation de bas niveau 2
class MongoDBDatabase implements Database {
    @Override
    public void save(String data) {
        // Correction de la syntaxe des guillemets ici
        System.out.println("Saving to MongoDB: " + data);
    }
}

// Module de haut niveau (Respecte le DIP)
class OrderProcessor {
    private Database database;

    // Injection de dépendance par constructeur
    public OrderProcessor(Database database) {
        this.database = database;
    }

    public void processOrder(String order) {
        database.save(order);
    }
}
