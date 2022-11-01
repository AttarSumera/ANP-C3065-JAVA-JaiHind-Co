package demo.service;

import demo.model.Product;
import demo.dao.productDAO;

public class ProductService {
productDAO productDao;
public ProductService() {
	productDao=new productDAO();
}

public void setProduct(Product product) {
	productDao.setProduct(product);
}

public Product[] getProducts() {
	Product proarr[]=productDao.getProducts();
	return proarr;
}

}
