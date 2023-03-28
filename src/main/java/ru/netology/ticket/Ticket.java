package ru.netology.ticket;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private  int price;
    private String DepartureAirport;
    private String ArrivalAirport;
    private  int TravelTime;

    public Ticket(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepartureAirport() {
        return DepartureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        DepartureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return ArrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        ArrivalAirport = arrivalAirport;
    }

    public int getTravelTime() {
        return TravelTime;
    }

    public void setTravelTime(int travelTime) {
        TravelTime = travelTime;
    }

    public Ticket(int id, int price, String departureAirport, String arrivalAirport, int travelTime) {
        this.id = id;
        this.price = price;
        DepartureAirport = departureAirport;
        ArrivalAirport = arrivalAirport;
        TravelTime = travelTime;
    }


    @Override
    public int compareTo(Ticket other) {
        return this.price - other.price;
    }
}
