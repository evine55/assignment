package Kevine_26859.q2;

public class Student extends Teacher {
    private String studentName;
    private int rollNumber;
    private String grade;
    private String contactNumber;
    
    public Student(int id, String createdDate, String updatedDate, String schoolName,
                  String address, String phoneNumber, String email, String departmentName,
                  String departmentCode, String teacherName, String subject,
                  String teacherEmail, String phone, String studentName, int rollNumber,
                  String grade, String contactNumber) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
              departmentName, departmentCode, teacherName, subject, teacherEmail, phone);
        
        if (rollNumber <= 0) {
            throw new SchoolDataException("Roll number must be greater than 0");
        }
        if (grade == null || grade.trim().isEmpty()) {
            throw new SchoolDataException("Grade cannot be empty");
        }
        
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }
    
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    
    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) throws SchoolDataException {
        if (rollNumber <= 0) throw new SchoolDataException("Roll number must be greater than 0");
        this.rollNumber = rollNumber;
    }
    
    public String getGrade() { return grade; }
    public void setGrade(String grade) throws SchoolDataException {
        if (grade == null || grade.trim().isEmpty()) {
            throw new SchoolDataException("Grade cannot be empty");
        }
        this.grade = grade;
    }
    
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    
    @Override
    public String toString() {
        return super.toString() + "\nStudent [Name=" + studentName + ", Roll Number=" + rollNumber +
               ", Grade=" + grade + ", Contact=" + contactNumber + "]";
    }
}


