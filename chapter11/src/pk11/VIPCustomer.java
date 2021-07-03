package pk11;

public class VIPCustomer extends Customer{

	private int agentID=1;
	double saleRatio;
	
	//전문상담원 agentID
	//10%세일 saleRatio;
	//보너스포인트 bonusRatio;
	
	//생성자 이용(고객의 아이디, 이름,상담원아이디)
	//생성자 이용(등급=VIP,BonusRatio=0.05,saleRatio=0.1%
	public VIPCustomer(int customerID,String customerName,int agentID) {
		super(customerID,customerName);
		this.agentID=agentID;
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	//calcPrice 오버라이딩
	@Override
	public int calcPrice(int price) {
		bonusPoint+=bonusRatio*price;
		return super.calcPrice(price)-(int)(price*saleRatio);
	}
	//return 5000-(5000*0.1) saleRatio활용
	//showCustomerInfo 오버라이딩
	@Override
	public String showCustomerInfo() {
		// 부모클래스의 메서드를 사용하고 상담원 아이디 추가
		return super.showCustomerInfo()+agentID;
	}

	


	//상담원 아이디
	public int getAgentID() {
	return agentID;
	}
}