package Kevine_26859.q2;

import java.util.regex.Pattern;

public class School extends Entity {
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;
    
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    
    public School(int id, String createdDate, String updatedDate, String schoolName,
                 String address, String phoneNumber, String email) throws SchoolDataException {
        super(id, createdDate, updatedDate);
        
        if (phoneNumber == null || !PHONE_PATTERN.matcher(phoneNumber).matches()) {
            throw new SchoolDataException("Phone number must be exactly 10 digits");
        }
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new SchoolDataException("Invalid email format");
        }
        
        this.schoolName = schoolName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public String getSchoolName() { return schoolName; }
    public void setSchoolName(String schoolName) { this.schoolName = schoolName; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws SchoolDataException {
        if (phoneNumber == null || !PHONE_PATTERN.matcher(phoneNumber).matches()) {
            throw new SchoolDataException("Phone number must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail() { return email; }
    public void setEmail(String email) throws SchoolDataException {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new SchoolDataException("Invalid email format");
        }
        this.email = email;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSchool [Name=" + schoolName + ", Address=" + address +
               ", Phone=" + phoneNumber + ", Email=" + email + "]";
    }
}


