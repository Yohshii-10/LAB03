package LAB03;

class Student {
    private String studentId;
    private String name;
    private double[] marks;
 
    public Student(String studentId, String name, double[] marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }
 
  
    public double getTotal() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }
 
    public double getAverage() {
        return getTotal() / marks.length;
    }
 
    public char getGrade() {
        double avg = getAverage();
        if (avg >= 90) {
            return 'A';
        } else if (avg >= 80) {
            return 'B';
        } else if (avg >= 70) {
            return 'C';
        }    else if (avg >= 60) {
                return 'D';
        }    else if (avg >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
 
    public void display() {
        System.out.println("Student ID  : " + studentId);
        System.out.println("Name        : " + name);
        System.out.print("Marks       : ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.printf("Total Marks : %.2f%n", getTotal());
        System.out.printf("Average     : %.2f%n", getAverage());
        System.out.println("Grade       : " + getGrade());
        System.out.println();
    }
}