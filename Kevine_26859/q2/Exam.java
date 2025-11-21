package Kevine_26859.q2;

public class Exam extends Course {
    private String examName;
    private double maxMarks;
    private String examDate;
    
    public Exam(int id, String createdDate, String updatedDate, String schoolName,
               String address, String phoneNumber, String email, String departmentName,
               String departmentCode, String teacherName, String subject,
               String teacherEmail, String phone, String studentName, int rollNumber,
               String grade, String contactNumber, String courseName, String courseCode,
               int creditHours, String examName, double maxMarks, String examDate) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
              departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
              studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours);
        
        if (maxMarks <= 0) {
            throw new SchoolDataException("Max marks must be greater than 0");
        }
        if (examDate == null || examDate.trim().isEmpty()) {
            throw new SchoolDataException("Exam date cannot be empty");
        }
        
        this.examName = examName;
        this.maxMarks = maxMarks;
        this.examDate = examDate;
    }
    
    public String getExamName() { return examName; }
    public void setExamName(String examName) { this.examName = examName; }
    
    public double getMaxMarks() { return maxMarks; }
    public void setMaxMarks(double maxMarks) throws SchoolDataException {
        if (maxMarks <= 0) throw new SchoolDataException("Max marks must be greater than 0");
        this.maxMarks = maxMarks;
    }
    
    public String getExamDate() { return examDate; }
    public void setExamDate(String examDate) throws SchoolDataException {
        if (examDate == null || examDate.trim().isEmpty()) {
            throw new SchoolDataException("Exam date cannot be empty");
        }
        this.examDate = examDate;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nExam [Name=" + examName + ", Max Marks=" + maxMarks +
               ", Date=" + examDate + "]";
    }
}


