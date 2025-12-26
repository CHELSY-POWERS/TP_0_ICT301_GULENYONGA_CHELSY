package DIP.AvantRefactoring;

class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

class OrderProcessor {
    private MySQLDatabase database;

    public OrderProcessor() {
        // Violation: OrderProcessor depends directly on the low-level MySQLDatabase
        this.database = new MySQLDatabase();
    }

    public void processOrder(String order) {
        database.save(order);
    }
}
