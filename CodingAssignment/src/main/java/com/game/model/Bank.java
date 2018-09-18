package com.game.model;

public class Bank {
	private Integer amount;

	public Bank(Integer amount) {
		super();
		this.amount = amount;
	}

	public Integer addMout(Integer newAmount) {
		amount = amount + newAmount;
		return amount;
	}

	public Integer subStractAmount(Integer newAmount) {
		amount = amount - newAmount;
		return amount;
	}

}
