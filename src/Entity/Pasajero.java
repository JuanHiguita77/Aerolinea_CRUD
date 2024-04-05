package Entity;

public class Pasajero
{
    private int id_pasenger;
    private String name;
    private String surname;
    private String pasenger_document;

    public Pasajero() {
    }

    public int getId_pasenger() {
        return id_pasenger;
    }

    public void setId_pasenger(int id_pasenger) {
        this.id_pasenger = id_pasenger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPasenger_document() {
        return pasenger_document;
    }

    public void setPasenger_document(String pasenger_document) {
        this.pasenger_document = pasenger_document;
    }

    @Override
    public String toString() {
        return "Pasenger --> " +
                "id_pasenger: " + id_pasenger +
                ", name: " + name + '\'' +
                ", surname: " + surname + '\'' +
                ", pasenger_document: " + pasenger_document;
    }
}
