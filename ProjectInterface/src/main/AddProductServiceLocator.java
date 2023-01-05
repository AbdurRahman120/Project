/**
 * AddProductServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class AddProductServiceLocator extends org.apache.axis.client.Service implements main.AddProductService {

    public AddProductServiceLocator() {
    }


    public AddProductServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddProductServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddProduct
    private java.lang.String AddProduct_address = "http://localhost:8080/ProjectWebService/services/AddProduct";

    public java.lang.String getAddProductAddress() {
        return AddProduct_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddProductWSDDServiceName = "AddProduct";

    public java.lang.String getAddProductWSDDServiceName() {
        return AddProductWSDDServiceName;
    }

    public void setAddProductWSDDServiceName(java.lang.String name) {
        AddProductWSDDServiceName = name;
    }

    public main.AddProduct getAddProduct() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddProduct_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddProduct(endpoint);
    }

    public main.AddProduct getAddProduct(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.AddProductSoapBindingStub _stub = new main.AddProductSoapBindingStub(portAddress, this);
            _stub.setPortName(getAddProductWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddProductEndpointAddress(java.lang.String address) {
        AddProduct_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.AddProduct.class.isAssignableFrom(serviceEndpointInterface)) {
                main.AddProductSoapBindingStub _stub = new main.AddProductSoapBindingStub(new java.net.URL(AddProduct_address), this);
                _stub.setPortName(getAddProductWSDDServiceName());
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
        if ("AddProduct".equals(inputPortName)) {
            return getAddProduct();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "AddProductService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "AddProduct"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddProduct".equals(portName)) {
            setAddProductEndpointAddress(address);
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
