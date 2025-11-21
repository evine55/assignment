package Kevine_26859.q1;

import java.util.regex.Pattern;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;
    
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    
    public Hospital(int id, String createdDate, String updatedDate, String hospitalName, 
                   String address, String phoneNumber, String email) throws HospitalDataException {
        super(id, createdDate, updatedDate);
        
        if (phoneNumber == null || !PHONE_PATTERN.matcher(phoneNumber).matches()) {
            throw new HospitalDataException("Phone number must be exactly 10 digits");
        }
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new HospitalDataException("Invalid email format");
        }
        
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws HospitalDataException {
        if (phoneNumber == null || !PHONE_PATTERN.matcher(phoneNumber).matches()) {
            throw new HospitalDataException("Phone number must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail() { return email; }
    public void setEmail(String email) throws HospitalDataException {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new HospitalDataException("Invalid email format");
        }
        this.email = email;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nHospital [Name=" + hospitalName + ", Address=" + address + 
               ", Phone=" + phoneNumber + ", Email=" + email + "]";
    }
}


