package Kevine_26859.q4;

public class ReservationRecord extends Feedback {
    private static final String STUDENT_ID = "26859";
    
    public ReservationRecord(int id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email, String roomNumber, String roomType, double pricePerNight, String customerName, String customerEmail, String contactNumber, String bookingDate, String checkInDate, String checkOutDate, String serviceName, double serviceCost, String paymentMethod, String paymentDate, double roomCharge, double serviceCharge, double totalBill, int rating, String comments) throws ReservationDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate, roomCharge, serviceCharge, totalBill, rating, comments);
    }
    
    public double generateBill() {
        return getRoomCharge() + getServiceCharge();
    }
    
    @Override
    public String toString() {
        return STUDENT_ID + "\n" + super.toString() + "\n=== FINAL COMPUTED BILL ===" +
               "\nGenerated Bill: " + String.format("%.2f", generateBill());
    }
    
    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("=== Hotel Reservation System ===");
            System.out.println("Student ID: " + STUDENT_ID);
            System.out.print("Hotel ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Created Date: ");
            String createdDate = scanner.nextLine();
            System.out.print("Updated Date: ");
            String updatedDate = scanner.nextLine();
            System.out.print("Hotel Name: ");
            String hotelName = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Phone Number (10 digits): ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room Number: ");
            String roomNumber = scanner.nextLine();
            System.out.print("Room Type: ");
            String roomType = scanner.nextLine();
            System.out.print("Price Per Night: ");
            double pricePerNight = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Customer Name: ");
            String customerName = scanner.nextLine();
            System.out.print("Customer Email: ");
            String customerEmail = scanner.nextLine();
            System.out.print("Contact Number (10 digits): ");
            String contactNumber = scanner.nextLine();
            System.out.print("Booking Date: ");
            String bookingDate = scanner.nextLine();
            System.out.print("Check-in Date: ");
            String checkInDate = scanner.nextLine();
            System.out.print("Check-out Date: ");
            String checkOutDate = scanner.nextLine();
            System.out.print("Service Name: ");
            String serviceName = scanner.nextLine();
            System.out.print("Service Cost: ");
            double serviceCost = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Payment Method: ");
            String paymentMethod = scanner.nextLine();
            System.out.print("Payment Date: ");
            String paymentDate = scanner.nextLine();
            System.out.print("Room Charge: ");
            double roomCharge = scanner.nextDouble();
            System.out.print("Service Charge: ");
            double serviceCharge = scanner.nextDouble();
            System.out.print("Total Bill: ");
            double totalBill = scanner.nextDouble();
            System.out.print("Rating (1-5): ");
            int rating = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Comments: ");
            String comments = scanner.nextLine();
            
            ReservationRecord record = new ReservationRecord(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate, roomCharge, serviceCharge, totalBill, rating, comments);
            System.out.println("\n" + record.toString());
            scanner.close();
        } catch (ReservationDataException e) {
            System.out.println(STUDENT_ID + " - Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " - Error: " + e.getMessage());
        }
    }
}


