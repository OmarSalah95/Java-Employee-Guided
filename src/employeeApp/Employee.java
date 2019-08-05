package employeeApp;

public class Employee {
    // Objects Data fields or State
    private int id;
    private static int maxID = 0;
    private String fname;
    private String lname;
    private double salary;
    private boolean has401K;
    private int companyID;
    private int healthPlanID;

    // Construct
    public Employee(String fname, String lname, double salary, boolean has401K, int companyID, int healthPlanID) {
        maxID++;
        id = maxID;

        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401K = has401K;
        this.companyID = companyID;
        this.healthPlanID = healthPlanID;
    }

    // Methods
    // Getters && Setters
    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean getHas401K()

    {
        return has401K;
    }

    public void setHas401K(boolean has401K) {
        this.has401K = has401K;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getHealthPlanID() {
        return healthPlanID;
    }

    public void setHealthPlanID(int healthPlanID) {
        this.healthPlanID = healthPlanID;
    }

    // Standard Action Methods/Behaviors
    public String getName() {
        return fname + " " + lname;
    }

    public void giveRaise(double raise) {
        double raiseAmt;
        raise = salary * raise;
        salary += raise;
    }
}