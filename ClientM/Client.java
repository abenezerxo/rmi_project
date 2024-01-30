import java.rmi.registry.*;
import java.rmi.*;

public class Client {
    private Client() {
    }

    public static void main(String[] args) {
        String host = "//127.0.0.1:3001/Hello";
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            hello stub = (hello) Naming.lookup(host);
            String response = stub.sayHello();
            System.out.println("Response:" + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}