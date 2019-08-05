package employeeApp;

public class HealthPlan {
    private static int maxID = 0;
    private int id;
    private String name;

    public HealthPlan(String name) {
        maxID++;
        id = maxID;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}