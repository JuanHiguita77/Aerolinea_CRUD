package Entity;

import java.sql.Date;
import java.sql.Time;

public class Reservacion
{
    private int id_reservation;
    private Date reservation_date;
    private String seat;
    private int fk_id_pasenger;
    private int fk_id_fly;
    private String passenger_name;
    private String passenger_surname;
    private String passenger_document;
    private String destination;
    private Date out_date;
    private Time out_time;

    public Reservacion() {
    }

    public Reservacion(int id_reservation, Date reservation_date, String seat, int fk_id_pasenger, int fk_id_fly, String passenger_name, String passenger_surname, String passenger_document, String destination, Date out_date, Time out_time) {
        this.id_reservation = id_reservation;
        this.reservation_date = reservation_date;
        this.seat = seat;
        this.fk_id_pasenger = fk_id_pasenger;
        this.fk_id_fly = fk_id_fly;
        this.passenger_name = passenger_name;
        this.passenger_surname = passenger_surname;
        this.passenger_document = passenger_document;
        this.destination = destination;
        this.out_date = out_date;
        this.out_time = out_time;
    }

    public int getId_reservation() {
        return id_reservation;
    }

    public void setId_reservation(int id_reservation) {
        this.id_reservation = id_reservation;
    }

    public Date getReservation_date() {
        return reservation_date;
    }

    public void setReservation_date(Date reservation_date) {
        this.reservation_date = reservation_date;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public int getFk_id_pasenger() {
        return fk_id_pasenger;
    }

    public void setFk_id_pasenger(int fk_id_pasenger) {
        this.fk_id_pasenger = fk_id_pasenger;
    }

    public int getFk_id_fly() {
        return fk_id_fly;
    }

    public void setFk_id_fly(int fk_id_fly) {
        this.fk_id_fly = fk_id_fly;
    }

    public String getPassenger_name() {
        return passenger_name;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    public String getPassenger_surname() {
        return passenger_surname;
    }

    public void setPassenger_surname(String passenger_surname) {
        this.passenger_surname = passenger_surname;
    }

    public String getPassenger_document() {
        return passenger_document;
    }

    public void setPassenger_document(String passenger_document) {
        this.passenger_document = passenger_document;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getOut_date() {
        return out_date;
    }

    public void setOut_date(Date out_date) {
        this.out_date = out_date;
    }

    public Time getOut_time() {
        return out_time;
    }

    public void setOut_time(Time out_time) {
        this.out_time = out_time;
    }

    @Override
    public String toString() {
        return  "Reservation Details:\n" +
                "   Reservation ID: " + id_reservation + "\n" +
                "   Reservation Date: " + reservation_date + "\n" +
                "   Seat: '" + seat + "'\n" +
                "   Passenger ID: " + fk_id_pasenger + "\n" +
                "   Flight ID: " + fk_id_fly + "\n" +
                "   Passenger Name: '" + passenger_name + "'\n" +
                "   Passenger Surname: '" + passenger_surname + "'\n" +
                "   Passenger Document: '" + passenger_document + "'\n" +
                "   Destination: '" + destination + "'\n" +
                "   Departure Date: " + out_date + "\n" +
                "   Departure Time: " + out_time;

    }
}
