/**
 * AddOrderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class AddOrderServiceLocator extends org.apache.axis.client.Service implements main.AddOrderService {

    public AddOrderServiceLocator() {
    }


    public AddOrderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddOrderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddOrder
    private java.lang.String AddOrder_address = "http://localhost:8080/ProjectWebService/services/AddOrder";

    public java.lang.String getAddOrderAddress() {
        return AddOrder_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddOrderWSDDServiceName = "AddOrder";

    public java.lang.String getAddOrderWSDDServiceName() {
        return AddOrderWSDDServiceName;
    }

    public void setAddOrderWSDDServiceName(java.lang.String name) {
        AddOrderWSDDServiceName = name;
    }

    public main.AddOrder getAddOrder() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddOrder_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddOrder(endpoint);
    }

    public main.AddOrder getAddOrder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.AddOrderSoapBindingStub _stub = new main.AddOrderSoapBindingStub(portAddress, this);
            _stub.setPortName(getAddOrderWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddOrderEndpointAddress(java.lang.String address) {
        AddOrder_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.AddOrder.class.isAssignableFrom(serviceEndpointInterface)) {
                main.AddOrderSoapBindingStub _stub = new main.AddOrderSoapBindingStub(new java.net.URL(AddOrder_address), this);
                _stub.setPortName(getAddOrderWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AddOrder".equals(inputPortName)) {
            return getAddOrder();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "AddOrderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "AddOrder"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddOrder".equals(portName)) {
            setAddOrderEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
