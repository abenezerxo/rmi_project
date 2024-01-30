/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rmi_project;

/**
 *
 * @author ODeL
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface hello extends Remote{
    String sayHello() throws  RemoteException;
    
    
}
