package com.yedam.app.spring.javabase;

public class NHCard implements Card {
	private User oner; // 소유자
	private int payAmount; // 결제대금
	
	NHCard(User oner){
		this.oner = oner;
		this.payAmount = 0;
	}

	@Override
	public void showOnerInfo() {
		System.out.println(oner);
	}

	@Override
	public void payment(int pay) {
		System.out.printf("결제금액 : %d\n", pay);
		this.payAmount += pay;
		System.out.printf("결제예상일 : 15일 \n 결제대금 : %d\n", this.payAmount);
	}

	@Override
	public void addServices() {
		System.out.println("농협카드 부가기능");
	}

}
