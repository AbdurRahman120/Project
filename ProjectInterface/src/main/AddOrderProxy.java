package main;

public class AddOrderProxy implements main.AddOrder {
  private String _endpoint = null;
  private main.AddOrder addOrder = null;
  
  public AddOrderProxy() {
    _initAddOrderProxy();
  }
  
  public AddOrderProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddOrderProxy();
  }
  
  private void _initAddOrderProxy() {
    try {
      addOrder = (new main.AddOrderServiceLocator()).getAddOrder();
      if (addOrder != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addOrder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addOrder)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addOrder != null)
      ((javax.xml.rpc.Stub)addOrder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.AddOrder getAddOrder() {
    if (addOrder == null)
      _initAddOrderProxy();
    return addOrder;
  }
  
  public java.lang.String addProductInfo(java.lang.String name, java.lang.String description, java.lang.String type, int categoryID, float size, float weight, java.lang.String color, int standardCost, int listPrice) throws java.rmi.RemoteException{
    if (addOrder == null)
      _initAddOrderProxy();
    return addOrder.addProductInfo(name, description, type, categoryID, size, weight, color, standardCost, listPrice);
  }
  
  
}