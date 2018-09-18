package com.game.model;

import com.game.constants.CellType;

public class JailCell implements Cell {

	private Integer cellIndex;

	public JailCell(Integer cellIndex) {
		super();
		this.cellIndex = cellIndex;
	}

	@Override
	public CellType getCellType() {
		return CellType.JAIL;
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
