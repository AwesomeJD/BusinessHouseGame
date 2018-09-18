package com.game.context;

import java.util.List;
import java.util.Map;

import com.game.constants.Constants;
import com.game.model.Bank;
import com.game.model.Cell;
import com.game.model.Player;

public class GameBoard {
	private List<Cell> cells;
	private Map<String, Player> players;
	private Bank bank;

	public GameBoard() {
		super();
		this.bank = new Bank(Constants.INITIAL_BANK_MONEY);
	}

	public List<Cell> getCells() {
		return cells;
	}

	public void setCells(List<Cell> cells) {
		this.cells = cells;
	}

	public void updateCell(Integer index, Cell cell) {
		this.cells.add(index, cell);
	}

	public Map<String, Player> getPlayers() {
		return players;
	}

	public void setPlayers(Map<String, Player> players) {
		this.players = players;
	}

	public void setPlayer(Player player) {
		this.players.put(player.getName(), player);
	}

	public Integer addAmountToBank(Integer amount) {
		return bank.addMout(amount);
	}

	public Integer substractAmountFromBank(Integer amount) {
		return bank.subStractAmount(amount);
	}

}
