package LAB03;
class Employee {
    private String employeeId;
    private String name;
    private double basicSalary;
 
    public Employee(String employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
 
   
    public double getHRA() {
        return basicSalary * 0.20;
    }
 
    
    public double getTCA() {
        return basicSalary * 0.10;
    }
 
  
    public double getGrossSalary() {
        return basicSalary + getHRA() + getTCA();
    }
 
    public void display() {
        System.out.println("Employee ID  : " + employeeId);
        System.out.println("Name         : " + name);
        System.out.printf("Basic Salary : $%.2f%n", basicSalary);
        System.out.printf("HRA (20%%)    : $%.2f%n", getHRA());
        System.out.printf("TCA (10%%)    : $%.2f%n", getTCA());
        System.out.printf("Gross Salary : $%.2f%n", getGrossSalary());
        System.out.println();
    }
}
