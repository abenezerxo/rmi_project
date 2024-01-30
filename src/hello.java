import java.rmi.Remote;
import java.rmi.RemoteException;

public interface hello extends Remote{
    String sayHello() throws  RemoteException;
    
    
}
