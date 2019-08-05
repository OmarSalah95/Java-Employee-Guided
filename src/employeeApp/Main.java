package employeeApp;

public class Main {

    public static void workWithData() {
        HealthPlan h1 = new HealthPlan("my first Health plan");
        HealthPlan h2 = new HealthPlan("my Second Health plan");

        Company c1 = new Company("Tesla", 1200000);

        Employee emp1 = new Employee("omar", "salah", 1000000000, true, c1.id, h2.getId());

        System.out.println("*** Print My Stuff***");
        System.out.println(emp1);

        System.out.println("*** Number Data Type***");
        System.out.println("Original divided 5 " + (c1.debt / 5));
        System.out.println("Original mod 2     " + (c1.debt % 2));
        System.out.println("Original divided 7 " + (c1.debt / 7));
        System.out.println("Original divided 7 " + (c1.debt / 7.0));
        System.out.println("Original divided 7 " + ((double) c1.debt / 7));
        System.out.println();
        String myStr = "100";
        System.out.println("Debt: " + myStr + c1.debt);
        System.out.println("Debt: " + Integer.parseInt(myStr) + c1.debt);

    }

    public static void main(String[] args) {
        workWithData();
    }
}