package Entity;

public class Avion
{
    private int id_airplane;
    private String model;
    private int capacity;

    public Avion() {
    }

    public Avion(int id_airplane, java.lang.String model, int capacity) {
        this.id_airplane = id_airplane;
        this.model = model;
        this.capacity = capacity;
    }

    public int getId_airplane() {
        return id_airplane;
    }

    public void setId_airplane(int id_airplane) {
        this.id_airplane = id_airplane;
    }

    public java.lang.String getModel() {
        return model;
    }

    public void setModel(java.lang.String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Airplane --> " +
                "id_airplane: " + id_airplane +
                ", model: " + model +
                ", capacity: " + capacity;
    }
}
