
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 18114290034
 */
public interface CalculadoraRemota extends Remote {
    
    int somar(int a, int b) throws RemoteException;
    int subtrair(int a, int b) throws RemoteException;
    int multiplicar(int a, int b) throws RemoteException;
    int dividir(int a, int b) throws RemoteException;
    
    
    
    
}
