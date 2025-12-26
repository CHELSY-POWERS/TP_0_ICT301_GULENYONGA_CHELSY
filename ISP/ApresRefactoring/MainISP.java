package ISP.ApresRefactoring;

public class MainISP {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();

        RobotWorker robot = new RobotWorker();
        robot.work();
        // robot.eat(); // Cette ligne ne compilerait plus, ce qui est correct !
    }
}
