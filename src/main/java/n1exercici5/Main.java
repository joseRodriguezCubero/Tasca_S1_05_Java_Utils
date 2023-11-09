package n1exercici5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        CarSerializable coche1 = new CarSerializable("Opel", "Astra", "9533RNS");
        CarExportable coche2 = new CarExportable("Seat", "Leon", "9533RNS");


        //Serialization
        OutputStream fileOutputStream = new FileOutputStream("E:\\serialized.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(coche1);
        objectOutputStream.close();
        fileOutputStream.close();

        //Deserialization
        FileInputStream fileInputStream = new FileInputStream("E:\\serialized.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        CarSerializable reCarDeserializationObj = (CarSerializable) objectInputStream.readObject();
        System.out.println(reCarDeserializationObj);

        //Exportation
        OutputStream fileOutputStream2 = new FileOutputStream("E:\\exported.ser");
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);
        objectOutputStream2.writeObject(coche2);
        objectOutputStream2.close();
        fileOutputStream.close();

        //Import
        FileInputStream fileInputStream2 = new FileInputStream("E:\\exported.ser");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);
        CarExportable reCarDeserializationObj2 = (CarExportable) objectInputStream2.readObject();
        System.out.println(reCarDeserializationObj2);

    }
}

