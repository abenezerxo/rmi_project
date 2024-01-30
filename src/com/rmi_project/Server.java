/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rmi_project;

/**
 *
 * @author ODeL
 */
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements hello{
 public Server () throws RemoteException{};
 public String sayHello() {
     return "Hello, World!";
    }    
    public static void main(String arg[]){
    try{
    Server obj=new Server();
    Registry Registry = LocateRegistry.createRegistry(3001);
    Registry.rebind("Hello", obj);
    System.out.println("Server Ready...");
    }catch(Exception e){
    System.err.println("Server exception:" + e.toString());
    e.printStackTrace();
            }
        }
}
