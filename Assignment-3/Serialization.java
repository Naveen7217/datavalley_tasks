import java.io.*;


class Customer implements Serializable {
    private int id;
    private String name;
    private String address;

    
    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}

public class Serialization{
    public static void main(String[] args) {
        Customer customer = new Customer(1, "John", "1234 Main St");

        try {
           
            FileOutputStream fileOut = new FileOutputStream("JavaObject.txt");
           
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

        
            out.writeObject(customer);

          
            out.close();
      
            fileOut.close();

            System.out.println("data is serialized to JavaObject.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
