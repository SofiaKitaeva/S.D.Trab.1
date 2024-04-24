/**
 *
 * @author Sofia Kitaeva
 */

import java.rmi.*;

public interface InterfaceOlhach extends Remote {

    //Interface usada para comunicação entre cliente e servidor
    public String alertaChuva() throws RemoteException;
    public String alertaTemp() throws RemoteException;
    
}


