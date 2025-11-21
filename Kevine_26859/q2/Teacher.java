package Kevine_26859.q2;

import java.util.regex.Pattern;

public class Teacher extends Department {
    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;
    
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    
    public Teacher(int id, String createdDate, String updatedDate, String schoolName,
                  String address, String phoneNumber, String email, String departmentName,
                  String departmentCode, String teacherName, String subject,
                  String teacherEmail, String phone) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
              departmentName, departmentCode);
        
        if (subject == null || subject.trim().isEmpty()) {
            throw new SchoolDataException("Subject cannot be empty");
        }
        if (teacherEmail == null || !EMAIL_PATTERN.matcher(teacherEmail).matches()) {
            throw new SchoolDataException("Invalid teacher email format");
        }
        if (phone == null || !PHONE_PATTERN.matcher(phone).matches()) {
            throw new SchoolDataException("Teacher phone must be exactly 10 digits");
        }
        
        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }
    
    public String getTeacherName() { return teacherName; }
    public void setTeacherName(String teacherName) { this.teacherName = teacherName; }
    
    public String getSubject() { return subject; }
    public void setSubject(String subject) throws SchoolDataException {
        if (subject == null || subject.trim().isEmpty()) {
            throw new SchoolDataException("Subject cannot be empty");
        }
        this.subject = subject;
    }
    
    public String getTeacherEmail() { return teacherEmail; }
    public void setTeacherEmail(String teacherEmail) throws SchoolDataException {
        if (teacherEmail == null || !EMAIL_PATTERN.matcher(teacherEmail).matches()) {
            throw new SchoolDataException("Invalid teacher email format");
        }
        this.teacherEmail = teacherEmail;
    }
    
    public String getPhone() { return phone; }
    public void setPhone(String phone) throws SchoolDataException {
        if (phone == null || !PHONE_PATTERN.matcher(phone).matches()) {
            throw new SchoolDataException("Teacher phone must be exactly 10 digits");
        }
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTeacher [Name=" + teacherName + ", Subject=" + subject +
               ", Email=" + teacherEmail + ", Phone=" + phone + "]";
    }
}


