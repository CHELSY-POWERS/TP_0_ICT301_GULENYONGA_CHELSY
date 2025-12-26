package ISP.ApresRefactoring;

// L'humain fait les deux
class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Les humains travaillent");
    }

    @Override
    public void eat() {
        System.out.println("Les humains mangent");
    }
}

// Le robot ne fait que travailler
class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Les Robots travaillent sans fatigue");
    }
}