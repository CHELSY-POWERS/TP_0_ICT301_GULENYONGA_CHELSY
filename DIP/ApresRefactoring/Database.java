package DIP.ApresRefactoring;

// L'abstraction (Interface)
interface Database {
    void save(String data);
}

// Implémentation de bas niveau 1
class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}
