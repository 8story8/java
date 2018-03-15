package step5;

public class ProductVO {
	private String name;
	private String maker;
	private int price;
	
	public ProductVO(String name, String maker, int price) {
		super();
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}