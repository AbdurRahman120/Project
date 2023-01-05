/**
 * AddOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface AddOrder extends java.rmi.Remote {
    public java.lang.String addProductInfo(java.lang.String name, java.lang.String description, java.lang.String type, int categoryID, float size, float weight, java.lang.String color, int standardCost, int listPrice) throws java.rmi.RemoteException;
}
