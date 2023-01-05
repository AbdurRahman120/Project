/**
 * AddCustomerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class AddCustomerServiceLocator extends org.apache.axis.client.Service implements main.AddCustomerService {

    public AddCustomerServiceLocator() {
    }


    public AddCustomerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddCustomerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddCustomer
    private java.lang.String AddCustomer_address = "http://localhost:8080/ProjectWebService/services/AddCustomer";

    public java.lang.String getAddCustomerAddress() {
        return AddCustomer_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddCustomerWSDDServiceName = "AddCustomer";

    public java.lang.String getAddCustomerWSDDServiceName() {
        return AddCustomerWSDDServiceName;
    }

    public void setAddCustomerWSDDServiceName(java.lang.String name) {
        AddCustomerWSDDServiceName = name;
    }

    public main.AddCustomer getAddCustomer() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddCustomer_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddCustomer(endpoint);
    }

    public main.AddCustomer getAddCustomer(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.AddCustomerSoapBindingStub _stub = new main.AddCustomerSoapBindingStub(portAddress, this);
            _stub.setPortName(getAddCustomerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddCustomerEndpointAddress(java.lang.String address) {
        AddCustomer_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.AddCustomer.class.isAssignableFrom(serviceEndpointInterface)) {
                main.AddCustomerSoapBindingStub _stub = new main.AddCustomerSoapBindingStub(new java.net.URL(AddCustomer_address), this);
                _stub.setPortName(getAddCustomerWSDDServiceName());
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
        if ("AddCustomer".equals(inputPortName)) {
            return getAddCustomer();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "AddCustomerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "AddCustomer"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddCustomer".equals(portName)) {
            setAddCustomerEndpointAddress(address);
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
