/**
 *
 * @author sofia
 */

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.concurrent.TimeUnit;

public class Cliente {
    public static void main(String args[]) throws NotBoundException, MalformedURLException, RemoteException, InterruptedException{ //throws são para lidar com erros
        //Conecta com a porta de acesso ao servidor
        //Registry registry = LocateRegistry.getRegistry();
        InterfaceOlhach olhach = (InterfaceOlhach) Naming.lookup("rmi://localhost:1025/Olhach");
        System.out.println("Cliente conectado");
        System.out.println(olhach.alertaChuva());
        while(true){
            System.out.println(olhach.alertaTemp());
            TimeUnit.SECONDS.sleep(5);
        }
    }
}
