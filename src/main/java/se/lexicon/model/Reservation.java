package se.lexicon.model;

import java.time.LocalDate;

public class Reservation {
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    private Customer customer;
    private Vehicle associatedVehicle;
    private ParkingSpot parkingSpot;

    public void extend(int days){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getAssociatedVehicle() {
        return associatedVehicle;
    }

    public void setAssociatedVehicle(Vehicle associatedVehicle) {
        this.associatedVehicle = associatedVehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
