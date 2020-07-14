package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
		public Product(String name, double price, int quantity) {
		
			this.name = name;
			this.price = price;
			this.quantity = quantity;
			
		}
	
		public double totalValueInStock() {
			return price * quantity;
	}
		
		public void addProduct (int quantity){
			this.quantity += quantity;
	
	}
	
		public void removeProduct(int quantity) {
			this.quantity -= quantity; //"This" indica que a variável a ser usada é a global, no caso da classe Product.
						
		}
		
		public String toString() {
			
			return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " Units, Total: $ " + String.format("%.2f", totalValueInStock());
			
			
		}
	
	
}
