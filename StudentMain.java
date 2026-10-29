package LAB03;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        final int SUBJECTS = 5;
 

        System.out.print("Enter number of students (N): ");
        int n = input.nextInt();
        input.nextLine(); 
 
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            System.out.print("Student ID : ");
            String id = input.nextLine();
            System.out.print("Name       : ");
            String name = input.nextLine();
 
            double[] marks = new double[SUBJECTS];
            for (int j = 0; j < SUBJECTS; j++) {
                System.out.print("Marks of subject " + (j + 1) + " : ");
                marks[j] = input.nextDouble();
            }
            input.nextLine(); 
 
            students.add(new Student(id, name, marks));
        }
 
        // OUTPUT
        System.out.println("\n===== STUDENT GRADES =====");
        for (Student student : students) {
            student.display();
        }
 
        input.close();
    }
}
