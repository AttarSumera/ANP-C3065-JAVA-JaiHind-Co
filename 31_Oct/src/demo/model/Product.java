package demo.model;

public class Product {
	int productId;
	String productName;
	double productPrice;
	
	
	public Product(int pid,String pname,double pprice){
		productId=pid;
		productName=pname;
		productPrice=pprice;
		
	}
	
	public Product(){
		System.out.println("product id="+productId);
	}
	
	public void setProductId(int pid) {
		productId=pid;
		
	}
	
	public void setProductName(String pname) {
		productName=pname;
		
	}
	
	public void setProductPrice(double pprice) {
		productPrice=pprice;
		
	}
     
	public int getProductId() {
		return productId;
		
	}
	
	public String getProductName() {
		return productName;
		
	}
	
	public double getProductPrice() {
		return productPrice;
		
	}

}
