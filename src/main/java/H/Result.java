package H;

public class Result {
    private String robotId;
    private double distanceToGoal;
    private long batteryLevel;

    public String getRobotId() {
        return robotId;
    }

    public void setRobotId(String robotId) {
        this.robotId = robotId;
    }

    public double getDistanceToGoal() {
        return distanceToGoal;
    }

    public void setDistanceToGoal(double distanceToGoal) {
        this.distanceToGoal = distanceToGoal;
    }

    public long getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(long batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
