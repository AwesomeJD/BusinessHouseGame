package com.game.model;

import com.game.constants.CellType;

public interface Cell {
	
	Integer getCellIndex();

	CellType getCellType();

	Player ownedBy();

	void setOwnedBy(Player player);
	
	Player getOwnedBy();
}
