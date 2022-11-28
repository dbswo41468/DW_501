package cafe.VO;

public class wallet {
	private int num;
	private int now_money; // 현재 금액
	private int used; // 사용 금액
	private int point; // 포인트 점수
	private String use_datail; // 이용 내역
	
	public wallet() {}
	public wallet(int num, int now_money, int used, int point, 
			String use_datail) {
		
		this.num = num;
		this.now_money = now_money;
		this.used = used;
		this.point = point;
		this.use_datail = use_datail;
		
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNow_money() {
		return now_money;
	}
	public void setNow_money(int now_money) {
		this.now_money = now_money;
	}
	public int getUsde() {
		return used;
	}
	public void setUsde(int usde) {
		this.used = usde;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getUse_datail() {
		return use_datail;
	}
	public void setUse_datail(String use_datail) {
		this.use_datail = use_datail;
	}
	
	
}
