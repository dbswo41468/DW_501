package cafe.VO;

public class food {
	private int food_seq;
	private String food_name;
	private int cost;
	private int cook_time;
	private int cal; // 칼로리
	private String allergy; // 알러지
	private int order_quantity; // 주문량
	
	
	public food() {}
	public food(int seq, String name, int cost, int time, int cal, String aller, int quan) {
		this.food_seq = seq;
		this.food_name = name;
		this.cost = cost;
		this.cal = cal;
		this.cook_time = time;
		this.allergy = aller;
		this.order_quantity = quan;
	}
	
	
	public int getFood_seq() {
		return food_seq;
	}
	public void setFood_seq(int food_seq) {
		this.food_seq = food_seq;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCook_time() {
		return cook_time;
	}
	public void setCook_time(int cook_time) {
		this.cook_time = cook_time;
	}
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public String getAllergy() {
		return allergy;
	}
	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}
	public int getOrder_quantity() {
		return order_quantity;
	}
	public void setOrder_quantity(int order_quantity) {
		this.order_quantity = order_quantity;
	}
}
