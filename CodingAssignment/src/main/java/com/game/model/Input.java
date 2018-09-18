package com.game.model;

public class Input {

	private String playerName;
	private Integer cellValue;

	public Input(String playerName, Integer cellValue) {
		super();
		this.playerName = playerName;
		this.cellValue = cellValue;
	}

	public String getPlayerName() {
		return playerName;
	}

	public Integer getCellValue() {
		return cellValue;
	}

}
