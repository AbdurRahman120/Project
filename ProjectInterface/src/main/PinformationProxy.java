package main;

public class PinformationProxy implements main.Pinformation {
  private String _endpoint = null;
  private main.Pinformation pinformation = null;
  
  public PinformationProxy() {
    _initPinformationProxy();
  }
  
  public PinformationProxy(String endpoint) {
    _endpoint = endpoint;
    _initPinformationProxy();
  }
  
  private void _initPinformationProxy() {
    try {
      pinformation = (new main.PinformationServiceLocator()).getPinformation();
      if (pinformation != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pinformation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pinformation)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pinformation != null)
      ((javax.xml.rpc.Stub)pinformation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Pinformation getPinformation() {
    if (pinformation == null)
      _initPinformationProxy();
    return pinformation;
  }
  
  public java.lang.String getOrderInfo(java.lang.String name) throws java.rmi.RemoteException{
    if (pinformation == null)
      _initPinformationProxy();
    return pinformation.getOrderInfo(name);
  }
  
  
}