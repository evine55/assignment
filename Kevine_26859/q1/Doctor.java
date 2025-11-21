package Kevine_26859.q1;

import java.util.regex.Pattern;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;
    
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    
    public Doctor(int id, String createdDate, String updatedDate, String hospitalName,
                 String address, String phoneNumber, String email, String departmentName,
                 String departmentCode, String doctorName, String specialization,
                 String doctorEmail, String phone) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
              departmentName, departmentCode);
        
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new HospitalDataException("Specialization cannot be empty");
        }
        if (doctorEmail == null || !EMAIL_PATTERN.matcher(doctorEmail).matches()) {
            throw new HospitalDataException("Invalid doctor email format");
        }
        if (phone == null || !PHONE_PATTERN.matcher(phone).matches()) {
            throw new HospitalDataException("Doctor phone must be exactly 10 digits");
        }
        
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }
    
    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }
    
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) throws HospitalDataException {
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new HospitalDataException("Specialization cannot be empty");
        }
        this.specialization = specialization;
    }
    
    public String getDoctorEmail() { return doctorEmail; }
    public void setDoctorEmail(String doctorEmail) throws HospitalDataException {
        if (doctorEmail == null || !EMAIL_PATTERN.matcher(doctorEmail).matches()) {
            throw new HospitalDataException("Invalid doctor email format");
        }
        this.doctorEmail = doctorEmail;
    }
    
    public String getPhone() { return phone; }
    public void setPhone(String phone) throws HospitalDataException {
        if (phone == null || !PHONE_PATTERN.matcher(phone).matches()) {
            throw new HospitalDataException("Doctor phone must be exactly 10 digits");
        }
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nDoctor [Name=" + doctorName + ", Specialization=" + specialization +
               ", Email=" + doctorEmail + ", Phone=" + phone + "]";
    }
}


