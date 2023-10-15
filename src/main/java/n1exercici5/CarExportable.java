package n1exercici5;

import java.io.*;

public class CarExportable implements Externalizable {

    @Serial
    private static final long serialVersionUID=1L;
    private String brand;
    private String model;
    private String idPlate;


    public CarExportable() {
    }

    public CarExportable(String brand, String model, String idPlate) {

        this.brand = brand;
        this.model = model;
        this.idPlate= idPlate;
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

    public String getIdPlate() {
        return idPlate;
    }

    public void setIdPlate(String idPlate) {
        this.idPlate = idPlate;
    }

    @Override
    public String toString() {
        return "CarExportable{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", idPlate='" + idPlate + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(brand);
        out.writeUTF(model);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        brand = in.readUTF();
        model = in.readUTF();

    }
}


