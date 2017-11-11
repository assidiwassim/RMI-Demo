/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client8serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author wajdi
 */
public interface interfaces extends Remote {
    public void affiche() throws RemoteException;
    
      public int diviser(int a,int b) throws RemoteException;
        public int addition(int a,int b) throws RemoteException;
          public int multiplication(int a, int b) throws RemoteException;
            public int sustraction(int a,int b) throws RemoteException;
    
}
