package Kevine_26859.q1;

public class HospitalRecord extends Bill {
    private static final String STUDENT_ID = "26859";
    
    public HospitalRecord(int id, String createdDate, String updatedDate, String hospitalName,
                         String address, String phoneNumber, String email, String departmentName,
                         String departmentCode, String doctorName, String specialization,
                         String doctorEmail, String phone, String nurseName, String shift,
                         int yearsOfExperience, String patientName, int age, String gender,
                         String contactNumber, String admissionDate, String roomNumber,
                         double roomCharges, String diagnosis, String treatmentGiven,
                         double treatmentCost, double doctorFee, double medicineCost,
                         double totalBill) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
              departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
              nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber,
              admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost,
              doctorFee, medicineCost, totalBill);
    }
    
    public double generateBill() {
        return getRoomCharges() + getTreatmentCost() + getDoctorFee() + getMedicineCost();
    }
    
    @Override
    public String toString() {
        return STUDENT_ID + "\n" + super.toString() + "\n=== FINAL COMPUTED BILL ===" +
               "\nGenerated Bill: " + String.format("%.2f", generateBill());
    }
    
    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            
            System.out.println("=== Hospital Management System ===");
            System.out.println("Student ID: " + STUDENT_ID);
            System.out.println("Enter Hospital Details:");
            
            System.out.print("Hospital ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Created Date: ");
            String createdDate = scanner.nextLine();
            
            System.out.print("Updated Date: ");
            String updatedDate = scanner.nextLine();
            
            System.out.print("Hospital Name: ");
            String hospitalName = scanner.nextLine();
            
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
            
            System.out.print("Doctor Name: ");
            String doctorName = scanner.nextLine();
            
            System.out.print("Specialization: ");
            String specialization = scanner.nextLine();
            
            System.out.print("Doctor Email: ");
            String doctorEmail = scanner.nextLine();
            
            System.out.print("Doctor Phone (10 digits): ");
            String doctorPhone = scanner.nextLine();
            
            System.out.print("Nurse Name: ");
            String nurseName = scanner.nextLine();
            
            System.out.print("Shift (Day/Night): ");
            String shift = scanner.nextLine();
            
            System.out.print("Years of Experience: ");
            int yearsOfExperience = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Patient Name: ");
            String patientName = scanner.nextLine();
            
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Gender (Male/Female/Other): ");
            String gender = scanner.nextLine();
            
            System.out.print("Contact Number: ");
            String contactNumber = scanner.nextLine();
            
            System.out.print("Admission Date: ");
            String admissionDate = scanner.nextLine();
            
            System.out.print("Room Number: ");
            String roomNumber = scanner.nextLine();
            
            System.out.print("Room Charges: ");
            double roomCharges = scanner.nextDouble();
            
            System.out.print("Diagnosis: ");
            scanner.nextLine();
            String diagnosis = scanner.nextLine();
            
            System.out.print("Treatment Given: ");
            String treatmentGiven = scanner.nextLine();
            
            System.out.print("Treatment Cost: ");
            double treatmentCost = scanner.nextDouble();
            
            System.out.print("Doctor Fee: ");
            double doctorFee = scanner.nextDouble();
            
            System.out.print("Medicine Cost: ");
            double medicineCost = scanner.nextDouble();
            
            System.out.print("Total Bill: ");
            double totalBill = scanner.nextDouble();
            
            HospitalRecord record = new HospitalRecord(id, createdDate, updatedDate, hospitalName,
                address, phoneNumber, email, departmentName, departmentCode, doctorName,
                specialization, doctorEmail, doctorPhone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges,
                diagnosis, treatmentGiven, treatmentCost, doctorFee, medicineCost, totalBill);
            
            System.out.println("\n" + record.toString());
            
            scanner.close();
            
        } catch (HospitalDataException e) {
            System.out.println(STUDENT_ID + " - Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " - Error: " + e.getMessage());
        }
    }
}


