package com.Day1;

interface Payment{
	void pay1();
}
class Upi implements Payment{

	@Override
	public void pay1() {
		System.out.println("Upi Payment");
		
	}
	
}
class NetBanking implements Payment{

	@Override
	public void pay1() {
		System.out.println("Net Banking Payment");
	}
	
}
class Banking{
	Payment pay;
	
	Banking(Payment pay){
		this.pay = pay;
	}
	
	void Play() {
		pay.pay1();
	}
	
}
public class Aggregation {
	public static void main(String[] args) {
		
		Upi upi = new Upi();
		NetBanking net = new NetBanking();
		Banking bank = new Banking(net);
		
		bank.Play();
	}

}
