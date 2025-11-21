package Kevine_26859.q3;

import java.util.regex.Pattern;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;
    
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    
    public Company(int id, String createdDate, String updatedDate, String companyName,
                  String address, String phoneNumber, String email) throws PayrollDataException {
        super(id, createdDate, updatedDate);
        if (phoneNumber == null || !PHONE_PATTERN.matcher(phoneNumber).matches()) {
            throw new PayrollDataException("Phone number must be exactly 10 digits");
        }
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new PayrollDataException("Invalid email format");
        }
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws PayrollDataException {
        if (phoneNumber == null || !PHONE_PATTERN.matcher(phoneNumber).matches()) {
            throw new PayrollDataException("Phone number must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() { return email; }
    public void setEmail(String email) throws PayrollDataException {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new PayrollDataException("Invalid email format");
        }
        this.email = email;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCompany [Name=" + companyName + ", Address=" + address +
               ", Phone=" + phoneNumber + ", Email=" + email + "]";
    }
}


