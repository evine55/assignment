package Kevine_26859.q4;

import java.util.regex.Pattern;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    
    public Hotel(int id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email) throws ReservationDataException {
        super(id, createdDate, updatedDate);
        if (phoneNumber == null || !PHONE_PATTERN.matcher(phoneNumber).matches()) {
            throw new ReservationDataException("Phone number must be exactly 10 digits");
        }
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new ReservationDataException("Invalid email format");
        }
        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public String getHotelName() { return hotelName; }
    public void setHotelName(String hotelName) { this.hotelName = hotelName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws ReservationDataException {
        if (phoneNumber == null || !PHONE_PATTERN.matcher(phoneNumber).matches()) {
            throw new ReservationDataException("Phone number must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() { return email; }
    public void setEmail(String email) throws ReservationDataException {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new ReservationDataException("Invalid email format");
        }
        this.email = email;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nHotel [Name=" + hotelName + ", Address=" + address + ", Phone=" + phoneNumber + ", Email=" + email + "]";
    }
}


