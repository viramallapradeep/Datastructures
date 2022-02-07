package topic;

// Java code for serialization and deserialization
// of a Java object

import java.io.*;

class Demo implements java.io.Serializable {
    /**
     *
     */
//	private static final long serialVersionUID = -3999486285353373415L;
    public int a;
    public String b;


    // Default constructor
    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return this.a + " == " + this.b;
    }

    private void writeObject(ObjectOutputStream objectOutputStream)
            throws Exception {
//        System.out.println(this);
        // don't provide implementation details here
        System.out.println("i am called");

        objectOutputStream.writeInt(this.a);
        objectOutputStream.writeBytes(this.b);

//        throw new IOException("Serialization not allowed");
    }

    private void readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException {
        this.a = aInputStream.readInt();
        this.b = aInputStream.readLine();
    }


}

public class kkk {
    public static void main(String[] args) {
        Demo object = new Demo(1, "geeksforgeeks");
        String filename = "file.txt";

        // Serialization
        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }


        Demo object1 = null;

        // Deserialization
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (Demo) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}

