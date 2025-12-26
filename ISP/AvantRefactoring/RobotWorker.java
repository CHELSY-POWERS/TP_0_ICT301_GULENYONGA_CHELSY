package ISP.AvantRefactoring;

class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Les Robots travaillent sans fatigue");
    }

    @Override
    public void eat() {
        // This violates ISP because the robot is forced to implement a method it doesn't need
        throw new UnsupportedOperationException("Les Robots ne mangent pas");
    }
}
