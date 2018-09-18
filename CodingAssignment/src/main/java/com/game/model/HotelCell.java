package com.game.model;

import com.game.constants.CellType;

public class HotelCell implements Cell {

	private Integer cellIndex;
	private Player player;

	public HotelCell(Integer cellIndex) {
		super();
		this.cellIndex = cellIndex;
	}

	@Override
	public CellType getCellType() {
		return CellType.HOTEL;
	}

	@Override
	public Player ownedBy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOwnedBy(Player player) {
		this.player = player;
	}

	@Override
	public Integer getCellIndex() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player getOwnedBy() {
		return this.player;
	}

}
