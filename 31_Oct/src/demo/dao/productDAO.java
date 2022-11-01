package demo.dao;
import demo.model.Product;
public class productDAO {
	Product[] proarr=new Product[3];
	 public void setProduct(Product parr) {
		 for(int i=0;i<proarr.length;i++) {
		   if(proarr[i]==null) {
			proarr[i]=parr;
			 break;
		 }
		 }
	 }
	
	 public Product[] getProducts() {
		 return proarr;
		 
		 
	 }

}
