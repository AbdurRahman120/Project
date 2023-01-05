package main;

public class AddProductProxy implements main.AddProduct {
  private String _endpoint = null;
  private main.AddProduct addProduct = null;
  
  public AddProductProxy() {
    _initAddProductProxy();
  }
  
  public AddProductProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddProductProxy();
  }
  
  private void _initAddProductProxy() {
    try {
      addProduct = (new main.AddProductServiceLocator()).getAddProduct();
      if (addProduct != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addProduct)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addProduct)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addProduct != null)
      ((javax.xml.rpc.Stub)addProduct)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.AddProduct getAddProduct() {
    if (addProduct == null)
      _initAddProductProxy();
    return addProduct;
  }
  
  public java.lang.String addProductInfo(java.lang.String name, java.lang.String description, java.lang.String type, int categoryID, float size, float weight, java.lang.String color, int standardCost, int listPrice) throws java.rmi.RemoteException{
    if (addProduct == null)
      _initAddProductProxy();
    return addProduct.addProductInfo(name, description, type, categoryID, size, weight, color, standardCost, listPrice);
  }
  
  
}