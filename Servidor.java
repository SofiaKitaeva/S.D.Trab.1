/**
 *
 * @author sofia
 */

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.io.IOException;
import java.net.ServerSocket;

public class Servidor {
    
    /** public static int acharPorta() {
        for (int port = 1024; port <= 65535; port++) { // portas de 1024 a 65535
            try (ServerSocket serverSocket = new ServerSocket(port)) {
                // Se chegar aqui, significa que a porta está livre
                return port; // retorna a primeira porta livre encontrada
            } catch (IOException e) {
                // Se a porta estiver em uso, uma exceção será lançada
                // Continuamos para a próxima porta
            }
        }
        throw new RuntimeException("Nenhuma porta livre foi encontrada");
    }
    */
    public static void main(String args[]) throws RemoteException, NotBoundException, MalformedURLException{
        //Cria novo objeto do tipo interface e coloca na porta livre
        //int porta = acharPorta();
        Registry registry = LocateRegistry.createRegistry(1025);
        registry.rebind("Olhach", new Olhach());  
    }    
}