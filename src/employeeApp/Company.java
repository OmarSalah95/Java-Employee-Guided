package employeeApp;

public class Company {
    private static int maxID = 0;

    public int id;
    public String name;
    public int debt;

    public Company() {
        maxID++;
        id = maxID;
    }
}