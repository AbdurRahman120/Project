package main;

public class AddCustomerProxy implements main.AddCustomer {
  private String _endpoint = null;
  private main.AddCustomer addCustomer = null;
  
  public AddCustomerProxy() {
    _initAddCustomerProxy();
  }
  
  public AddCustomerProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddCustomerProxy();
  }
  
  private void _initAddCustomerProxy() {
    try {
      addCustomer = (new main.AddCustomerServiceLocator()).getAddCustomer();
      if (addCustomer != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addCustomer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addCustomer)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addCustomer != null)
      ((javax.xml.rpc.Stub)addCustomer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.AddCustomer getAddCustomer() {
    if (addCustomer == null)
      _initAddCustomerProxy();
    return addCustomer;
  }
  
  public java.lang.String addCustomerInfo(java.lang.String name, java.lang.String phoneNumber, java.lang.String CNIC, java.lang.String email, java.lang.String gender) throws java.rmi.RemoteException{
    if (addCustomer == null)
      _initAddCustomerProxy();
    return addCustomer.addCustomerInfo(name, phoneNumber, CNIC, email, gender);
  }
  
  
}