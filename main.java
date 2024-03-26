import java.util.*;

class Employee implements Comparable<Employee> {
    private int id_number;
    private String name;
    private String role;
    private double monthly_salary;

    public Employee(int id_number, String name, String role, double monthly_salary) {
        this.id_number = id_number;
        this.name = name;
        this.role = role;
        this.monthly_salary = monthly_salary;
    }

    public String getName() {
        return name;
    }

    public double getmonthly_Salary() {
        return monthly_salary;
    }

    public int compareTo(Employee another) {
        int nmcmpr = this.name.compareTo(another.name);
        if (nmcmpr!= 0) {
            return nmcmpr;
        }
        // If names are the same, compare based on monthly_salary
        return Double.compare(this.monthly_salary, another.monthly_salary);
    }

    public String toString() {
        return "ID_number: " + id_number + ", Name: " + name + ", role: " + role + ", monthly_Salary: " + monthly_salary;
    }
}

public class Main {
    public static void_number main(String[] args) {
        LinkedList<Employee> emp = new LinkedList<>();
        emp.add(new Employee(1, "Swathi", "Front end Developer", 20000));
        emp.add(new Employee(2, "Harsha", "Business analyst", 60000));
        emp.add(new Employee(3, "Lilly", "HR Manager", 45000));
        emp.add(new Employee(4, "Thanmaye", "Tester", 55000));
        emp.add(new Employee(5, "Susmi", "Designer", 40000));

        // Sort the list
        Collections.sort(emp);

        // Print the sorted list
        System.out.println("Sort based on the name and monthly_salary:");
        for (Employee employ : emp) {
            System.out.println(employ);
        }
    }
}