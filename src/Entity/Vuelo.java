package Entity;
import java.sql.Date;
import java.sql.Time;

public class Vuelo
{
    private int id_fly;
    private String destiny;
    private Date out_date;
    private Time out_hour;
    private int fk_id_airplane;

    public Vuelo() {
    }

    public Vuelo(int id_fly, String destiny, Date out_date, Time out_hour, int fk_id_airplane) {
        this.id_fly = id_fly;
        this.destiny = destiny;
        this.out_date = out_date;
        this.out_hour = out_hour;
        this.fk_id_airplane = fk_id_airplane;
    }

    public int getId_fly() {
        return id_fly;
    }

    public void setId_fly(int id_fly) {
        this.id_fly = id_fly;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public Date getOut_date() {
        return out_date;
    }

    public void setOut_date(Date out_date) {
        this.out_date = out_date;
    }

    public Time getOut_hour() {
        return out_hour;
    }

    public void setOut_hour(Time out_hour) {
        this.out_hour = out_hour;
    }

    public int getFk_id_airplane() {
        return fk_id_airplane;
    }

    public void setFk_id_airplane(int fk_id_airplane) {
        this.fk_id_airplane = fk_id_airplane;
    }

    @Override
    public String toString() {
        return "Fly --> " +
                "id_fly: " + id_fly +
                ", destiny: " + destiny +
                ", out_date: " + out_date +
                ", out_hour: " + out_hour +
                ", fk_id_airplane: " + fk_id_airplane;
    }
}
