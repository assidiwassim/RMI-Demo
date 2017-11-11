/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client8serveur;

import java.net.MalformedURLException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
import java.rmi.server.*;
/**
 *
 * @author wajdi
 */
public class server extends UnicastRemoteObject implements interfaces {

protected server() throws RemoteException
{
 super();

}
@Override
 public void affiche() throws RemoteException
 {
 
 System.out.println("bonne connection ");
 
 }
 
@Override
 public int diviser(int a,int b)throws RemoteException{
 return a/b;
 }
 
 
@Override
  public int addition(int a,int b) throws RemoteException{
  return a+b;
  }
  
  
@Override
  public int multiplication(int a, int b) throws RemoteException{
   return a*b;
  }
  
  
@Override
   public int sustraction(int a,int b) throws RemoteException{
   return a-b;
   }
 
 
   public static void main(String[] args) throws RemoteException, MalformedURLException {
       
       try
       {
         server s= new server();
         java.rmi.registry.LocateRegistry.createRegistry(1099);
         Naming.rebind("rmi://192.168.43.240/w", s);
         System.out.println("cnx serveur prete ");

       
       }catch(Exception e){ System.out.println("exception cote serveur ");}
        
    }
}


 