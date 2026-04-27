package day08;
/*
Create src/day08/EmployeeTest.java
private fields: id, name, dept, salary
constructor (parameterized)
getters/setters
toString() (recommended) or printDetails()
Create src/day08/Employee.java In main():
create 3 Employee objects
store them in Employee[] employees
print all employees (loop)
print the employee with highest salary
print the first employee from dept "QA" (simple search)
*/
public class Employee {
    private int id;
    private String name;
    private String dept;
    private int salary;

    public Employee(int id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public int getSalary() {
        return salary;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setsalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary + '}';
    }
    }
