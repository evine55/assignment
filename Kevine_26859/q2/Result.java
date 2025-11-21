package Kevine_26859.q2;

public class Result extends Exam {
    private double obtainedMarks;
    private String remarks;
    
    public Result(int id, String createdDate, String updatedDate, String schoolName,
                 String address, String phoneNumber, String email, String departmentName,
                 String departmentCode, String teacherName, String subject,
                 String teacherEmail, String phone, String studentName, int rollNumber,
                 String grade, String contactNumber, String courseName, String courseCode,
                 int creditHours, String examName, double maxMarks, String examDate,
                 double obtainedMarks, String remarks) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
              departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
              studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours,
              examName, maxMarks, examDate);
        
        if (obtainedMarks < 0) {
            throw new SchoolDataException("Obtained marks cannot be negative");
        }
        if (remarks == null || remarks.trim().isEmpty()) {
            throw new SchoolDataException("Remarks cannot be empty");
        }
        
        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
    }
    
    public double getObtainedMarks() { return obtainedMarks; }
    public void setObtainedMarks(double obtainedMarks) throws SchoolDataException {
        if (obtainedMarks < 0) throw new SchoolDataException("Obtained marks cannot be negative");
        this.obtainedMarks = obtainedMarks;
    }
    
    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) throws SchoolDataException {
        if (remarks == null || remarks.trim().isEmpty()) {
            throw new SchoolDataException("Remarks cannot be empty");
        }
        this.remarks = remarks;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nResult [Obtained Marks=" + obtainedMarks + ", Remarks=" + remarks + "]";
    }
}


