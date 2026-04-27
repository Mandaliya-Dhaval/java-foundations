package day08;

public class EmployeeTest {

    static Employee findMaxSalary(Employee[] employees) {
        if (employees == null || employees.length == 0) return null;

        Employee max = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    static Employee findFirstByDept(Employee[] employees, String dept) {
        if (employees == null || dept == null) return null;

        for (int i = 0; i < employees.length; i++) {
            if (dept.equals(employees[i].getDept())) {
                return employees[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        employees[0] = new Employee(1, "Asha", "QA", 60000);
        employees[1] = new Employee(2, "Ravi", "DEV", 80000);
        employees[2] = new Employee(3, "Meena", "QA", 65000);
        employees[3] = new Employee(4, "John", "UAT", 55000);
        employees[4] = new Employee(5, "Priya", "DEV", 90000);
        employees[5] = new Employee(6, "Tom", "QA", 70000);

        System.out.println("All employees:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        Employee max = findMaxSalary(employees);
        System.out.println("\nHighest salary: " + max);

        Employee firstQA = findFirstByDept(employees, "QA");
        System.out.println("\nFirst QA employee: " + firstQA);
    }
}