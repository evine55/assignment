package Kevine_26859.q1;

import java.util.regex.Pattern;

public class Patient extends Nurse {
    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;
    
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    
    public Patient(int id, String createdDate, String updatedDate, String hospitalName,
                  String address, String phoneNumber, String email, String departmentName,
                  String departmentCode, String doctorName, String specialization,
                  String doctorEmail, String phone, String nurseName, String shift,
                  int yearsOfExperience, String patientName, int age, String gender,
                  String contactNumber) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
              departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
              nurseName, shift, yearsOfExperience);
        
        if (age <= 0) {
            throw new HospitalDataException("Age must be greater than 0");
        }
        if (gender == null || (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Other"))) {
            throw new HospitalDataException("Gender must be 'Male', 'Female', or 'Other'");
        }
        
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }
    
    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    
    public int getAge() { return age; }
    public void setAge(int age) throws HospitalDataException {
        if (age <= 0) throw new HospitalDataException("Age must be greater than 0");
        this.age = age;
    }
    
    public String getGender() { return gender; }
    public void setGender(String gender) throws HospitalDataException {
        if (gender == null || (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Other"))) {
            throw new HospitalDataException("Gender must be 'Male', 'Female', or 'Other'");
        }
        this.gender = gender;
    }
    
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    
    @Override
    public String toString() {
        return super.toString() + "\nPatient [Name=" + patientName + ", Age=" + age +
               ", Gender=" + gender + ", Contact=" + contactNumber + "]";
    }
}


