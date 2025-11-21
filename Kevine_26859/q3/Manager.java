package Kevine_26859.q3;

import java.util.regex.Pattern;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phone;
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    
    public Manager(int id, String createdDate, String updatedDate, String companyName,
                  String address, String phoneNumber, String email, String departmentName,
                  String departmentCode, String managerName, String managerEmail, String phone) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode);
        if (managerName == null || managerName.trim().isEmpty()) {
            throw new PayrollDataException("Manager name cannot be empty");
        }
        if (managerEmail == null || !EMAIL_PATTERN.matcher(managerEmail).matches()) {
            throw new PayrollDataException("Invalid manager email format");
        }
        if (phone == null || !PHONE_PATTERN.matcher(phone).matches()) {
            throw new PayrollDataException("Phone must be exactly 10 digits");
        }
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.phone = phone;
    }
    
    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) throws PayrollDataException {
        if (managerName == null || managerName.trim().isEmpty()) {
            throw new PayrollDataException("Manager name cannot be empty");
        }
        this.managerName = managerName;
    }
    public String getManagerEmail() { return managerEmail; }
    public void setManagerEmail(String managerEmail) throws PayrollDataException {
        if (managerEmail == null || !EMAIL_PATTERN.matcher(managerEmail).matches()) {
            throw new PayrollDataException("Invalid manager email format");
        }
        this.managerEmail = managerEmail;
    }
    public String getPhone() { return phone; }
    public void setPhone(String phone) throws PayrollDataException {
        if (phone == null || !PHONE_PATTERN.matcher(phone).matches()) {
            throw new PayrollDataException("Phone must be exactly 10 digits");
        }
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nManager [Name=" + managerName + ", Email=" + managerEmail + ", Phone=" + phone + "]";
    }
}


