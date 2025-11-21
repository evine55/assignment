package Kevine_26859.q1;

public class Bill extends Treatment {
    private double doctorFee;
    private double medicineCost;
    private double totalBill;
    
    public Bill(int id, String createdDate, String updatedDate, String hospitalName,
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
              admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost);
        
        if (doctorFee <= 0) {
            throw new HospitalDataException("Doctor fee must be greater than 0");
        }
        if (medicineCost <= 0) {
            throw new HospitalDataException("Medicine cost must be greater than 0");
        }
        if (totalBill <= 0) {
            throw new HospitalDataException("Total bill must be greater than 0");
        }
        
        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
        this.totalBill = totalBill;
    }
    
    public double getDoctorFee() { return doctorFee; }
    public void setDoctorFee(double doctorFee) throws HospitalDataException {
        if (doctorFee <= 0) throw new HospitalDataException("Doctor fee must be greater than 0");
        this.doctorFee = doctorFee;
    }
    
    public double getMedicineCost() { return medicineCost; }
    public void setMedicineCost(double medicineCost) throws HospitalDataException {
        if (medicineCost <= 0) throw new HospitalDataException("Medicine cost must be greater than 0");
        this.medicineCost = medicineCost;
    }
    
    public double getTotalBill() { return totalBill; }
    public void setTotalBill(double totalBill) throws HospitalDataException {
        if (totalBill <= 0) throw new HospitalDataException("Total bill must be greater than 0");
        this.totalBill = totalBill;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nBill [Doctor Fee=" + doctorFee + ", Medicine Cost=" + medicineCost +
               ", Total Bill=" + totalBill + "]";
    }
}


