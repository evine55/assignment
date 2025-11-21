package Kevine_26859.q3;

public class PayrollRecord extends Salary {
    private static final String STUDENT_ID = "26859";
    
    public PayrollRecord(int id, String createdDate, String updatedDate, String companyName,
                        String address, String phoneNumber, String email, String departmentName,
                        String departmentCode, String managerName, String managerEmail, String phone,
                        String employeeName, int employeeId, String designation, String contactNumber,
                        int totalDays, int presentDays, int leaveDays,
                        double housingAllowance, double transportAllowance,
                        double taxDeduction, double loanDeduction,
                        double basicSalary, double grossSalary, double netSalary) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays, housingAllowance, transportAllowance, taxDeduction, loanDeduction, basicSalary, grossSalary, netSalary);
    }
    
    public double calculateNetSalary() {
        return getBasicSalary() + getHousingAllowance() + getTransportAllowance() - getTaxDeduction() - getLoanDeduction();
    }
    
    @Override
    public String toString() {
        return STUDENT_ID + "\n" + super.toString() + "\n=== CALCULATED NET SALARY ===" +
               "\nCalculated Net Salary: " + String.format("%.2f", calculateNetSalary());
    }
    
    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("=== Employee Payroll System ===");
            System.out.println("Student ID: " + STUDENT_ID);
            System.out.print("Company ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Created Date: ");
            String createdDate = scanner.nextLine();
            System.out.print("Updated Date: ");
            String updatedDate = scanner.nextLine();
            System.out.print("Company Name: ");
            String companyName = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Phone Number (10 digits): ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Department Name: ");
            String departmentName = scanner.nextLine();
            System.out.print("Department Code: ");
            String departmentCode = scanner.nextLine();
            System.out.print("Manager Name: ");
            String managerName = scanner.nextLine();
            System.out.print("Manager Email: ");
            String managerEmail = scanner.nextLine();
            System.out.print("Manager Phone (10 digits): ");
            String phone = scanner.nextLine();
            System.out.print("Employee Name: ");
            String employeeName = scanner.nextLine();
            System.out.print("Employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Designation: ");
            String designation = scanner.nextLine();
            System.out.print("Contact Number (10 digits): ");
            String contactNumber = scanner.nextLine();
            System.out.print("Total Days: ");
            int totalDays = scanner.nextInt();
            System.out.print("Present Days: ");
            int presentDays = scanner.nextInt();
            System.out.print("Leave Days: ");
            int leaveDays = scanner.nextInt();
            System.out.print("Housing Allowance: ");
            double housingAllowance = scanner.nextDouble();
            System.out.print("Transport Allowance: ");
            double transportAllowance = scanner.nextDouble();
            System.out.print("Tax Deduction: ");
            double taxDeduction = scanner.nextDouble();
            System.out.print("Loan Deduction: ");
            double loanDeduction = scanner.nextDouble();
            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();
            System.out.print("Gross Salary: ");
            double grossSalary = scanner.nextDouble();
            System.out.print("Net Salary: ");
            double netSalary = scanner.nextDouble();
            
            PayrollRecord record = new PayrollRecord(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays, housingAllowance, transportAllowance, taxDeduction, loanDeduction, basicSalary, grossSalary, netSalary);
            System.out.println("\n" + record.toString());
            scanner.close();
        } catch (PayrollDataException e) {
            System.out.println(STUDENT_ID + " - Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " - Error: " + e.getMessage());
        }
    }
}


