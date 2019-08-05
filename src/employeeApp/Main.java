package employeeApp;

public class Main {

    public static void workWithData() {
        HealthPlan h1 = new HealthPlan("my first Health plan");
        HealthPlan h2 = new HealthPlan("my Second Health plan");

        Company c1 = new Company("Tesla", 1200000);

        Employee emp1 = new Employee("omar", "salah", 1000000000, true, c1.id, h2.getId());

        System.out.println("*** Print My Stuff***");
        System.out.println(emp1);
    }

    public static void main(String[] args) {
        workWithData();
    }
}