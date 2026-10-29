package LAB03;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
 
     
        System.out.print("Enter number of employees (N): ");
        int n = input.nextInt();
        input.nextLine(); 
 
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Employee " + (i + 1) + " ---");
            System.out.print("Employee ID  : ");
            String id = input.nextLine();
            System.out.print("Name         : ");
            String name = input.nextLine();
            System.out.print("Basic Salary : ");
            double basic = input.nextDouble();
            input.nextLine(); 
 
            employees.add(new Employee(id, name, basic));
        }
 
     
        System.out.println("\n===== EMPLOYEE SALARY DETAILS =====");
        for (Employee emp : employees) {
            emp.display();
        }
 
        input.close();
    }
}