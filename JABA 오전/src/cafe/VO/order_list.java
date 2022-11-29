package cafe.VO;

public class order_list {
	private int seq;
	private String food_name;
	private String an_order;
	private int price;
	private int delivery_complete;
	private String memo;
	
	public order_list() {}
	
	public order_list( String name, String an_order, int price,
			String memo) {
		this.food_name=name;
		this.an_order=an_order;
		this.price=price;
		this.memo=memo;
	}
	
	public order_list(int seq, String name, String an_order, int price,
			int complete, String memo) {
		this.seq=seq;
		this.food_name=name;
		this.an_order=an_order;
		this.price=price;
		this.delivery_complete=complete;
		this.memo=memo;
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public String getAn_order() {
		return an_order;
	}
	public void setAn_order(String an_order) {
		this.an_order = an_order;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDelivery_complete() {
		return delivery_complete;
	}
	public void setDelivery_complete(int delivery_complete) {
		this.delivery_complete = delivery_complete;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
}
