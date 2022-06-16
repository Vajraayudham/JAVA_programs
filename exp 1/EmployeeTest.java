

public class EmployeeTest {
    public static void main(String[] args) {
        Employee obj1 = new Employee("A", "B", 1234);
        Employee obj2 = new Employee("X", "Y", 5678);
        System.out.println(obj1.getFirstName() + "'s monthly salary is " + obj1.getMonthlySalary());
        System.out.println(obj2.getFirstName() + "'s monthly salary is " + obj2.getMonthlySalary());
        obj1.setMonthlySalary(obj1.getMonthlySalary() * 1.1);
        obj2.setMonthlySalary(obj2.getMonthlySalary() * 1.1);
        System.out.println("Salary after 10% raise");
        System.out.println(obj1.getFirstName() + "'s monthly salary is " + obj1.getMonthlySalary());
        System.out.println(obj2.getFirstName() + "'s monthly salary is " + obj2.getMonthlySalary());
    }
}