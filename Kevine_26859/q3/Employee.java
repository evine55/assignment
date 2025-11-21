package Kevine_26859.q3;

import java.util.regex.Pattern;

public class Employee extends Manager {
    private String employeeName;
    private int employeeId;
    private String designation;
    private String contactNumber;
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    
    public Employee(int id, String createdDate, String updatedDate, String companyName,
                   String address, String phoneNumber, String email, String departmentName,
                   String departmentCode, String managerName, String managerEmail, String phone,
                   String employeeName, int employeeId, String designation, String contactNumber) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone);
        if (employeeId <= 0) throw new PayrollDataException("Employee ID must be greater than 0");
        if (contactNumber == null || !PHONE_PATTERN.matcher(contactNumber).matches()) {
            throw new PayrollDataException("Contact number must be exactly 10 digits");
        }
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.designation = designation;
        this.contactNumber = contactNumber;
    }
    
    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) throws PayrollDataException {
        if (employeeId <= 0) throw new PayrollDataException("Employee ID must be greater than 0");
        this.employeeId = employeeId;
    }
    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws PayrollDataException {
        if (contactNumber == null || !PHONE_PATTERN.matcher(contactNumber).matches()) {
            throw new PayrollDataException("Contact number must be exactly 10 digits");
        }
        this.contactNumber = contactNumber;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nEmployee [Name=" + employeeName + ", ID=" + employeeId +
               ", Designation=" + designation + ", Contact=" + contactNumber + "]";
    }
}


