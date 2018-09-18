package com.game.model;

import com.game.constants.CellType;

public class LotteryCell implements Cell {

	private Integer cellIndex;

	public LotteryCell(Integer cellIndex) {
		super();
		this.cellIndex = cellIndex;
	}

	@Override
	public CellType getCellType() {
		return CellType.LOTTERY;
	}

	@Override
	public Player ownedBy() {
		return null;
	}

	@Override
	public void setOwnedBy(Player player) {

	}

	@Override
	public Integer getCellIndex() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player getOwnedBy() {
		// TODO Auto-generated method stub
		return null;
	}

}
