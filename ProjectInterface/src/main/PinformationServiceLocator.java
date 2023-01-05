/**
 * PinformationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class PinformationServiceLocator extends org.apache.axis.client.Service implements main.PinformationService {

    public PinformationServiceLocator() {
    }


    public PinformationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PinformationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Pinformation
    private java.lang.String Pinformation_address = "http://localhost:8080/ProjectWebService/services/Pinformation";

    public java.lang.String getPinformationAddress() {
        return Pinformation_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PinformationWSDDServiceName = "Pinformation";

    public java.lang.String getPinformationWSDDServiceName() {
        return PinformationWSDDServiceName;
    }

    public void setPinformationWSDDServiceName(java.lang.String name) {
        PinformationWSDDServiceName = name;
    }

    public main.Pinformation getPinformation() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Pinformation_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPinformation(endpoint);
    }

    public main.Pinformation getPinformation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.PinformationSoapBindingStub _stub = new main.PinformationSoapBindingStub(portAddress, this);
            _stub.setPortName(getPinformationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPinformationEndpointAddress(java.lang.String address) {
        Pinformation_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Pinformation.class.isAssignableFrom(serviceEndpointInterface)) {
                main.PinformationSoapBindingStub _stub = new main.PinformationSoapBindingStub(new java.net.URL(Pinformation_address), this);
                _stub.setPortName(getPinformationWSDDServiceName());
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
        if ("Pinformation".equals(inputPortName)) {
            return getPinformation();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "PinformationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Pinformation"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Pinformation".equals(portName)) {
            setPinformationEndpointAddress(address);
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
