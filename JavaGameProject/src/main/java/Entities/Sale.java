package Entities;
public class Sale extends Games {
	private int saleId;
	private  int quantity;
	
	public Sale() {
	}

	public Sale(int saleId, int quantity) {
		super();
		this.saleId = saleId;
		this.quantity = quantity;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}