/**
 *
 * @author sofia
 */

import java.rmi.*;  
import java.rmi.server.*;  
import java.util.Random;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class Olhach extends UnicastRemoteObject implements InterfaceOlhach{  
    //construtor da classe
    Olhach()throws RemoteException{  
        super();  
    } 
    
    Random random = new Random();
    int temp = -1000;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  

    //Anotação 'override' significa que classe filha está fazendo a implementação de método da classe mãe
    @Override
    public String alertaChuva (){
        
        return  "A chance de chuva é de " + Chuva() + "%\n" ;
    }
     
    public int Chuva (){
        int number = random.nextInt(101);
        return number;
    }
    
    @Override
     public String alertaTemp (){
        int aux = random.nextInt(45);
        LocalDateTime now = LocalDateTime.now();
        if( temp == -1000){
            temp = aux;
            return  "Tepertura de " + aux + "°C, às " + dtf.format(now) + "\n";
        }
        else if(aux-temp < -5){
            temp = aux;
            return  "Tepertura de " + aux + "°C, às " + dtf.format(now) + "\nCUIDADO: Queda brusca de temperatura!\n";
        }
        else if(aux-temp > 5){
            temp = aux;
            return  "Tepertura de " + aux + "°C, às " + dtf.format(now) + "\nCUIDADO: Aumento repentino de temperatura!\n";
        }
        temp = aux;
            return  "Tepertura de " + aux + "°C, às " + dtf.format(now) + "\nNenhuma mudança brusca de temperatura :)\n";
    }
    
    
    
    
}  
