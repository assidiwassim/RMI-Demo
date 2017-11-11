/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client8serveur;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.*;

/**
 *
 * @author wajdi
 */
public class client1 {
    
     public static void main(String[] args)  {
       
       try
       {
        Remote r=Naming.lookup("rmi://192.168.43.240/w");
        if(r instanceof interfaces)
        {
           ((interfaces)r).affiche();
             System.out.println(((interfaces)r).addition(3, 5555)) ;  
             System.out.println(((interfaces)r).sustraction(3, 6)) ;  
             System.out.println(((interfaces)r).multiplication(3, 6)) ;  
             System.out.println(((interfaces)r).diviser(6, 3)) ;
        }

       
       }catch(Exception e){ System.out.println("exception cote client ");}
        
    }
    
    
}
