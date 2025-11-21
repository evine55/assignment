package Kevine_26859.q1;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;
    
    public Entity(int id, String createdDate, String updatedDate) throws HospitalDataException {
        if (id <= 0) {
            throw new HospitalDataException("ID must be greater than 0");
        }
        if (createdDate == null || createdDate.trim().isEmpty()) {
            throw new HospitalDataException("Created date cannot be null or empty");
        }
        if (updatedDate == null || updatedDate.trim().isEmpty()) {
            throw new HospitalDataException("Updated date cannot be null or empty");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
    
    public int getId() { return id; }
    public void setId(int id) throws HospitalDataException {
        if (id <= 0) throw new HospitalDataException("ID must be greater than 0");
        this.id = id;
    }
    
    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws HospitalDataException {
        if (createdDate == null || createdDate.trim().isEmpty()) {
            throw new HospitalDataException("Created date cannot be null or empty");
        }
        this.createdDate = createdDate;
    }
    
    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws HospitalDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty()) {
            throw new HospitalDataException("Updated date cannot be null or empty");
        }
        this.updatedDate = updatedDate;
    }
    
    @Override
    public String toString() {
        return "Entity [ID=" + id + ", Created=" + createdDate + ", Updated=" + updatedDate + "]";
    }
}


