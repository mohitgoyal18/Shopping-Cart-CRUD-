package beans;

public class Cart {
private int id,quantity,price;
private String productname,productbrand;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getProductbrand() {
	return productbrand;
}
public void setProductbrand(String productbrand) {
	this.productbrand = productbrand;
}

}
