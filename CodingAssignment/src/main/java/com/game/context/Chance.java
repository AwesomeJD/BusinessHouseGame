package com.game.context;

import com.game.model.Cell;
import com.game.model.Player;

public class Chance {

	private Player player;
	private Cell cell;
	private Integer diceValue;

	public Chance(Player player, Cell cell, Integer diceValue) {
		super();
		this.player = player;
		this.cell = cell;
		this.diceValue = diceValue;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Cell getCell() {
		return cell;
	}

	public void setCell(Cell cell) {
		this.cell = cell;
	}

	public Integer getDiceValue() {
		return diceValue;
	}

	public void setDiceValue(Integer diceValue) {
		this.diceValue = diceValue;
	}

}
