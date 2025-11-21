package Kevine_26859;

/**
 * Main class to run all 10 OOP exercises
 * Student: Nizeyimana Kevine
 * Student ID: 26859
 */
public class Main {
    private static final String STUDENT_ID = "26859";
    private static final String STUDENT_NAME = "Nizeyimana Kevine";
    
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("OOP Exercises - 10 Class Hierarchies");
        System.out.println("Student ID: " + STUDENT_ID);
        System.out.println("Student Name: " + STUDENT_NAME);
        System.out.println("========================================");
        System.out.println();
        
        try {
            // Question 1: Hospital Management System
            System.out.println("Running Question 1: Hospital Management System...");
            System.out.println("(Note: This will prompt for user input)");
            System.out.println();
            Kevine_26859.q1.HospitalRecord.main(new String[]{});
            System.out.println();
            
            // Question 2: School Management System
            System.out.println("Running Question 2: School Management System...");
            System.out.println("(Note: This will prompt for user input)");
            System.out.println();
            Kevine_26859.q2.StudentRecord.main(new String[]{});
            System.out.println();
            
            // Question 3: Employee Payroll System
            System.out.println("Running Question 3: Employee Payroll System...");
            System.out.println("(Note: This will prompt for user input)");
            System.out.println();
            Kevine_26859.q3.PayrollRecord.main(new String[]{});
            System.out.println();
            
            // Question 4: Hotel Reservation System
            System.out.println("Running Question 4: Hotel Reservation System...");
            System.out.println("(Note: This will prompt for user input)");
            System.out.println();
            Kevine_26859.q4.ReservationRecord.main(new String[]{});
            System.out.println();
            
            // Questions 5-10 will be added as they are implemented
            System.out.println("Questions 5-10: To be implemented");
            System.out.println();
            
        } catch (NoClassDefFoundError e) {
            System.out.println(STUDENT_ID + " - Error: Classes not found. Please compile all Java files first.");
            System.out.println("Run: javac -d . Kevine_26859/q1/*.java Kevine_26859/q2/*.java Kevine_26859/q3/*.java Kevine_26859/q4/*.java Kevine_26859/Main.java");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " - Error running exercises: " + e.getMessage());
            e.printStackTrace();
        }
        
        System.out.println("========================================");
        System.out.println("All exercises completed.");
        System.out.println("========================================");
    }
}
