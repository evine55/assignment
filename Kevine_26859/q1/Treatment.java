package Kevine_26859.q1;

public class Treatment extends Admission {
    private String diagnosis;
    private String treatmentGiven;
    private double treatmentCost;
    
    public Treatment(int id, String createdDate, String updatedDate, String hospitalName,
                    String address, String phoneNumber, String email, String departmentName,
                    String departmentCode, String doctorName, String specialization,
                    String doctorEmail, String phone, String nurseName, String shift,
                    int yearsOfExperience, String patientName, int age, String gender,
                    String contactNumber, String admissionDate, String roomNumber,
                    double roomCharges, String diagnosis, String treatmentGiven,
                    double treatmentCost) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
              departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
              nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber,
              admissionDate, roomNumber, roomCharges);
        
        if (diagnosis == null || diagnosis.trim().isEmpty()) {
            throw new HospitalDataException("Diagnosis cannot be empty");
        }
        if (treatmentGiven == null || treatmentGiven.trim().isEmpty()) {
            throw new HospitalDataException("Treatment given cannot be empty");
        }
        if (treatmentCost <= 0) {
            throw new HospitalDataException("Treatment cost must be greater than 0");
        }
        
        this.diagnosis = diagnosis;
        this.treatmentGiven = treatmentGiven;
        this.treatmentCost = treatmentCost;
    }
    
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) throws HospitalDataException {
        if (diagnosis == null || diagnosis.trim().isEmpty()) {
            throw new HospitalDataException("Diagnosis cannot be empty");
        }
        this.diagnosis = diagnosis;
    }
    
    public String getTreatmentGiven() { return treatmentGiven; }
    public void setTreatmentGiven(String treatmentGiven) throws HospitalDataException {
        if (treatmentGiven == null || treatmentGiven.trim().isEmpty()) {
            throw new HospitalDataException("Treatment given cannot be empty");
        }
        this.treatmentGiven = treatmentGiven;
    }
    
    public double getTreatmentCost() { return treatmentCost; }
    public void setTreatmentCost(double treatmentCost) throws HospitalDataException {
        if (treatmentCost <= 0) throw new HospitalDataException("Treatment cost must be greater than 0");
        this.treatmentCost = treatmentCost;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTreatment [Diagnosis=" + diagnosis + ", Treatment=" + treatmentGiven +
               ", Cost=" + treatmentCost + "]";
    }
}


