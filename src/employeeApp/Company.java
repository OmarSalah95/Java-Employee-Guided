package employeeApp;

import org.w3c.dom.NameList;

public class Company {
    private static int maxID = 0;

    public int id;
    public String name;
    public int debt;

    public Company(String name, int debt) {
        maxID++;
        id = maxID;

        this.id = id;
        this.name = name;
        this.debt = debt;
    }
}