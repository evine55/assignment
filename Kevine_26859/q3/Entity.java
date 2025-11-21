package Kevine_26859.q3;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;
    
    public Entity(int id, String createdDate, String updatedDate) throws PayrollDataException {
        if (id <= 0) throw new PayrollDataException("ID must be greater than 0");
        if (createdDate == null || createdDate.trim().isEmpty()) {
            throw new PayrollDataException("Created date cannot be null or empty");
        }
        if (updatedDate == null || updatedDate.trim().isEmpty()) {
            throw new PayrollDataException("Updated date cannot be null or empty");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
    
    public int getId() { return id; }
    public void setId(int id) throws PayrollDataException {
        if (id <= 0) throw new PayrollDataException("ID must be greater than 0");
        this.id = id;
    }
    
    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws PayrollDataException {
        if (createdDate == null || createdDate.trim().isEmpty()) {
            throw new PayrollDataException("Created date cannot be null or empty");
        }
        this.createdDate = createdDate;
    }
    
    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws PayrollDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty()) {
            throw new PayrollDataException("Updated date cannot be null or empty");
        }
        this.updatedDate = updatedDate;
    }
    
    @Override
    public String toString() {
        return "Entity [ID=" + id + ", Created=" + createdDate + ", Updated=" + updatedDate + "]";
    }
}


