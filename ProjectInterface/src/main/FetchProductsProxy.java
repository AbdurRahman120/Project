package main;

public class FetchProductsProxy implements main.FetchProducts {
  private String _endpoint = null;
  private main.FetchProducts fetchProducts = null;
  
  public FetchProductsProxy() {
    _initFetchProductsProxy();
  }
  
  public FetchProductsProxy(String endpoint) {
    _endpoint = endpoint;
    _initFetchProductsProxy();
  }
  
  private void _initFetchProductsProxy() {
    try {
      fetchProducts = (new main.FetchProductsServiceLocator()).getFetchProducts();
      if (fetchProducts != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fetchProducts)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fetchProducts)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fetchProducts != null)
      ((javax.xml.rpc.Stub)fetchProducts)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.FetchProducts getFetchProducts() {
    if (fetchProducts == null)
      _initFetchProductsProxy();
    return fetchProducts;
  }
  
  public main.Products[] getproductInfo() throws java.rmi.RemoteException{
    if (fetchProducts == null)
      _initFetchProductsProxy();
    return fetchProducts.getproductInfo();
  }
  
  
}