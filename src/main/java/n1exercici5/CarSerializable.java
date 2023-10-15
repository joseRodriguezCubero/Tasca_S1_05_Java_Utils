package n1exercici5;

import java.io.*;

public class CarSerializable implements Serializable {

    @Serial
    private static final long serialVersionUID=1L;
    private String brand;
    private String model;
    private transient String idPlate; //no queremos serializar la matricula


    public String getIdPlate() {
        return idPlate;
    }

    public void setIdPlate(String idPlate) {
        this.idPlate = idPlate;
    }


    public CarSerializable(String brand, String model, String idPlate) {
        this.brand = brand;
        this.model = model;
        this.idPlate = idPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarSerializable{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", idPlate='" + idPlate + '\'' +
                '}';
    }
}
