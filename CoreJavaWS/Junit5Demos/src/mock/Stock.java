package mock;

public class Stock {

	private String stockId;
	private String name;	
	private int quantity;
	public Stock() {
		// TODO Auto-generated constructor stub
	}
	public Stock(String stockId, String name, int quantity) {
		super();
		this.stockId = stockId;
		this.name = name;
		this.quantity = quantity;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
