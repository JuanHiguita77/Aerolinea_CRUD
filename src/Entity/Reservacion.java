package Entity;

import java.sql.Date;

public class Reservacion
{
    private int id_reservation;
    private Date reservation_date;
    private String seat;
    private int fk_id_pasenger;
    private int fk_id_fly;

    public Reservacion() {
    }

    public Reservacion(int id_reservation, Date reservation_date, String seat, int fk_id_pasenger, int fk_id_fly) {
        this.id_reservation = id_reservation;
        this.reservation_date = reservation_date;
        this.seat = seat;
        this.fk_id_pasenger = fk_id_pasenger;
        this.fk_id_fly = fk_id_fly;
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

    @Override
    public String toString() {
        return "Reservation --> " +
                "id_reservation: " + id_reservation +
                ", reservation_date: " + reservation_date +
                ", seat: " + seat +
                ", fk_id_pasenger: " + fk_id_pasenger +
                ", fk_id_fly: " + fk_id_fly;
    }
}
