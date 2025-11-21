package Kevine_26859.q4;

import java.util.regex.Pattern;

public class Customer extends Room {
    private String customerName;
    private String customerEmail;
    private String contactNumber;
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    
    public Customer(int id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email, String roomNumber, String roomType, double pricePerNight, String customerName, String customerEmail, String contactNumber) throws ReservationDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight);
        if (customerEmail == null || !EMAIL_PATTERN.matcher(customerEmail).matches()) {
            throw new ReservationDataException("Invalid customer email format");
        }
        if (contactNumber == null || !PHONE_PATTERN.matcher(contactNumber).matches()) {
            throw new ReservationDataException("Contact number must be exactly 10 digits");
        }
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.contactNumber = contactNumber;
    }
    
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String customerEmail) throws ReservationDataException {
        if (customerEmail == null || !EMAIL_PATTERN.matcher(customerEmail).matches()) {
            throw new ReservationDataException("Invalid customer email format");
        }
        this.customerEmail = customerEmail;
    }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws ReservationDataException {
        if (contactNumber == null || !PHONE_PATTERN.matcher(contactNumber).matches()) {
            throw new ReservationDataException("Contact number must be exactly 10 digits");
        }
        this.contactNumber = contactNumber;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCustomer [Name=" + customerName + ", Email=" + customerEmail + ", Contact=" + contactNumber + "]";
    }
}


