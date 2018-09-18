package com.game.model;

import com.game.constants.CellType;

public class EmptyCell implements Cell {

	private Integer cellIndex;
	
	public EmptyCell(Integer cellIndex) {
		super();
		this.cellIndex = cellIndex;
	}

	@Override
	public CellType getCellType() {
		return CellType.EMPTY;
	}

	@Override
	public Player ownedBy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOwnedBy(Player player) {
		// TODO Auto-generated method stub
		
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
