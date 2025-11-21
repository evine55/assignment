package Kevine_26859.q1;

import java.util.regex.Pattern;

public class Department extends Hospital {
    private String departmentName;
    private String departmentCode;
    
    private static final Pattern CODE_PATTERN = Pattern.compile("^[A-Za-z0-9]{3,}$");
    
    public Department(int id, String createdDate, String updatedDate, String hospitalName,
                     String address, String phoneNumber, String email, String departmentName,
                     String departmentCode) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email);
        
        if (departmentCode == null || !CODE_PATTERN.matcher(departmentCode).matches()) {
            throw new HospitalDataException("Department code must be alphanumeric and at least 3 characters");
        }
        
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
    
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    
    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) throws HospitalDataException {
        if (departmentCode == null || !CODE_PATTERN.matcher(departmentCode).matches()) {
            throw new HospitalDataException("Department code must be alphanumeric and at least 3 characters");
        }
        this.departmentCode = departmentCode;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nDepartment [Name=" + departmentName + ", Code=" + departmentCode + "]";
    }
}


