package Kevine_26859.q2;

public class StudentRecord extends Fee {
    private static final String STUDENT_ID = "26859";
    
    public StudentRecord(int id, String createdDate, String updatedDate, String schoolName,
                        String address, String phoneNumber, String email, String departmentName,
                        String departmentCode, String teacherName, String subject,
                        String teacherEmail, String phone, String studentName, int rollNumber,
                        String grade, String contactNumber, String courseName, String courseCode,
                        int creditHours, String examName, double maxMarks, String examDate,
                        double obtainedMarks, String remarks, double tuitionFee, double examFee,
                        double totalFee) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
              departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
              studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours,
              examName, maxMarks, examDate, obtainedMarks, remarks, tuitionFee, examFee, totalFee);
    }
    
    public double calculateAverageMarks() {
        return (getObtainedMarks() / getMaxMarks()) * 100;
    }
    
    @Override
    public String toString() {
        return STUDENT_ID + "\n" + super.toString() + "\n=== CALCULATED AVERAGE MARKS ===" +
               "\nAverage Marks: " + String.format("%.2f", calculateAverageMarks()) + "%";
    }
    
    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            
            System.out.println("=== School Management System ===");
            System.out.println("Student ID: " + STUDENT_ID);
            System.out.println("Enter School Details:");
            
            System.out.print("School ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Created Date: ");
            String createdDate = scanner.nextLine();
            
            System.out.print("Updated Date: ");
            String updatedDate = scanner.nextLine();
            
            System.out.print("School Name: ");
            String schoolName = scanner.nextLine();
            
            System.out.print("Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Phone Number (10 digits): ");
            String phoneNumber = scanner.nextLine();
            
            System.out.print("Email: ");
            String email = scanner.nextLine();
            
            System.out.print("Department Name: ");
            String departmentName = scanner.nextLine();
            
            System.out.print("Department Code: ");
            String departmentCode = scanner.nextLine();
            
            System.out.print("Teacher Name: ");
            String teacherName = scanner.nextLine();
            
            System.out.print("Subject: ");
            String subject = scanner.nextLine();
            
            System.out.print("Teacher Email: ");
            String teacherEmail = scanner.nextLine();
            
            System.out.print("Teacher Phone (10 digits): ");
            String phone = scanner.nextLine();
            
            System.out.print("Student Name: ");
            String studentName = scanner.nextLine();
            
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Grade: ");
            String grade = scanner.nextLine();
            
            System.out.print("Contact Number: ");
            String contactNumber = scanner.nextLine();
            
            System.out.print("Course Name: ");
            String courseName = scanner.nextLine();
            
            System.out.print("Course Code: ");
            String courseCode = scanner.nextLine();
            
            System.out.print("Credit Hours: ");
            int creditHours = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Exam Name: ");
            String examName = scanner.nextLine();
            
            System.out.print("Max Marks: ");
            double maxMarks = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Exam Date: ");
            String examDate = scanner.nextLine();
            
            System.out.print("Obtained Marks: ");
            double obtainedMarks = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Remarks: ");
            String remarks = scanner.nextLine();
            
            System.out.print("Tuition Fee: ");
            double tuitionFee = scanner.nextDouble();
            
            System.out.print("Exam Fee: ");
            double examFee = scanner.nextDouble();
            
            System.out.print("Total Fee: ");
            double totalFee = scanner.nextDouble();
            
            StudentRecord record = new StudentRecord(id, createdDate, updatedDate, schoolName,
                address, phoneNumber, email, departmentName, departmentCode, teacherName, subject,
                teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName,
                courseCode, creditHours, examName, maxMarks, examDate, obtainedMarks, remarks,
                tuitionFee, examFee, totalFee);
            
            System.out.println("\n" + record.toString());
            
            scanner.close();
            
        } catch (SchoolDataException e) {
            System.out.println(STUDENT_ID + " - Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " - Error: " + e.getMessage());
        }
    }
}


