package com.game.strategies;

import com.game.constants.Constants;
import com.game.context.Chance;
import com.game.context.GameBoard;
import com.game.model.Player;

public class JailCellStrategy implements CellStrategy {

	private Chance context;
	private GameBoard gameBoard;

	public JailCellStrategy(Chance context, GameBoard gameBoard) {
		super();
		this.context = context;
		this.gameBoard = gameBoard;
	}

	@Override
	public void process() {
		gameBoard.addAmountToBank(Constants.JAIL_FINE_MONEY);
		Player player = context.getPlayer();
		player.subStractAmount(Constants.JAIL_FINE_MONEY);
		player.setLastPoint(player.getLastPoint() + context.getDiceValue());
		gameBoard.setPlayer(player);
		
	}

}
