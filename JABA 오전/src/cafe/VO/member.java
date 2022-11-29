package cafe.VO;

public class member {
	private String id;
	private String name;
	private String tel;
	private String email;
	private int money;
	private String allergy;
	
	public member() {}
	public member(String id, String name ,String tel, String email, int money, String allergy) {
		this.id=id;
		this.name=name;
		this.tel=tel;
		this.email=email;
		this.money = money;
		this.allergy = allergy;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getAllergy() {
		return allergy;
	}
	public void setAllergy(String alle) {
		this.allergy = alle;
	}
	
	
	
	
	
}